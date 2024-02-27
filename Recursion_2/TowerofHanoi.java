package Recursion_2;

public class TowerofHanoi {
	
	public static void TwHanoi(int n, char s,char h,char d){
		if (n==1) {
			System.out.println("Move 1st disk from "+s+" to "+d);
			return;
		}
		TwHanoi(n-1, s, h, d);
		System.out.println("Move "+n+"th disk from "+s +" to "+d);
		TwHanoi(n-1, s, h, d);

	}
	public static void main(String[] args) {
		TwHanoi(2, 's','h','d');
	}
}
