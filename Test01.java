package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test01 {
	// �ΰ��� ������ �Ű������� �޾� ���� ������ ���� ������ �������������� �Ǻ��ϴ� �޼ҵ�
	// ������ �������� ��, �ƴϸ� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		int num2 = sc.nextInt();

		boolean result = individe(num1, num2);
		System.out.println("��� Ȯ�� : " + result);

	}

	public static boolean individe(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
