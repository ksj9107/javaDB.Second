package Day2;

public class ForEx2 {
	public static void main(String[] args) {
		/* 1���� 10 ���̿� Ȧ���� ����ϴ� �ڵ带
		 * for���� �̿��Ͽ� �ۼ��ϼ���.*/
		
		for(int i = 1; i <= 10; i++){
			if(i % 2 ==1){
				System.out.println(i);
			}
		}
		for(int i = 1; i <= 10 ; i += 2){
			System.out.println(i);
		}
		/* 1���� 10������ ���� ���ϴ� ������ �ۼ��ϼ���. */
		
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			sum += i;					
		}
		System.out.println("sum = "+sum);
		
		/* ������ 7���� ����ϴ� �ڵ带 �ۼ��ϼ���. */
		
		for(int j = 1; j < 10; j++){
			System.out.println("7 x "+j+" = "+7*j);
		}
		System.out.println("");
		System.out.println("");
		
		for(int i = 1; i < 10; i++){
			for(int j =1; j < 10; j++){
				if(i == 7){
					System.out.println(i+" x "+j+" = "+i*j);
				}
			}
		}
		
	}
}
