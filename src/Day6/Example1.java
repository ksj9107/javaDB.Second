package Day6;

public class Example1 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		int arr[] = new int[3];
		System.out.println("num1 : "+num1+"\tnum2 : "+num2);
		swap(num1,num2);
		System.out.println("num1 : "+num1+"\tnum2 : "+num2);
		for(int tmp:arr){
			System.out.print(tmp+" ");
		}
		System.out.println();
		swap(arr);
		for(int tmp:arr){
			System.out.print(tmp+" ");
		}
		System.out.println();
		/* 일반 변수를 메소드의 매개변수로 이용하면
		 * 메소드 안에서 매개변수의 값이 수정되어도
		 * 메소드를 호출한 곳에서의 일반변수는
		 * 바뀌지 않는다.
		 * 참조변수를 메소드의 매개변수로 이용하면 
		 * 메소드 안에서 매개변수의 값이 수정되면 
		 * 메소드를 호출한 곳에서의 참조변수도 바뀐다.
		 * 일반변수 : int, char, double등의 자료형으로 만든
		 * 		     변수
		 * 참조변수 : 배열, 객체 등의 new를 통해 생성되는
		 * 		     것들
		 * */
	}
	public static void swap(int num1, int num2){
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
	}
	public static void swap(int arr[]){
		for(int i=0;i<arr.length;i++){
			arr[i] = i;
		}
	}
	/* 메소드 오버로딩 : 동일한 이름의 메소드가 여러 개 있는 상황
	 * 1. 매개변수의 갯수가 다를 경우
	 * 2. 매개변수의 갯수가 같지만 자료형이 다를 경우
	 * 메소드 오버라이딩에서 중요한건 매개변수이다.
	 * 리턴타입은 아무런 영향이 없다.
	 * */
	public static int sum(int num1, int num2){
		return num1+num2;
	}
	public static int sum(int num1, int num2, int num3){
		return num1+num2+num3;
	}
	public static double sum(double num1, double num2){
		return num1+num2;
	}
	/*public static double sum(int num1, int num2){
		return num1+num2;
	}
	public static int sum(int a, int b){
		return a+b;
	}*/
	
}










