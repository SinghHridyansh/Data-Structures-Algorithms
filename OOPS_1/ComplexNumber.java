package OOPS_1;

public class ComplexNumber {

	int real;
	int imaginary;
	
	public ComplexNumber(int real,int imaginary){

		this.real=real;
		this.imaginary=imaginary;
	}

	public void print(){
		System.out.println(real+"+"+imaginary+"i");
	}

	public void setReal(int num){
		this.real=num;
	}

	public void setImaginary(int num){
		this.imaginary=num;
	}

	public void add(ComplexNumber c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

	public void multiply(ComplexNumber c2){
		int origReal=this.real;
		int origImag=this.imaginary;
		this.real=origReal*c2.real-origImag*c2.imaginary;
		this.imaginary=origReal*c2.imaginary+origImag*c2.real;
	}
}
