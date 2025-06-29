package chapter04;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// 6번문제
		
		Scanner scan = new Scanner(System.in);
		String name = "";

		int age = 0;
		int height = 0;
		boolean parent = true;
		boolean heartDease = true;
		
		System.out.println("*************************************");
		System.out.println("\t놀이기구 탑승 전 유의사항");
		System.out.println("*************************************");
		
		System.out.print("이름 > ");
		name = scan.next();
		
		System.out.print("나이 > ");
		age = scan.nextInt();
		
		System.out.print("키 > ");
		height = scan.nextInt();
		
		System.out.print("부모 동반 여부(O : 1, X : 0) > ");
		parent = (scan.nextInt() == 1) ? true : false ;
		
		System.out.print("심장질환 유무(유 : 1, 무 : 0) > ");
		heartDease = (scan.nextInt() == 1) ? true : false;
		
		String result = (((age>=6 && height >= 120) || (age<6 && height >= 120 && parent == true)) && heartDease == false) ? "탑승가능!" : "탑승 불가능..";
		System.out.println("결과 : " + result);
	}

}
