package Recursion_1;

public class GeometricSumR {
	
	public static double Gsum(int k){

		if (k==0) {
			return 1;
		}
		if (k<0) {
			return 0;
		}
	
		double smallOutput=Gsum(k-1);
		double output=smallOutput+(1/(Math.pow(2, k)));

		return output;

	}

	public static void main(String[] args) {
		int k=3;
		System.out.println(Gsum(k));
	}
}
