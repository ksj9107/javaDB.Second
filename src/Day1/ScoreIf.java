package Day1;

import java.util.Scanner;

public class ScoreIf {
	public static void main(String[] args) {
		/*
		 * �����ε� ������ �������� ����ϼ���.
		 * 0~59  : F
		 * 60~69 : D
		 * 70~79 : C
		 * 80~89 : B
		 * 90~100: A
		 */
			int score = 100;
			
			if(score >=0 && score <=59){
				System.out.println("������ F�Դϴ�.");
			}else if(score >= 60 && score < 70){
				System.out.println("������ D�Դϴ�.");
			}else if(score >= 70 && score < 80){
				System.out.println("������ C�Դϴ�.");
			}else if(score >= 80 && score < 90){
				System.out.println("������ B�Դϴ�.");
			}else if(score >= 90 && score <= 100){
				System.out.println("������ A�Դϴ�.");
			}else{
				System.out.println("�����Է��� �߸� �Ǿ����ϴ�.");
			}	
	}
}
