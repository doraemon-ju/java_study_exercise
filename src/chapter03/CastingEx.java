package chapter03;

/*
 * byte < short < int < long < float < double
 * 작은자료형 <-----------------------> 큰 자료형
 */

public class CastingEx {

	public static void main(String[] args) {
		// 자동 형변환
		int number = 51;
		long number2 = number;
		System.out.println(number);
		System.out.println(number2);
		
		// 강제 형변환
		double no = 3.1415;
		int no2 = (int)no;
		System.out.println(no);
		System.out.println(no2);
		
		
		// 데이터 유실 없는 강제 형변환 -> double의 자료형이지만 값이 int에도 포함되는 값이기 때문에 출력 형태만 바뀌게됨
		double a = 100;
		int a2 = (int)a;
		System.out.println(a);
		System.out.println(a2);
	}

}
