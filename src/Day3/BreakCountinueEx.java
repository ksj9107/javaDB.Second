package Day3;

import java.util.Scanner;

public class BreakCountinueEx {
	public static void main(String[] args) {
      /*System.out.println("break�� ����");
		for(int j = 1; j<=5; j++){	
			for(int i = 1; i<=5; i++){
				System.out.println("j="+j+"i="+i);
				if(i==4){
					break;
				}
			}
		}	
		System.out.println("continue�� ����");
		for(int j = 1; j<=5; j++){	
			for(int i = 1; i<=5; i++){
				if(i==4){
					continue;  skip�� ���� �ǹ� 
								: i�� 4�̸� �Ʒ��� ���๮���� �������� �ٷ� ���� ������������ �Ѿ��
								
				}
				System.out.println("j="+j+"i="+i);
			}
		}
		System.out.println("�̸��� �ִ� for�� break�� ����");
		Test://for���� �̸��� ��
		for(int j = 1; j<=5; j++){	
			for(int i = 1; i<=5; i++){
				System.out.println("j="+j+"i="+i);
				if(i==4){
					break Test;//�ش� �̸��� for�� ������ ��������
				}
			}
		}	*/

		
		/* 1���� 100���� ¦���� ���� continue���� ����Ͽ� �ۼ��ϼ���*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num1; i++){
			/*
			 * if(i%2==0)
			 * 		sum += i;
			 * */
			if(i%2==1){
				continue;	
			}
			sum += i;
		}
		System.out.println("1���� "+num1+"���� ¦���� �� : "+sum);
		sc.close();
	}
}
