import java.util.Scanner;
public class FahToCel {
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();

		
		//if(S>=0 && S<=90 && E>=S && E<=900 && W>=0 && W<=80){
			
			
		for(int i=S;i<=E;i=i+W){
			int calc=0;
			calc=(int)((i-32)*5)/9;
			//System.out.println(S+" "+calc);
			System.out.println(i+" "+calc);
		}
	//}

		sc.close();
		
	}
}
