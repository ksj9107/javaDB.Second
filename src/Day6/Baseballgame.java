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
				System.out.println("정답입니다.");
				System.out.print("정답 숫자 : ");
				for(int i=0; i<size; i++){
					System.out.print(comarr[i]+" ");
				}
				end = true;
			}
		}
	}
	/* 컴퓨터  vs 사용자
	 * 컴퓨터는 문제를 출제 : 랜덤으로 1~9사이의 중복되지
	 * 않는 숫자 3개를 선택
	 * 사용자 : 컴퓨터가 선택한 숫자 3개를 순서와 함께 맞춰야한다.
	 * ex)
	 * 컴퓨터 : 1 3 5
	 * 사용자 : 1 2 3
	 * 컴퓨터 : 1S 1B
	 * 사용자 : 2 4 8
	 * 컴퓨터 : 3O
	 * 사용자 : 1 3 5
	 * 컴퓨터 : 3S
	 * 정답입니다.
	 * S : 해당 숫자가 있고 해당 순서가 일치할 때
	 * B : 해당 숫자가 있고 해당 순서가 일치하지 않을 때
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
		System.out.print("정답 숫자 : ");
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return arr;
	}
	
	public static int[] generateuser(int size){
	    int tmp = 0;
	    int arr[] = new int[size];
	    
	    System.out.println("1~9 사이 숫자 3개를 입력하세요" );
		for(int i=0; i<size; ){
	    	tmp = sc.nextInt();
	    	if(isduplicate(tmp, arr)==-1){
				arr[i]=tmp;
				i++;
	    	}else{
	    		System.out.println("숫자가 중복되었습니다. 다시입력하세요");
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
		   }else{
			   System.out.print("3O");
		   }System.out.println();
		return strike;
	}
}
