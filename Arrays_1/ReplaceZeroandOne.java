package Arrays_1;

public class ReplaceZeroandOne {

	public static void swapZeroandOne(int arr[]){
		int pointer=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i] == 0){
				int swap=arr[i];
				arr[i]=arr[pointer];
				arr[pointer]=swap;
				pointer++;
			}
		}
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]={1,0,1,1,0,1,0,1};
		swapZeroandOne(arr);
	}
}
