package Day2;

public class ifex2 {
	public static void main(String[] args) {
		
		/* ������ Ȧ������ ¦������ �Ǻ��ϴ� �ڵ带
		 * if���� �̿��Ͽ� �ۼ�
		 */
		
		int num1 = 11;
		
		if(num1 % 2 == 0){
			System.out.println(num1 + "�� ¦���Դϴ�.");
		}else if(num1 % 2 == 1){
			System.out.println(num1 + "�� Ȧ���Դϴ�.");
		}else{
			System.out.println("�����̰ų� �߸� �Է��ϼ̽��ϴ�.");
		}
	}
}