package Arrays_2;

public class SumOfArrays {
	public static int[] ArraySum(int A[],int B[],int sum[]){

		int i=A.length-1;
		int j=B.length-1;
		int k=sum.length-1;

		int carry=0,total=0;

		while (i>=0 && j>=0) {
			total=A[i]+B[j]+carry;
			sum[k]=total%10;
			carry=total/10;
			i--;
			j--;
			k--;
		}

		if (A.length>B.length) {
			while (i>=0) {
				total=A[i]+carry;
				sum[k]=total%10;
				carry=total/10;
				i--;
				k--;
			}
		}else{
			while (j>=0) {
				
				total=B[j]+carry;
				sum[k]=total%10;
				carry=total/10;
				j--;
				k--;
			}
		}
		sum[0]=carry;

		return sum;
	}
	public static void main(String[] args) {
		int A[]={9,7,6,6};
		int B[]={9,5,7};
		int maxSumlength=Math.max(A.length, B.length);

		int sum[]=new int[maxSumlength+1];

		ArraySum(A, B, sum);
		for (int i : sum) {
			System.out.print(i+" ");	
		}
	}
}
