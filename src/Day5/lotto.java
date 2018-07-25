package Day5;

public class lotto {
	public static void main(String[] args) {
		/* �����Լ� �����
		 * 0 <= x < 1
		 * 0 <= 10*x < 10	: ���ϰ����ϴ� �ִ밪�� ���� �纯�� �����־� �ִ밪�� ���Ѵ�.
		 * 1 <= 10*x+1 < 11 : ���ϰ����ϴ� �ּҰ��� ����� ���� �纯�� �ּҰ��� �����ش�.
		 * */
		/* �������� �ߺ����� �ʴ� �ζ� ��ȣ�� ���� */
		int min=1,max=45,size=6;
		int arr[];
		arr=generate(min,max,size);
		printarr(arr);

	}

	public static int randomInt(int min, int max){
		/* �ּڰ��� �ִ��� �Է¹޾� �ּڰ��� �ִ� ���̿� �ִ�
		 * ������ ���� �����ϴ� �޼ҵ�
		 * 1.�޼ҵ�� : randomInt
		 * 2.�Ű����� : �ּҰ�(int min), �ִ밪(int max)
		 * 3.����Ÿ�� : ������ ����(int)
		 * */
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static boolean isduplicate(int num,int arr[],int cnt){
		/* �迭 arr�� num�� ���� �ִ��� ������ Ȯ���ϴ� �ڵ带 �ۼ�
		 * ������ �ִٰ� ���, ������ ���ٰ� ���.
		 * �ݺ����� �̿��Ͽ� �迭 arr�� 0�������� 5������ ����
		 * �ϳ��� �����ͼ� num�� ������ �ݺ����� ���������Ѵ�.
		 * �ݺ����� ����Ǹ� ����ǰ����� i�� 6�̸� ����(boolean�� false).
		 * 6�� �ƴϸ� ������ ����Ѵ�(boolean�� true).
		 * 1.�޼ҵ�� : isduplicate
		 * 2.�Ű����� : int num, int arr[]
		 * 3.����Ÿ�� : boolean
		 * */
		for(int i=0; i<cnt; i++){
			if(arr[i]==num){
				return true;
			}
		}
		return false;
	}
	public static int[] generate(int min, int max, int size){
		int tmp=0,cnt=0;
		int arr[] = new int[size];
		if(min > max){
			return null;
		}
		if(max-min+1<size){
			return null;
		}
		for(; cnt<arr.length;){
			tmp=randomInt(min, max);
			if(!isduplicate(tmp,arr,cnt)){
				arr[cnt]=tmp;
				cnt++;
			}
		}
		return arr;
	}
	public static void printarr(int arr[]){
		if(arr==null){
			System.out.println("�ζǹ�ȣ ������ �����߽��ϴ�.");
		}else{
			for(int i=0; i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
