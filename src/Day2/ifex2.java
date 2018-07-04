package Day2;

public class ifex2 {
	public static void main(String[] args) {
		
		/* 정수가 홀수인지 짝수인지 판별하는 코드를
		 * if문을 이용하여 작성
		 */
		
		int num1 = 11;
		
		if(num1 % 2 == 0){
			System.out.println(num1 + "은 짝수입니다.");
		}else if(num1 % 2 == 1){
			System.out.println(num1 + "은 홀수입니다.");
		}else{
			System.out.println("음수이거나 잘못 입력하셨습니다.");
		}
	}
}