package Day5;

import java.util.Scanner;

public class methodEx1 {
	/* �޼ҵ� : Ư�� ����� �ϵ��� ��Ƴ��� �ڵ�
	 * �޼Ҵ��� �Է�(�Ķ����)�� ���(����Ÿ��)�� �ʿ��ϴ�.
	 * ��, ��Ȳ�� ���� �Է°� ����� �ʿ���� �����ִ�.
	 * ����������(public) static ���(void) �޼ҵ��̸�(main)(�Ű�������(String[] args){
	 * 		����;
	 * }
	 * ex)
	 * ���(�޼���) : ���Ǳ�
	 * �Է�(�Ű�����) : ��, ���ø޴�
	 * ���(����Ÿ��) : ���õ� �����
	 * */
	public static void main(String[] args) {//������ �ֿܼ��� ����ϱ� ���� �� �ʿ��� �޼ҵ�
	/* �� ���� �����ڰ� �־����� �� ��������� �ϴ� �ڵ带 �ۼ��ϼ���. */
		Scanner sc = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("����2�� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		System.out.print("���ϰ����ϴ� ������ �Է��ϼ��� : ");
		char op = sc.next().charAt(0);
		double result = 0.0;
		
		result = operate(num1,num2,op);
		System.out.printf("%d %s %d = %g \n",num1,op,num2,result);
		System.out.println(""+num1+ op+num2+" = "+result);
		sc.close();
	}
	public static double operate(int num1, int num2, char op){
		double res = 0.0;
		if(op == '+'){
			res = num1 + num2;
		}else if (op == '-') {
			res = num1-num2;
		}else if(op == '*') {
			res = num1 * num2;
		}else if(op == '/'){
			res = (double)num1 / num2;
		}else{
			System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�");
		}
		return res;
	}
}
