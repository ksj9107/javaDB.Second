package Day3;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class ArrayEx1 {
	public static void main(String[] args) {
		/* �迭�� �ڷ����� ���� ������ �ϳ��� ���� ������,
		 * ������ ������ �����̾�� �Ѵ�.*/
		int num [] = new int[5];
		/* 1. �迭�� ���� �ݺ����� �̿��ϱ� ���ϴ�.
		 * 2. �迭�� ���� �������� ���ؼ��� �迭�� �ε�����
		 * 	   ������ �����ϴµ� �ε����� ���۹����� 0�����̴�.
		 * */
		for(int i=0;i<num.length; i++){
			num[i] = i+1;
		}
		for(int i=0;i<num.length; i++){
			System.out.println("num["+i+"] : "+num[i]);
		}
		int []num1,num3;
		//int[]�� �������� �Ǿ� num1, num3�� �迭�̵�
		int num2[],num4;
		//int�� �������� �Ǿ� num2�� �迭, num4�� ��������
		num1 = new int[3];//���߿� �Ҵ��� �� ����(�����ϰ� �ٷ� �Ҵ����� �ʾƵ���)
		
		/* num1 : �迭
		 * num2 : �迭
		 * num3 : �迭
		 * num4 : ����
		 * */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if(size >= 0)
			num2 = new int[size];
		sc.close();
		
		int num5[] = {1,2,3,4,5};
		for(int i=0;i<num5.length; i++){
			num5[i] = i+1;
		}
		for(int i=0;i<num5.length; i++){
			System.out.println("num5["+i+"] : "+num5[i]);
		}
		int num6[];
		//num6[] = {1,2,3,4,5} : �ʱ�ȭ�� �迭�� ������ ������ ����
	}
}
