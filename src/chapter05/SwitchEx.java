package chapter05;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		int number = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호를 입력하시오 > ");
		number = scan.nextInt();
		
		switch (number) {
		case 1 : 
			System.out.println("1번");
			break;
		case 2 :
			System.out.println("2번");
			break;
		case 3 :
			System.out.println("3번");
			break;
		case 4 : 
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default : 
			System.out.println("6번");
		}

	}

}
