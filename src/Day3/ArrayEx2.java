package Day3;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		/* 배열을 이용하여 학생 5명의 성적을 
		 * 키보드를 통해 입력받고 받은 정수를 출력하는 코드를
		 * 작성하세요*/
		int score[];
		Scanner sc = new Scanner(System.in);
		System.out.print("반의 학생 수를 입력하세요 : ");
		int size = sc.nextInt();
/*		score = new int[size];
		for(int i=0; i<score.length; i++){
			System.out.print((i+1)+"번 학생 성적 : ");
			score[i] = sc.nextInt();
		}
		for(int i=0; i<score.length; i++){
			System.out.println((i+1)+"번 학생 성적 : "+score[i]);
		}
		 학생들의 평균을 구하는 코드를 작성하세요 
		int sum=0, avg=0;
		for(int i = 0; i<score.length;i++){
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.println("반 평균 : "+avg);*/
		
		int score2[][] = new int[size][3];
		String subject[] = {"국어","영어","수학"};
		for(int j=0;j<size;j++){
			for(int i=0;i<3;i++){
				System.out.print((j+1)+"번 학생의 "+subject[i]+"과목의 성적을 입력하세요 : ");
				score2[j][i]=sc.nextInt();
			}
		}
		for(int j=0;j<size;j++){
			System.out.print((j+1)+"번 학생 성적 : ");
			for(int i=0;i<subject.length;i++){
				System.out.print(subject[i]+" 성적 = "+score2[j][i]
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
			System.out.println((i+1)+"번 학생의 평균"+avg[i]);
		}
		for(int j=0;j<avg.length;j++){
			clssum+=avg[j];
		}
		clsavg=clssum/avg.length;
		
		System.out.println("반 총점 = "+clssum);
		System.out.println("반 평균 = "+clsavg);

		sc.close();
	}
}
