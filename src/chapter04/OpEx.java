package chapter04;

/*
 * 대입은 = 기준으로 오른쪽 값을 왼쪽의 변수에 대입한다 
 */

public class OpEx {

	public static void main(String[] args) {
		// 대입연산
		int number1 = 100;
		System.out.println("number1 = 10 -> " + number1 );
		
		number1 += 10;
		number1 += 10;
		System.out.println("number1 += 10 -> " + number1 ); // 100+10+10 = 120
		number1 -= 10;
		System.out.println("number1 -= 10 -> " + number1 ); // 120-10 = 110
		number1 *= 2;
		System.out.println("number1 *= 10 -> " + number1 ); // 110*2 = 220
		number1 /= 2;
		System.out.println("number1 /= 10 -> " + number1 ); // 220/2 = 110
		number1 %= 3;
		System.out.println("number1 %= 10 -> " + number1 ); // 110을 3으로 나눈 뒤 나온 나머지 = 2
		
		// 산술연산 - boolean을 제외한 모든 기본 자료형의 연산이 가능
		//			자바에서는 정수와 정수의 연산 결과는 항상 정수! (int +-*/ int = int(정수))
		//			실수값이 나오게 하고 싶다면 변수 중 하나 이상이 실수여야 함 (double +-*/ int = double(실수)로 출력 가능)
		int a = 5+5;
		System.out.println("\n5 + 5 = " + a);
		
		int b = a - 5;
		System.out.println("10 - 5 = " + b);
		
		int c = b * 2;
		System.out.println("5 * 2 = " + c);
		
		int d = c / 5;
		System.out.println("10 / 5 = " + d);
		
		int e = 10 % 3;
		System.out.println("10 % 3 = " + e);
		
		// 증감연산
		// ++, --
		// 전위연산 : ++변수명 / --변수명 -> 먼저 변수에 1 증가/감소 후 다른 연산 실행
		// 후위연산 : 변수명++/ 변수명-- -> 다른 연산 실행 후 변수에 1 증가/감소
		
		int A = 10;
		int B = ++A;
		
		System.out.println("\n전위연산 결과 : " + B);
		
		int x = 10;
		int y = x++;
		
		System.out.println("후위연산 결과 : " + y);
		System.out.println("x : " + x + "\n");
		
		// 비교연산
		// >, >=, <, <=, ==, !=
		// 결과값은 true / false 둘 중 하나로 나옴
		// 모든 종류 데이터에 사용 가능
		
		int f = 10;
		int g = 5;
		
		System.out.println(f>g);
		System.out.println(f>=g);
		System.out.println(f<g);
		System.out.println(f<=g);
		System.out.println(f==g);
		System.out.println(f!=g);
		// 결과값이 boolean 연산자이므로 이 연산의 결과 역시 boolean 자료형 변수에 대입 가능
		
		boolean h = f==g;
		System.out.println("h = " + h);
		boolean i = h==false;
		System.out.println("i = " + i + "\n");
		
		// 논리연산
		// AND(&&), OR(||), NOT(!)
		// boolean 자료형만 가능
		
		int C = 10;
		int D = 5;
		
		// AND연산 : 왼쪽항과 오른쪽항이 모두 true인 경우에만 결과값이 true
		System.out.println(C > D && C == 10);
		System.out.println(C > D && C == D);
		
		// OR연산 : 왼쪽항과 오른쪽항 중 하나 이상이 true인 경우에 결과값이 true
		System.out.println(C > D || C == D);
		System.out.println(C < D || C == D);
		
		// NOT연산 : 결과값이 반대의 값으로 나옴 (true면 false, false면 true)
		System.out.println(!(C > D));
		System.out.println(!(C < D));
		
		
		// 삼항연산
		// if문을 이용한 조건문과 동일한 역할
		// 조건식 ? 값1(연산식) : 값2(연산식)
		// 조건이 true인 경우 값1 출력, false인 경우 값2 출력
		
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println("\n" + pass);
		
		
		
		
		
		

	}
	
}
