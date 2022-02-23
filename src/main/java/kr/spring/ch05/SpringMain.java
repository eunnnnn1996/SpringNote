package kr.spring.ch05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MemberService member = (MemberService)context.getBean("memberService");
		member.send();
		
		context.close();
	}
}
