package Day3;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		/* �迭�� �̿��Ͽ� �л� 5���� ������ 
		 * Ű���带 ���� �Է¹ް� ���� ������ ����ϴ� �ڵ带
		 * �ۼ��ϼ���*/
		int score[];
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �л� ���� �Է��ϼ��� : ");
		int size = sc.nextInt();
/*		score = new int[size];
		for(int i=0; i<score.length; i++){
			System.out.print((i+1)+"�� �л� ���� : ");
			score[i] = sc.nextInt();
		}
		for(int i=0; i<score.length; i++){
			System.out.println((i+1)+"�� �л� ���� : "+score[i]);
		}
		 �л����� ����� ���ϴ� �ڵ带 �ۼ��ϼ��� 
		int sum=0, avg=0;
		for(int i = 0; i<score.length;i++){
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.println("�� ��� : "+avg);*/
		
		int score2[][] = new int[size][3];
		String subject[] = {"����","����","����"};
		for(int j=0;j<size;j++){
			for(int i=0;i<3;i++){
				System.out.print((j+1)+"�� �л��� "+subject[i]+"������ ������ �Է��ϼ��� : ");
				score2[j][i]=sc.nextInt();
			}
		}
		for(int j=0;j<size;j++){
			System.out.print((j+1)+"�� �л� ���� : ");
			for(int i=0;i<subject.length;i++){
				System.out.print(subject[i]+" ���� = "+score2[j][i]
								+"   ");
			}
			System.out.println();
		}
		double sum=0, clssum=0, clsavg=0;
		double avg[] = new double[size];
		for(int j=0;j<size;j++){
			sum=0;
			for(int i=0;i<3;i++){
				sum += score2[j][i];
			}
			avg[j]=sum/subject.length;
		}
		for(int i=0; i<avg.length;i++){
			System.out.println((i+1)+"�� �л��� ���"+avg[i]);
		}
		for(int j=0;j<avg.length;j++){
			clssum+=avg[j];
		}
		clsavg=clssum/avg.length;
		
		System.out.println("�� ���� = "+clssum);
		System.out.println("�� ��� = "+clsavg);

		sc.close();
	}
}
