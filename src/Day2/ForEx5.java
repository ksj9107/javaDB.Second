package Day2;

import java.util.Scanner;

public class ForEx5 {
	public static void main(String[] args) {
		/* ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���
		 * �Ҽ��� ����� 1�� �ڱ��ڽŻ��� ��
		 * 2, 3, 5, 7, 11, 13, 17...
		 * => ��� 1 : ����� 2��
		 * => ��� 2 : �ڱ� �ڽ��� ���� ó������ ���� ����� 1�̸� �Ҽ�
		 * ���1
		 * 1. ������ ������ ���� num�� ����� ������ ������ ����
		 *	  cnt�� �ݺ��� ���� i�� ���� �� �ʱ�ȭ
		 * 2. i�� 1���� num���� �ϳ��� �����ϸ鼭 �ݺ�
		 * 3. i�� num�� ����̸� ����� ���� 1�� ����
		 * 4. �ݺ����� ����� �� ����� ������ 2���̸� �Ҽ�
		 * 	   �ƴϸ� �ռ����� ���	  
		 * ���2
		 * 2. i�� num-1���� 1���� �ϳ��� �����ϸ鼭 �ݺ�
		 * */
		Scanner sc = new Scanner(System.in);
		
		
		int i = 0, j =0;
		int cnt = 0;
		
		System.out.print("100������ �Ҽ� : ");
		for(i = 1; i<=100; i++){
			cnt = 0;
			for(j = 1; j<=i; j++){
				if(i % j == 0){
					cnt++;
				}
			}
			if(cnt == 2){
				System.out.print(i+" ");
			}
		}
		
		//���1
		System.out.println();
		System.out.println();
		System.out.print("�Ҽ����� �Ǻ��� ���ڸ� �Է��ϼ��� :");
		int num = sc.nextInt();
		cnt = 0;
		for(i = 1; i <= num; i++){
			if(num % i == 0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.println(num+"��(��) �Ҽ� �Դϴ�.");
		}else{
			System.out.println(num+"��(��) �ռ��� �Դϴ�.");
		}
		
		//���2
		cnt=0;
		for(i = num-1; i >= 1; i--){
			if(num % i == 0){
				break;
			}
		}
		if(i == 1){
			System.out.println(num+"��(��) �Ҽ� �Դϴ�.");
		}else{
			System.out.println(num+"��(��) �ռ��� �Դϴ�.");
		}
	}
}
