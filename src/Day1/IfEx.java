package Day1;

public class IfEx {

	public static void main(String[] args) {
		/*
		 * if(조건식1){
		 * 		실행문1;//조건식1 이 참일 때 실행
		 * }
		 * else if(조건식2){
		 * 		실행문2;//조건식 1이 거짓, 조건식 2가 참일경우 실행
		 *  }
		 * else{
		 * 		실행문3;//조건식1과 조건식 2가 거짓일 때 실행
		 * }
		 */
		int num = 0;

		if(num == 0){
			System.out.println(num+"는 짝수입니다.");;
		} else if(num % 2 == 0){
			System.out.println("0 입니다.");
		} else{
			System.out.println(num+"는 홀수입니다.");
		}
	}

}
