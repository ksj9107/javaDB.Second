package Day2;

public class ForEx4 {
	public static void main(String[] args) {
		/* �� ���� �ּҰ������ ���ϴ� �ڵ带 ���ϼ���.
		 * �ּ� ����� : �� ���� ����� �߿��� ���� ���� �����
		 * 
		 */
		
		
		int num1 = 1234;
		int num2 = 5678;
		int lcm = 0;
		int cnt = 0;
		//��� �̿�(1�� ����)
		for(int i = 1; i <= num1*num2; i++){
			cnt++;
			if(i % num1 == 0 && i % num2 ==0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"�� "+num2+"�� �ּҰ����(1�� ����) : "+lcm);
		System.out.println("����Ƚ�� : "+ cnt);
		
		
		//��� �̿�(tmpNum(�� �� �� ū ��)�� ����� ����)
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
		System.out.println(num1+"�� "+num2+"�� �ּҰ����(tmpNum�� ���) : "+lcm);
		System.out.println("����Ƚ�� : "+ cnt);
		
		//�ִ����� �̿�(�׳� �����غ���)
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
		System.out.println(num1+"�� "+num2+"�� �ּҰ����(�ִ����� �̿�) : "+lcm);
		System.out.println("����Ƚ�� : "+ cnt);
	}
}
