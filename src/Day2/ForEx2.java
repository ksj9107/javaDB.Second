package Day2;

public class ForEx2 {
	public static void main(String[] args) {
		/* 1부터 10 사이에 홀수만 출력하는 코드를
		 * for문을 이용하여 작성하세요.*/
		
		for(int i = 1; i <= 10; i++){
			if(i % 2 ==1){
				System.out.println(i);
			}
		}
		for(int i = 1; i <= 10 ; i += 2){
			System.out.println(i);
		}
		/* 1부터 10까지의 합을 구하는 예제를 작성하세요. */
		
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			sum += i;					
		}
		System.out.println("sum = "+sum);
		
		/* 구구단 7단을 출력하는 코드를 작성하세요. */
		
		for(int j = 1; j < 10; j++){
			System.out.println("7 x "+j+" = "+7*j);
		}
		System.out.println("");
		System.out.println("");
		
		for(int i = 1; i < 10; i++){
			for(int j =1; j < 10; j++){
				if(i == 7){
					System.out.println(i+" x "+j+" = "+i*j);
				}
			}
		}
		
	}
}
