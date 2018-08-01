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
		int arr[]=null;
		int arr2[]=null; // ��÷ ��ȣ
		int checkarr[] = new int[2];
		arr=generate(min,max,size);
		sort(arr,size);
		System.out.print("������ȣ  ");
		printarr(arr);
		
		arr2=generate(min,max,size+1);
		sort(arr2,size);
		System.out.print("��÷��ȣ  ");
		printarr(arr2);
		
		checkarr = confirm(arr,arr2);
		System.out.println("�ߺ�Ƚ�� : " + checkarr[0]+"\t���ʽ� ��÷ : "+checkarr[1]);
		rank(checkarr);
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
		if(cnt > arr.length){
			cnt = arr.length;
		}
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
			/*tmp = min;
			min = max;
			max = tmp;
			*/return null;
		}
		if(max-min+1<size){
			return null;
		}
		if(size < 0){
			return null;
		}
/*		for(; cnt<arr.length;){
			tmp=randomInt(min, max);
			if(!isduplicate(tmp,arr,cnt)){
				arr[cnt]=tmp;
				cnt++;
			}
		}*/
		while(cnt<arr.length){
			tmp=randomInt(min, max);
			if(!isduplicate(tmp,arr,cnt)){
				arr[cnt]=tmp;
				cnt++;
			}
		}
		return arr;
	}
	public static void printarr(int arr[]){
/*		if(arr==null){
			System.out.println("�ζǹ�ȣ ������ �����߽��ϴ�.");
		}else{
			for(int i=0; i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}*/
		for(int tmp:arr){
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	public static int[] sort(int arr[],int size){
		for(int i=0;i<size-1;i++){
			for(int j=0; j<size-1-i; j++){
				//�տ� �ִ� ���� �ڿ� �ִ� ������ ũ�� ���� ��ȯ
				if(arr[i]<arr[j+1]){
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		return arr;
	}
	public static int[] confirm(int genarr[],int finarr[]){
		int cnt = 0,bonus=0;		
		int arr[]=new int[2];
		/*for(int i=0; i<genarr.length;i++){
			for(int j=0; j<genarr.length; j++){
				if(finarr[i]==genarr[j]){
					cnt++;
				}
			}
		}*/
		for(int i=0;i<genarr.length;i++){
			if(isduplicate(genarr[i], finarr, genarr.length))
				cnt++;
		}
		if(isduplicate(finarr[finarr.length-1], genarr, genarr.length)){
			bonus++;
		}

		
		arr[0]=cnt;
		arr[1]=bonus;
		return arr;
	}
	public static void rank(int arr[]){
		switch(arr[0]){
		case 3:
			System.out.println("5�� �Դϴ�.");
		case 4:
			System.out.println("4�� ��÷ �Դϴ�.");
			break;
		case 5:
			if(arr[1]==1){
				System.out.println("2�� ��÷ �Դϴ�");
			}else{
				System.out.println("3�� ��÷�Դϴ�.");
			}
			break;
		case 6:
			System.out.println("1�� ��÷�Դϴ�.");
			break;
		default:
			System.out.println("��÷���� �����̽��ϴ�.");
			break;
		}
	}
}
