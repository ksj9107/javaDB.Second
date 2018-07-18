package Day4;

public class Ex2 {
	public static void main(String[] args) {
		/*int arr[] = new int[5];
		for(int i=0;i<5;i++){
			arr[i]=i;
		}*/
		/* 향상된 for문의 제약조건
		 * 배열의 모든 데이터를 가져올 때 사용
		 * 배열의 값을 수정하지 않을때(ex. 출력만 하는경우)
		 * 모든 배열에 한번씩 접근이 필요할 때
		 * */
		/*for(int tmp:arr){//향상된 for문임
			System.out.println(tmp);
		}*/
		/* 자료형 배열이름[];
		 * 자료형 배열이름[] = new 자료형 [배열의 크기];
		 * */
		/* 정수 num의 각자리를 잘라서 거꾸로 배열에 저장하는 코드를
		 * 작성하세요. 단, 반복문을 사용해야 합니다.*/
		int num = 12045;
		int arr1[] = new int[10];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=num%10;
			num /= 10;
			System.out.println(arr1[i]);
			if(num==0){
				break;
			}
		}
		int num2 = 12045;
		int arr2[] = new int[10];
		int cnt=0;
		while(num2!=0){
			arr2[cnt]=num2%10;
			num2=num2/10;
			cnt++;
		}
		int i=0;
		while(i<cnt){
			System.out.print(arr2[i]+" ");
			i++;
		}
		System.out.println();
	}
}
