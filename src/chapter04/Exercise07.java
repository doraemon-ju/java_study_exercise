package chapter04;

/*
 * 10의 자리 이하를 버리는 코드 작성하기
 * 100으로 일단 나눈 뒤 100을 다시 곱하면 됨
 * 100으로 나누면 소수점이 생기는데 int이기 때문에 자동으로 소수점이 탈락 됨
 * 이후 소수점이 탈락된 채로 100을 다시 곱하게 되면 10의자리 이하는 버려진 채로 숫자가 나오게됨
 */

public class Exercise07 {

	public static void main(String[] args) {
		int number = 1234;
		int result = number / 100 * 100;
		
		System.out.println(result);

	}

}
