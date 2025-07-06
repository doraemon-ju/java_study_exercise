package chapter05;

public class Exercise1 {

	public static void main(String[] args) {
		int sum = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i %5 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("5의 배수의 합계는 " + sum);
//		
		for(int i = 5; i <= 100; i+=5) {
			sum += i;
		}
		System.out.println("5의 배수의 합계는 " + sum);
	}

}
