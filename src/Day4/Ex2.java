package Day4;

public class Ex2 {
	public static void main(String[] args) {
		/*int arr[] = new int[5];
		for(int i=0;i<5;i++){
			arr[i]=i;
		}*/
		/* ���� for���� ��������
		 * �迭�� ��� �����͸� ������ �� ���
		 * �迭�� ���� �������� ������(ex. ��¸� �ϴ°��)
		 * ��� �迭�� �ѹ��� ������ �ʿ��� ��
		 * */
		/*for(int tmp:arr){//���� for����
			System.out.println(tmp);
		}*/
		/* �ڷ��� �迭�̸�[];
		 * �ڷ��� �迭�̸�[] = new �ڷ��� [�迭�� ũ��];
		 * */
		/* ���� num�� ���ڸ��� �߶� �Ųٷ� �迭�� �����ϴ� �ڵ带
		 * �ۼ��ϼ���. ��, �ݺ����� ����ؾ� �մϴ�.*/
		int num = 12045;
		int arr1[] = new int[10];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=num%10;
			num /= 10;
			System.out.println(arr1[i]);
			if(num==0){
				break;
			}
		}
		int num2 = 12045;
		int arr2[] = new int[10];
		int cnt=0;
		while(num2!=0){
			arr2[cnt]=num2%10;
			num2=num2/10;
			cnt++;
		}
		int i=0;
		while(i<cnt){
			System.out.print(arr2[i]+" ");
			i++;
		}
		System.out.println();
	}
}
