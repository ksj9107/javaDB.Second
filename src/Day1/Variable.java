package Day1;

public class Variable {
	public static void main(String[] args) {
		//���� ���� ��Ģ
//		int 1num; // ������ ó������ ���ڰ� �� �� ����
//		int num%  // Ư�����ڴ� $��_�� ����
//		int int;  // Ű����� ��� �Ұ�
//		int    ;  // ���� ��� �Ұ�
		int num; 
//		int num;  // ������ ������ ����Ұ�
		int Num;  // ��ҹ��� �����Ͽ� �ٸ� ���ڷ� ���
		//���� ���� ����
		int studentScore; 
		/*  2���� �ܾ� �̻����� �������� ������
		 *  �ι�° �ܾ� ù ���ڸ� �빮�ڷ� �Ѵ� - ī�� ǥ���*/
		int a; // (x)
		/* ������ �������� ����
		 * �ش��ϴ� ������ �� �� �־���Ѵ�*/
		
		//������ ���� Ȯ�� ����
		num = 10;
		// 10 = num(x)
		// 10 : 10 * 1 + 1 * 0 = 10
		System.out.println("num = 10 : "+num);
		num = 0x11;
		// 0x11 : 16 * 1 + 1 * 1 = 17
		System.out.println("num = 0x11 : "+num);
		num = 012;
		//012 : 8 * 1 + 1 * 2 = 10
		System.out.println("num = 012 : "+num);
		//�Ǽ��� ���� Ȯ�� ����
		double num2 = 1.234;
		System.out.println("num2 = 1.234 : "+num2);
		num2 = 1.234e3;
		System.out.println("num2 = 1.234e3 : "+num2);
		//������ ���� Ȯ�� ����
		char ch = 'A';
		System.out.println("ch = 'A' : "+ch);
		ch = '��';
		System.out.println("ch = '��' : "+ch);

		//boolean ���� Ȯ�� ����
		boolean isTrue = false;
		System.out.println("isTrue = false :"+isTrue);
		isTrue = true;
		System.out.println("isTrue = true :"+isTrue);

	}
}
