package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		int num2 = sc.nextInt();
		System.out.print("+,-,*,/ �� �Է� >> ");
		char op = sc.next().charAt(0);
		System.out.println(cal(num1, num2, op));

	}

	public static int cal(int num1, int num2, char op) {
		if (op == '-') {
			// ���꿡 ���� �۾� ����.
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
