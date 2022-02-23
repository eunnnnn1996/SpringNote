package kr.spring.ch04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스프링컨테이너 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//컨테이너에 DI 생성자 설정 방식으로 생성된 객체를 읽어옴
		WriteArticleService articleService = 
				(WriteArticleService)context.getBean("writeArticleService");
		articleService.write();
		context.close();
	}

}
