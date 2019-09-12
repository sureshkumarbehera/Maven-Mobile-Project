package com.sakha.MavenProjectMobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Airtel implements Sim {

	
	@Value("${internetSpeed}")
    int internetSpeed;
	@Value("${callCharge}")
    float callCharge;
	@Value("${smsCharge}")
    float smsCharge;
    
    
    /*
	
	public Airtel(int internetSpeed, float callCharge, float smsCharge) {
		super();
		this.internetSpeed = internetSpeed;
		this.callCharge = callCharge;
		this.smsCharge = smsCharge;
	}*/


    @Autowired

	MessageGateway mg;
    
    @Value("${list}")
	List<String> list;
    
	@Value("#{${supportedNetwork}}")
    Map<String,Integer> supportedNetwork;
    
    
    
    
	

	public Airtel(int internetSpeed, float callCharge, float smsCharge, List<String> list,
			Map<String, Integer> supportedNetwork, MessageGateway mg) {
		super();
		this.internetSpeed = internetSpeed;
		this.callCharge = callCharge;
		this.smsCharge = smsCharge;
		this.list = list;
		this.supportedNetwork = supportedNetwork;
		this.mg = mg;
	}

	public MessageGateway getMg() {
		return mg;
	}

	public void setMg(MessageGateway mg) {
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
	
		System.out.println("browsing via Airtel...speed" +internetSpeed+ "/hour");

	}

	public void call() {
		
		System.out.println("calling via Airtel charges" +callCharge+"/min");

	}

	public void sendSms1()
	{
		System.out.println("send sms via Airtel charges" +smsCharge+"/1msg");
	}
	public void sendSms() {
	
		mg.sendSms();
			
	}
	public void sendMms()
	{
		mg.sendMms();
	}
	
	public Airtel() {
		System.out.println("Airtel sim is initialize.....");
	}

	public void supportNetworks() {
		System.out.println(list);
		
	}

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

public void showSupportNetworks() {
	System.out.println("support networks are :");
	//supportedNetwork.forEach((k,v)-> System.out.println("Net type..." +k+ "year interduced....." +v));
	System.out.println(supportedNetwork);
}


	
	
	
}
