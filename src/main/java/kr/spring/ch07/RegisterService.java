package kr.spring.ch07;

public class RegisterService {
	private RegisterDAO registerDAO;
	
	//의존 관계 설정 방식 : 프로퍼티, applicationContext2.xml에 명시함
	public void setRegisterDAO(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}
	
	public void write() {
		System.out.println("RegisterService의 write() 메서드 실행");
		registerDAO.insert();
	}
}
