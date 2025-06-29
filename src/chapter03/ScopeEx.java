package chapter03;

public class ScopeEx { // 전역변수 (클래스 블럭)
					   // 이 클래스에 존재하는 모든 범위에서 사용 가능
	int no; // 클래스 블럭 안에서 사용 가능한 변수

	public static void main(String[] args) { // 지역변수 (main 메소드 블럭)
											 // 해당하는 중괄호{}안에서만 작동
		String name;// 메인 메소드 블럭 안에서 사용 가능한 변수
		
		if (true) {
			// 메소드 블럭 안에서 선언한 변수 사용 가능
			name = "홍길동";
			
			// if문 블럭 안에서 변수 선언
			String email = "hong@test.com"; 
			email = "hong@test.com"; // if문 밖에서 변수를 사용하면 에러가 뜬다. 자리를 17번줄로 옮기면 제대로 작동함~
		}
	}

}


// !!!!!!!!!!중괄호 안에서 선언된 변수는 중괄호 안에서만 사용 가능하다!!!!!!!!!!