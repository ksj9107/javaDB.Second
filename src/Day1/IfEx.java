package Day1;

import com.sun.java_cup.internal.runtime.Scanner;

public class IfEx {

	public static void main(String[] args) {
		/*
		 * if(���ǽ�1){
		 * 		���๮1;//���ǽ�1 �� ���� �� ����
		 * }
		 * else if(���ǽ�2){
		 * 		���๮2;//���ǽ� 1�� ����, ���ǽ� 2�� ���ϰ�� ����
		 *  }
		 * else{
		 * 		���๮3;//���ǽ�1�� ���ǽ� 2�� ������ �� ����
		 * }
		 */
		Scanner scanner;
		
		int num = 0;
		if(num == 0){
			System.out.println(num+"�� ¦���Դϴ�.");;
		} 
		else if(num % 2 == 0){
			System.out.println("0 �Դϴ�.");
		} 
		else{
			System.out.println(num+"�� Ȧ���Դϴ�.");
		}
	}
}
