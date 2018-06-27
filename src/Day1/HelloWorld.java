package Day1;


//한줄주석
/**/
/*
 * 여러줄 주석
 * public : 접근제한자, 누구나 다 접근가능
 * 접근제한자는 외부에서 해당하는 클래스 또는 메소드에
 * 접근을 허용할지 말지를 결정하는 역할
 * class : 클래스임을 나타냄
 * 
 */
public class HelloWorld {

	/*
	 * static : 클래스를 통해 호출함
	 * void : 반환이 없음을 나타내는 반환형(리턴타입), 메소드 설명에서 자세히 할 예졍
	 * main : 메소드 이름(주로 메인 메소드를 나타냄)
	 * String[] args : 매개변수(파라미터)
	 * 자바에서 프로그램을 실행하려면 main메소드가 있어야한다.
	 */
	public static void main(String[] args) {
		//println : 표준 출력 메소드(한줄 건너뜀)
		//print : 출력 메소드(한줄 건너뛰는 기능 없음)		
		System.out.println("Hello World!");
	}
}
