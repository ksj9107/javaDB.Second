package Day1;

import java.util.Scanner;

public class ScoreIf {
	public static void main(String[] args) {
		/*
		 * 정수로된 성적을 학점으로 출력하세요.
		 * 0~59  : F
		 * 60~69 : D
		 * 70~79 : C
		 * 80~89 : B
		 * 90~100: A
		 */
			int score = 100;
			
			if(score >=0 && score <=59){
				System.out.println("성적은 F입니다.");
			}else if(score >= 60 && score < 70){
				System.out.println("성적은 D입니다.");
			}else if(score >= 70 && score < 80){
				System.out.println("성적은 C입니다.");
			}else if(score >= 80 && score < 90){
				System.out.println("성적은 B입니다.");
			}else if(score >= 90 && score <= 100){
				System.out.println("성적은 A입니다.");
			}else{
				System.out.println("성적입력이 잘못 되었습니다.");
			}	
	}
}
