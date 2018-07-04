package Day2;

public class ForEx4 {
	public static void main(String[] args) {
		/* 두 수의 최소공배수를 구하는 코드를 구하세요.
		 * 최소 공배수 : 두 수의 공배수 중에서 가장 작은 공배수
		 * 
		 */
		
		
		int num1 = 1234;
		int num2 = 5678;
		int lcm = 0;
		int cnt = 0;
		//배수 이용(1씩 증가)
		for(int i = 1; i <= num1*num2; i++){
			cnt++;
			if(i % num1 == 0 && i % num2 ==0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최소공배수(1씩 증가) : "+lcm);
		System.out.println("연산횟수 : "+ cnt);
		
		
		//배수 이용(tmpNum(두 수 중 큰 수)의 배수씩 증가)
		cnt = 0;
		int tmpNum = num1;
		int div = num2;
		if(num2 > num1){
			tmpNum = num2;
			div = num1;
		}
		
		lcm = 0;
		for(int i = tmpNum; i <= num1*num2; i += tmpNum){
			cnt++;
			if(i % div ==0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최소공배수(tmpNum의 배수) : "+lcm);
		System.out.println("연산횟수 : "+ cnt);
		
		//최대공약수 이용(그냥 제가해본거)
		cnt=0;
		int div1=0, div2=0;
		int gcd = 0;
		lcm = 0;
		for(int i = 1; i <= num1; i++){
			cnt++;
			if(num1 % i == 0 && num2 % i ==0){
				gcd = i;
			}
		}
		div1 = num1 / gcd;
		div2 = num2 / gcd;
		lcm = gcd*div1*div2;
		System.out.println(num1+"과 "+num2+"의 최소공배수(최대공약수 이용) : "+lcm);
		System.out.println("연산횟수 : "+ cnt);
	}
}
