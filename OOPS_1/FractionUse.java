 package OOPS_1;
 
 public class FractionUse {

	public static void main(String[] args) {
		Fraction f1=new Fraction(4, 6); 
		//f1.print();
		//f1.increment();
		f1.print();

		Fraction f2=new Fraction(4, 8); 
		//f2.print();
		//f2.increment();
		f2.print();
		//f1.addition(f2);
		//f1.print();

		Fraction f3=Fraction.add(f1, f2);
		f3.print();
	}
 
	
 }