package com.sakha.MavenProjectMobile;

import org.springframework.stereotype.Component;


public interface Sim {
	
	void browser();
	void call();
	void sendSms1();
	void sendSms();
	void sendMms();
	void supportNetworks();
    void showSupportNetworks();
    void setCallCharge(float callCharge);

}
