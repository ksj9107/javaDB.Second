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
		/* �Ϲ� ������ �޼ҵ��� �Ű������� �̿��ϸ�
		 * �޼ҵ� �ȿ��� �Ű������� ���� �����Ǿ
		 * �޼ҵ带 ȣ���� �������� �Ϲݺ�����
		 * �ٲ��� �ʴ´�.
		 * ���������� �޼ҵ��� �Ű������� �̿��ϸ� 
		 * �޼ҵ� �ȿ��� �Ű������� ���� �����Ǹ� 
		 * �޼ҵ带 ȣ���� �������� ���������� �ٲ��.
		 * �Ϲݺ��� : int, char, double���� �ڷ������� ����
		 * 		     ����
		 * �������� : �迭, ��ü ���� new�� ���� �����Ǵ�
		 * 		     �͵�
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
	/* �޼ҵ� �����ε� : ������ �̸��� �޼ҵ尡 ���� �� �ִ� ��Ȳ
	 * 1. �Ű������� ������ �ٸ� ���
	 * 2. �Ű������� ������ ������ �ڷ����� �ٸ� ���
	 * �޼ҵ� �������̵����� �߿��Ѱ� �Ű������̴�.
	 * ����Ÿ���� �ƹ��� ������ ����.
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










