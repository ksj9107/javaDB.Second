package Day3;

import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		int i=1;//�ʱ�ȭ
		while(i<=5){//���ǽ�
			System.out.println("Hello world!");//���๮
			i++;//��������
		}
		//ǥ���Է� ���
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("num = "+num);
		double num2 = scan.nextDouble();
		System.out.println("num2 = "+num2);
		char ch = scan.next().charAt(0);
		System.out.println("ch = "+ch);
		scan.close();*/
		Scanner scan = new Scanner(System.in);
		char mode = 'a';
		while(!(mode == 'q' || mode == 'Q')){
			System.out.print("���α׷��� �����Ϸ��� 'q'�Ǵ� 'Q'�� �����ּ���");
			mode = scan.next().charAt(0);
		}
		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
	}
}
