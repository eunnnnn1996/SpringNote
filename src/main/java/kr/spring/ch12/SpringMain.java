package kr.spring.ch12;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.spring.ch11.ProtocolHandlerFactory;
	
	public class SpringMain {
		public static void main(String[] args) {
			
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		VideoClient video = (VideoClient)context.getBean("videoClient");
		
				
		
		context.close();
}
}