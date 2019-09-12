package com.sakha.MavenProjectMobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Idea implements Sim {
  
	@Value("${internetSpeed}")
    int internetSpeed;
    float callCharge;
    float smsCharge;
    
    
    
    public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, Integer> getSupportedNetwork() {
		return supportedNetwork;
	}

	public void setSupportedNetwork(Map<String, Integer> supportedNetwork) {
		this.supportedNetwork = supportedNetwork;
	}

	public MessageGateway getMg() {
		return mg;
	}

	public void setMg(MessageGateway mg) {
		this.mg = mg;
	}

	
	@Autowired
	MessageGateway mg;
	List<String> list = new ArrayList();
    Map<String,Integer> supportedNetwork=new HashMap();
	
	public Idea() {
		System.out.println("Idea sim is initialized....");
	}

	

	public Idea(int internetSpeed, float callCharge, float smsCharge, List<String> list,
			Map<String, Integer> supportedNetwork, MessageGateway mg) {
		super();
		this.internetSpeed = internetSpeed;
		this.callCharge = callCharge;
		this.smsCharge = smsCharge;
		this.list = list;
		this.supportedNetwork = supportedNetwork;
		this.mg = mg;
	}

	public int getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(int internetSpeed) {
		this.internetSpeed = internetSpeed;
	}

	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}

	public float getSmsCharge() {
		return smsCharge;
	}

	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}

	
	public void browser() {
		
		System.out.println("browsing via Idea...speed"+internetSpeed+"/hour");
	}

	public void call() {
		System.out.println("calling via Idea charges" +callCharge+ "/min");

	}
	public void sendSms1()
	{
		System.out.println("send sms via idea charges" +smsCharge+"/1msg");
	}

	public void sendSms() {
		
		//System.out.println("send sms via Idea charge = Rs"+smsCharge+"/1msg");
		mg.sendSms();

	}
	
	public void sendMms()
	{
		mg.sendMms();
	}

	public void supportNetworks() {
		
		System.out.println(list);
	}

	@Override
	public void showSupportNetworks() {
		System.out.println("support networks are :");
		supportedNetwork.forEach((k,v)-> System.out.println("Net type..." +k+ "year interduced....." +v));
		
	}
	

}
