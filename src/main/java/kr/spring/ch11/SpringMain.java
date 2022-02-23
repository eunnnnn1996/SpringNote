package kr.spring.ch11;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		ProtocolHandlerFactory protocol = 
				(ProtocolHandlerFactory)context.getBean("protocolHandlerFactory");
		System.out.println("protocol");
				
		
		context.close();
	}

}