package Day3;

public class LoopEx {
	public static void main(String[] args) {
		// ���ѷ����� �����Ǵ� ���
		
		/* 1. ���� �⺻���� ���ѷ��� ����� ��*/
		/*for( ; ; ){
			System.out.println("Hello world!");
		}*/
		/* 2. �߸��� �ʱ�ȭ�� ���� �ݹ��ѷ��� */
		/*int i = 1;
		for(i=-1000000000;i<=10;i++){
			System.out.println("Hello World!");
		}*/
		/* 3. �߸��� ���ǽ����� ���� �ݹ��ѷ��� */
		/*int i = 1;
		for(i=1; i>=1; i++){
			System.out.println("Hello world!");
		}*/
		/* 4. �߸��� ������������ ���� ���� ���� */
		/*int i = 1;
		for(i=1;i<=10; ){
			System.out.println("Hello world");
		}*/
		/* 5. �߸��� ������������ ���� �ݹ��� ���� */
		/*int i = 1;
		for(i=1;i<=10;i-- ){
			System.out.println("Hello world");
		}*/
		
		// �ݺ��� ������ �ѹ��� �ȵǴ� ���
		/* 1. ���� �ʱ�ȭ�� �߸��� ��� */
		/*for(int i=11 ;i<=10 ;i++ ){
			System.out.println("Hello world!");
		}*/
		/* 2. ���� �ʱ�ȭ�� ���� ���� ���*/
		/*int i =0;
		for(i=1;i<=10;i++){
			System.out.println("Hello world");
		}
		for(;i<=10;i++){
			System.out.println("Hello world1");
		}*/
		/* 3. ���ǽ��� �߸��� ��� */
		for(int i = 1;i>=10;i++){
			System.out.println("Hello world");
		}
	}
}
