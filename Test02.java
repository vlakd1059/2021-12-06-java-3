package 자바테스트;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		System.out.print("+,-,*,/ 중 입력 >> ");
		char op = sc.next().charAt(0);
		System.out.println(cal(num1, num2, op));

	}

	public static int cal(int num1, int num2, char op) {
		if (op == '-') {
			// 연산에 따른 작업 진행.
			return num1 - num2;
		} else if (op == '+') {
			return num1 + num2;
		} else if (op == '*') {
			return num1 * num2;
		} else if (op == '/') {
			return num1 / num2;
		} else {
			return 0;
		}
	}

}
