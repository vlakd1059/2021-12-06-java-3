package 자바테스트;

import java.util.Scanner;

public class Test01 {
	// 두개의 정수를 매개변수로 받아 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드
	// 나누어 떨어지면 참, 아니면 거짓

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();

		boolean result = individe(num1, num2);
		System.out.println("결과 확인 : " + result);

	}

	public static boolean individe(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
