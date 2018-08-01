package Day5;

public class lotto {
	public static void main(String[] args) {
		/* 랜덤함수 사용방법
		 * 0 <= x < 1
		 * 0 <= 10*x < 10	: 구하고자하는 최대값의 수를 양변에 곱해주어 최대값을 정한다.
		 * 1 <= 10*x+1 < 11 : 구하고자하는 최소값을 만들기 위해 양변에 최소값을 더해준다.
		 * */
		/* 랜덤으로 중복되지 않는 로또 번호를 생성 */
		int min=1,max=45,size=6;
		int arr[]=null;
		int arr2[]=null; // 당첨 번호
		int checkarr[] = new int[2];
		
		arr=generate(min,max,size);
		sort(arr,size);
		System.out.print("생성번호  ");
		printarr(arr);
		
		arr2=generate(min,max,size+1);
		sort(arr2,size);
		System.out.print("당첨번호  ");
		printarr(arr2);
		
		checkarr = confirm(arr,arr2);
		System.out.println("중복횟수 : " + checkarr[0]+"\t보너스 당첨 : "+checkarr[1]);
		rank(checkarr);
	}

	public static int randomInt(int min, int max){
		/* 최솟값과 최댓값을 입력받아 최솟값과 최댓값 사이에 있는
		 * 랜덤한 수를 생성하는 메소드
		 * 1.메소드명 : randomInt
		 * 2.매개변수 : 최소값(int min), 최대값(int max)
		 * 3.리턴타입 : 랜덤한 정수(int)
		 * */
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static boolean isduplicate(int num,int arr[],int cnt){
		/* 배열 arr에 num의 값이 있는지 없는지 확인하는 코드를 작성
		 * 있으면 있다고 출력, 없으면 없다고 출력.
		 * 반복문을 이용하여 배열 arr의 0번지부터 5번지의 값을
		 * 하나씩 가져와서 num와 같으면 반복문을 강제종료한다.
		 * 반복문이 종료되면 종료되고난후의 i가 6이면 없음(boolean은 false).
		 * 6이 아니면 있음을 출력한다(boolean은 true).
		 * 1.메소드명 : isduplicate
		 * 2.매개변수 : int num, int arr[]
		 * 3.리턴타입 : boolean
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
			System.out.println("로또번호 생성에 실패했습니다.");
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
	public static void sort(int arr[],int size){
		for(int i=0;i<size-1;i++){
			for(int j=0; j<size-1-i; j++){
				//앞에 있는 수가 뒤에 있는 수보다 크면 서로 교환
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
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
			System.out.println("5등 입니다.");
		case 4:
			System.out.println("4등 당첨 입니다.");
			break;
		case 5:
			if(arr[1]==1){
				System.out.println("2등 당첨 입니다");
			}else{
				System.out.println("3등 당첨입니다.");
			}
			break;
		case 6:
			System.out.println("1등 당첨입니다.");
			break;
		default:
			System.out.println("당첨되지 않으셨습니다.");
			break;
		}
	}
}
