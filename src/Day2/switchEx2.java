package Day2;

public class switchEx2 {
	public static void main(String[] args) {
		/* ���� ch�� a �Ǵ� A�̸� A�Դϴ�. ��� �ֿܼ� ����ϰ�
		 * ���� ch�� b �Ǵ� B�̸� B�Դϴ�. ��� �ֿܼ� ����ϰ�
		 * ���� ch�� a,b,A,B�� �ƴϸ� A�� B�� �ƴմϴ�.
		 * ��� �ֿܼ� ����ϴ� ������ �ۼ��ϼ���.*/
		char ch = 'a';
		
		switch(ch){
		case 'a':// a�Ǵ� A�� ���� �̷��� ǥ������
		case 'A':
			System.out.println("A�Դϴ�.");
			break;
		case 'b':
			System.out.println("B�Դϴ�.");
			break;
		case 'B':
			System.out.println("B�Դϴ�.");
			break;
		default:
			System.out.println("A�� B�� �ƴմϴ�.");
		}
	}
}
