package chapter05;

import java.util.Scanner;

public class SwitchExStr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String addr = "";
		System.out.print("당신의 집은? > ");
		addr = scan.next();
		
		switch(addr) {
		case "서울" : 
			System.out.println("저의 집은 서울입니다!");
			break;
		case "부산" : 
			System.out.println("저의 집은 부산입니다!");
			break;
		default : 
				System.out.println("저의 집은 없습니다!");
			
		}
			

	}

}
