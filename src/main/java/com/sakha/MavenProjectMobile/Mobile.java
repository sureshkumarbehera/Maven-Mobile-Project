package com.sakha.MavenProjectMobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {


	@Autowired
	@Qualifier("airtel")
	Sim sim;
	
	
	public Mobile(Sim sim) {
		super();
		this.sim = sim;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	
	
	public void makeACall()
	{
		sim.call();
	}
	public void browseInternet()
	{
		sim.browser();
	}
	public void sendASms()
	{
		sim.sendSms1();
	}
	
    public void sendSms()
    {
    	sim.sendSms();
    }
    public void sendMms()
    {
    	sim.sendMms();
    }
		public  Mobile() {
			System.out.println("mobile is ready");
		}
		
		
		public void supportNetworks()
		{
			sim.supportNetworks();
		}
		
		public void showAllNetworks()
		{
			sim.showSupportNetworks();
		}
		
	}

