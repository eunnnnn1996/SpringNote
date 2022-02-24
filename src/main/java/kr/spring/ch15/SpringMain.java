package kr.spring.ch15;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//프로퍼티 타입을 이용한 의존 관계 자동설정 (타입 의존성 주입시 같은 타입이 있으면 중복되어짐)
		SystemMonitor monitor = (SystemMonitor)context.getBean("systemMonitor");
		System.out.println(monitor);
		
		context.close();
	}

}
