package chapter04;

/*
 * [윤년 조건]
 * 1. 연도가 4로 나누어 떨어지면 윤년
 * 2. 100으로 나누어 떨어지는 연도는 윤년이 아님
 * 3. 400으로 나누어 떨어지면 윤년
 */

public class Exercise05 {

	public static void main(String[] args) {

		int year = 2020;
		boolean leapYear = ((year % 4 ==0 && year % 100 != 0) || year % 400 ==0);
				System.out.println(leapYear);
		
	}

}
