package Day3;

import java.util.Scanner;

public class ArrayEx3 {
	public static void main(String[] args) {
		/* ������ ����� �迭�� �����ϴ� �ڵ带 �ۼ��ϼ���.
		 * �迭�� 10��¥�����ϰ�, ����� 10�� �̻��� ������
		 * 10�������� ���Ѵ�.
		 * */
//		int div[] = new int[10];
//		int num = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("����� ���� ������ �Է��ϼ��� : ");
//		num = sc.nextInt();
//		int cnt = 0;
//		for(int i=1;i<=num;i++){
//			if(num%i==0){
//				div[cnt]=i;
//				cnt++;
//				
//			}
//		}
//		System.out.print(num+"�� ��� :");
//		for(int i=0; i<cnt; i++){
//			System.out.print(div[i]+" ");
//		}
//		sc.close();
		
		int div2[] = new int[10];
		int i = 0;
		int num2 = 12;
		int cnt = 0;//����� ������ �����ϴ� ����
		i = 1;
		while(i<=num2){
			if(num2 % i==0){
				System.out.print(i+" ");
				div2[cnt]=i;//��� i�� �迭 div�� �����ϴµ�
				cnt++;//��ġ�� ������� ã�� ����� ���������� ����
				//�׸��� ������ �Ŀ��� ����� ������ �ϳ�
				//�����Ѵ�.
				if(cnt==9){
					break;
				}
			}
			i++;
		}
	}
}
