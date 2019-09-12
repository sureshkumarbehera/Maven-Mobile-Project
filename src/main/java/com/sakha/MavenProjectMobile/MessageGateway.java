package com.sakha.MavenProjectMobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageGateway {
	
	@Value("${smsCharge}")
	int smsCharge;
	@Value("${mmsCharge}")
	int mmsCharge;
	

	 public MessageGateway() {
		System.out.println("MessageGateway is ready to send msg.....");
	}	
	public MessageGateway(int smsCharge, int mmsCharge) {
		super();
		this.smsCharge = smsCharge;
		this.mmsCharge = mmsCharge;
	}

	public int getSmsCharge() {
		return smsCharge;
	}

	public void setSmsCharge(int smsCharge) {
		this.smsCharge = smsCharge;
	}

	public int getMmsCharge() {
		return mmsCharge;
	}

	public void setMmsCharge(int mmsCharge) {
		this.mmsCharge = mmsCharge;
	}

	public void sendSms()
	{
		System.out.println("send sms via Airtel charge = Rs"+smsCharge+"/1msg");
	}

	public void sendMms()
	{
		System.out.println("send mms via Airtel charge = Rs"+mmsCharge+"/2msg");
	}
}
