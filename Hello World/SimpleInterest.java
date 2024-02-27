	import java.util.* ;

public class SimpleInterest {


	
	public static void main(String args[]) {
		
		// Write code here
		Scanner scanner = new Scanner(System.in);
		int principal=scanner.nextInt();
		float interest=scanner.nextFloat();
		int time=scanner.nextInt();

		int SI = (int)(principal*interest*time)/100;
		System.out.println(SI);
		scanner.close();
	}

}

// import java.util.*;
// public class Solution
// {
// 	public static void main(String[] args) 
//     {
// 		// write your code logic here !! 
// 		Scanner scanner = new Scanner(System.in);
// 		int x=scanner.nextInt();
// 		int y=scanner.nextInt();
// 		int z=scanner.nextInt();		

// 		if (x>0 && y>0 && z>0){

// 			if((x+y>z) && (y+z>x) && (x+z>y) ){

// 				if(x==y && y==z){
// 					System.out.println("Equilateral Triangle");
// 				}else if (x==y || x==z || y==z ){
// 					System.out.println("Iscosceles Triangle");
// 				}else{
// 					System.out.println("Scalene Triangle");
// 				}

// 			}else{
// 				System.out.println("Not a Triangle");
// 			}
// 		}else{
// 			System.out.println("Not a Triangle");
// 		}


		

// 		scanner.close();
        
// 	}
// }

