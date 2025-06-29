package chapter03;

public class StringEx {

	public static void main(String[] args) {
		// 문자열을 만들 때는 반드시 ""로 감싸야 함
		// 정수, 실수, 논리형도 ""로 감싸면 문자열 자료가 됨!
		
		String name; // 변수선언
		name = "홍길동"; // 변수 초기화
		
		String name2 = "홍길동"; // 선언과 동시에 초기화
		String name3 = null; // null값으로 초기화 -> 값이 없는 것
		String name4 = " "; // " "값으로 초기화 -> 빈 문자열이 저장된 것!
		
		System.out.println("name2 = " + name2);
		System.out.println("name3 = " + name3);
		System.out.println("name4 = " + name4);
	
	}

}
