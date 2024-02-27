package Arrays_1;

public class SwapAlternate {

	public static void SwapAlternatearray(int arr[]){
		

		if (arr.length%2==0) {
			
			for(int i=0;i<arr.length;i=i+2){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}else{
			for(int i=0;i<arr.length-1;i=i+2){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}


		for (int i : arr) {
			System.out.print(i+" ");
		}

		// int n = arr.length;

        // for (int i = 0; i < n - 1; i += 2) {
        //     int temp = arr[i];
        //     arr[i] = arr[i + 1];
        //     arr[i + 1] = temp;
        // }
	}
	public static void main(String[] args) {
		//int array[]={9,3,6,12,4,32,5,11,19};
		int array[]={9, 3, 6, 12, 4 ,32,4};
		SwapAlternatearray(array);

	}
}
