package Day6;

import java.util.Scanner;

public class Baseballgame {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int min=1,max=9,size=3;
		int uarr[] = null;
		int comarr[] = null;
		int strike = 0;
		boolean end = false;
		
		comarr = generatecom(min, max, size);
		
		while(end == false){
			uarr = generateuser(size);
			strike = compare(uarr, comarr, size);
			if(strike == 3){
				System.out.println("�����Դϴ�.");
				System.out.print("���� ���� : ");
				for(int i=0; i<size; i++){
					System.out.print(comarr[i]+" ");
				}
				end = true;
			}
		}
	}
	/* ��ǻ��  vs �����
	 * ��ǻ�ʹ� ������ ���� : �������� 1~9������ �ߺ�����
	 * �ʴ� ���� 3���� ����
	 * ����� : ��ǻ�Ͱ� ������ ���� 3���� ������ �Բ� ������Ѵ�.
	 * ex)
	 * ��ǻ�� : 1 3 5
	 * ����� : 1 2 3
	 * ��ǻ�� : 1S 1B
	 * ����� : 2 4 8
	 * ��ǻ�� : 3O
	 * ����� : 1 3 5
	 * ��ǻ�� : 3S
	 * �����Դϴ�.
	 * S : �ش� ���ڰ� �ְ� �ش� ������ ��ġ�� ��
	 * B : �ش� ���ڰ� �ְ� �ش� ������ ��ġ���� ���� ��
	 * */
	public static int randomInt(int min, int max){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static int isduplicate(int num, int arr[]){
		int index = -1;
		for(int i=0; i<arr.length; i++){
			if(num==arr[i]){
				index = i;
			}
		}
		return index;
	}
	public static int[] generatecom(int min,int max,int size){
	    int arr[]= new int[size];
	    int tmp = 0;
		for(int i=0; i<size;){
			tmp = randomInt(min, max);
			if(isduplicate(tmp, arr)==-1){
				arr[i]=tmp;
				i++;
			}
		}
		System.out.print("���� ���� : ");
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return arr;
	}
	
	public static int[] generateuser(int size){
	    int tmp = 0;
	    int arr[] = new int[size];
	    
	    System.out.println("1~9 ���� ���� 3���� �Է��ϼ���" );
		for(int i=0; i<size; ){
	    	tmp = sc.nextInt();
	    	if(isduplicate(tmp, arr)==-1){
				arr[i]=tmp;
				i++;
	    	}else{
	    		System.out.println("���ڰ� �ߺ��Ǿ����ϴ�. �ٽ��Է��ϼ���");
	    	}
	    }
		return arr;
	}
	
	public static int compare(int[] arr1,int[] arr2,int size){
		int strike = 0;
		int ball = 0;
		
		for(int i=0;i<size;i++){
			if(isduplicate(arr1[i], arr2)!=-1){
				if(isduplicate(arr1[i], arr2)==i){
					strike += 1;
				}else{
					ball += 1;
				}
			}
		}
		 if(strike != 0){
			   System.out.print(strike+"S ");
		   }
		 if(ball != 0){
			   System.out.print(ball+"B");
		   }
		 if(strike == 0 && ball == 0){
			 System.out.println("3O");
		 }
		  System.out.println();
		return strike;
	}
}
