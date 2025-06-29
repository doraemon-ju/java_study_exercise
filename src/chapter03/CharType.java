package chapter03;

public class CharType {
	public static void main(String[] args) {
		/* 
		 * A = 65, a = 97
		 * char -> ''를 사용해서 값을 대입하거나 문자에 해당하는 코드값을 대입
		 * char -> 하나의 문자만 대입 가능. 여러 문자를 대입하기 위해서는 'String' 클래스 사용
		 * char c = 'Hello'; -> 에러
		 * String C = "Hello"; -> 가능!
		 */
		
		char a = 'A';
		System.out.println("a : " + a);
		
		int b = a;
		System.out.println("b : " + b); // 알파벳을 숫자로 변환 (A > 65)
		
		char c = 66;
		System.out.println("c : " + c);// 숫자를 알파벳으로 변환 (66 > B)
		int d = a+b;
		System.out.println("d : " + d);
	}

}
