package Day2;

public class switchEx1 {
	public static void main(String[] args) {
		
////		switch(����){
//		case �� 1: // if(���� == ��1)
//			���๮;
//			//break�� ������ �������� ��1 �� �� ���๮1��
//			//�����ϰ�, ������ �������� ��1 �� �� ���๮ 1��
//			//���๮ 2�� ���� �����
//			break;
//		case �� 2: // else if(���� == ��2)
//			���๮2;
//			break;
//		default: // else
//			���๮3;
//		}
		
		/*num�� ���� 0�̸� �ֿܼ� 0�Դϴ�. ��� ����ϰ�
		 *num�� ���� 1�̸� �ֿܼ� 1�Դϴ�. ��� ����ϰ�
		 *num�� ���� 0�� 1�� �ƴ϶�� �ֿܼ� 0�� 1�� �ƴմϴ�.
		 *��� ����ϴ� ����*/
		int num = 2;
		
		switch(num){
		case 0:
			System.out.println("0�Դϴ�.");
			break;
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		default:
			System.out.println(num+"�� 0�� 1�� �ƴմϴ�.");
		}
		
	}
}
