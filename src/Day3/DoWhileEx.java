package Day3;

import java.util.Scanner;

public class DoWhileEx {
	public static void main(String[] args) {
		char mode = 'q';
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("�޴�");
			System.out.println("1. �л������߰�");
			System.out.println("2. �л��������");
			System.out.println("q. ���α׷� ����");
			System.out.println("�޴��� �����ϼ���.");
			mode = sc.next().charAt(0);
		}while(mode != 'q');
		sc.close();
	}
}
