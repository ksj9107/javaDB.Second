package Day2;

public class ForEx3 {
	public static void main(String[] args) {
		// ���Կ��� ���� ���꿡�� �׻� ������ �ʱ�ȭ ���־����
		/* �� ���� �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ִ� ����� : �� ���� ����� �� ���� ū ��
		 * ����� : �� ���� ��� �� ������ ���
		 * ��� : ������ �������� ���� 4�� ����� 1, 2, 4
		 * 8�� 12�� �ִ� �����
		 * 8 : 1, 2, 4, 8
		 * 12: 1, 2, 3, 4, 6, 12
		 * 8�� 12�� ����� : 1, 2, 4
		 * 8�� 12�� �ִ� ����� : 4
		 * 
		 * */
		
		int num1 = 30;
		int num2 = 36;
		int gcd = 0;
		System.out.print(num1+"�� "+num2+"�� ����� :");
		gcd = 0;
		for(int i = 1; i <= num1; i++){
			if(num1 % i == 0 && num2 % i ==0){
				System.out.print(i+" ");
				gcd = i;
			}
		}
		
		System.out.println("");
		System.out.println(num1+"�� "+num2+"�� �ִ����� : "+gcd);

		/* 234�� ����� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 */
		int num = 234;
		System.out.print(num+"�� ��� : ");
		for(int i = 1; i<= num; i++){
			if(234 % i == 0){
				System.out.print(i+" ");
			}
		}
	}
}
