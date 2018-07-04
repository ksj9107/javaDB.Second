package Day2;

public class ForEx3 {
	public static void main(String[] args) {
		// 대입연산 외의 연산에는 항상 변수를 초기화 해주어야함
		/* 두 수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 두 수의 공약수 중 가장 큰 수
		 * 공약수 : 두 수의 약수 중 공통인 약수
		 * 약수 : 나누어 떨어지는 수로 4의 약수는 1, 2, 4
		 * 8과 12의 최대 공약수
		 * 8 : 1, 2, 4, 8
		 * 12: 1, 2, 3, 4, 6, 12
		 * 8과 12의 공약수 : 1, 2, 4
		 * 8과 12의 최대 공약수 : 4
		 * 
		 * */
		
		int num1 = 30;
		int num2 = 36;
		int gcd = 0;
		System.out.print(num1+"과 "+num2+"의 공약수 :");
		gcd = 0;
		for(int i = 1; i <= num1; i++){
			if(num1 % i == 0 && num2 % i ==0){
				System.out.print(i+" ");
				gcd = i;
			}
		}
		
		System.out.println("");
		System.out.println(num1+"과 "+num2+"의 최대공약수 : "+gcd);

		/* 234의 약수를 구하는 코드를 작성하세요.
		 */
		int num = 234;
		System.out.print(num+"의 약수 : ");
		for(int i = 1; i<= num; i++){
			if(234 % i == 0){
				System.out.print(i+" ");
			}
		}
	}
}
