package kr.spring.ch01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
	/* MessageBean bean = new MessageBean(); */
	//applicationContext.xml 설정파일을 읽어들여 스프링 컨터에너를 생성
	AbstractApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//객체를 컨테이너로 부터 읽어옴
	MessageBean messageBean = (MessageBean)context.getBean("messageBean");
	messageBean.sayHello("장영실");
	
	//어플리케이션 종료시 컨테이너에 존재하는 모든 빈(객체)를 종료
	context.close();
	}
}