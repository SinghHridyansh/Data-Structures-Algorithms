package Recursion_2;

public class MergeSortR {

	public static void merge(int[]s1,int[]s2,int[]d){
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                d[k]=s1[i];
                i++;
                k++;
            }else{
                d[k]=s2[j];
                k++;
                j++;
            }
        }
        if(i<s1.length){
            while(i<s1.length){
                d[k]=s1[i];
                i++;
                k++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k]=s2[j];
                k++;
                j++;
            }
        }
    }
	
	public static void MergeSortfunc(int arr[]){
		if (arr.length<=1) {
			return;
		}

		int b[]=new int[arr.length/2];
		int c[]=new int[arr.length-b.length];

		for (int i = 0; i < arr.length/2; i++) {
			b[i]=arr[i];
		}

		for (int i = arr.length/2; i < arr.length; i++) {
			c[i-arr.length/2]=arr[i];
		}

		MergeSortfunc(b);
		MergeSortfunc(c);
		merge(b, c, arr);
		
	}

	public static void main(String[] args) {
		int arr[]={17, 5, 14, 16, 11, 18, 10};
		MergeSortfunc(arr);

		for (int i : arr) {
			System.out.print(i+" ");
		}

	}
}
