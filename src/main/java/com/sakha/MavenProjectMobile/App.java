package com.sakha.MavenProjectMobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class App 
{
    public static void main( String[] args )
    {
        //Mobile m=new Mobile();
        //ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       // Sim sim=(Sim)context.getBean("airtel"); method1(we can type cast class name)
      //  m.setSim(sim);
        
      //  Sim sim=context.getBean("airtel", Sim.class);  //method2(other wise we can write class name inside bean)
       // m.setSim(sim);
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	
        Mobile m1=context.getBean("mobile", Mobile.class);
        m1.browseInternet();
        m1.makeACall();
        m1.sendASms();
        m1.sendSms();
        m1.sendMms();
       m1.supportNetworks();
       m1.showAllNetworks();
       m1.getSim().setCallCharge(2.68f);
       
       Mobile m=context.getBean("mobile", Mobile.class);
       m.makeACall();
       
       
      // Sim sim=context.getBean("idea", Sim.class);
        
      /*  
        Mobile m2=context.getBean("mobile1", Mobile.class);
        m2.browseInternet();
        m2.makeACall();
        m2.sendASms();
   */ }
}
