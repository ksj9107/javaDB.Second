package Day2;

public class switchEx2 {
	public static void main(String[] args) {
		/* 문자 ch가 a 또는 A이면 A입니다. 라고 콘솔에 출력하고
		 * 문자 ch가 b 또는 B이면 B입니다. 라고 콘솔에 출력하고
		 * 문자 ch가 a,b,A,B가 아니면 A와 B가 아닙니다.
		 * 라고 콘솔에 출력하는 예제를 작성하세요.*/
		char ch = 69;
		
		switch(ch){
		case 'a':
			System.out.println("A입니다.");
			break;
		case 'A':
			System.out.println("A입니다.");
			break;
		case 'b':
			System.out.println("B입니다.");
			break;
		case 'B':
			System.out.println("B입니다.");
			break;
		default:
			System.out.println("A와 B가 아닙니다.");
		}
	}
}
