package AreaAssignment;

public class Assignment2 {

	int aa;
	long rr;
	int bb;
	long ss;
	
	public void Calculate(int p , long q){
	ss= ((p*q)/2) ;
		System.out.println("Area of rohmbus = " + ss);
	}
	
	public Assignment2(){
		System.out.println("Default Constructor");
	}
	
	Assignment2(int a){
		aa= a;
	}
	
	Assignment2(int a, int b){
	    aa=a;
		bb=b;
		
	}
	
	Assignment2(long r){
	rr=r;
	
	}
	
	
	
	public void area1(){
		System.out.println("Area of rectangle = " + (aa * bb));
	}
	public void area2(){
		System.out.println("Area of Square = " + (aa*aa));
	}
	public void area3(){
		System.out.println("Area of Circle = " + (3.14*rr*rr));
	}
	
	public static void main(String[] args) {
		Assignment2 rh = new Assignment2();
		rh.Calculate(2, 1);
		
		Assignment2 ob = new Assignment2(2);
		ob.area1();
		
		Assignment2 ob1 = new Assignment2(2,5);
		ob1.area2();
		
		Assignment2 ob2 = new Assignment2(3L);
		ob2.area3();
		
		
	}

}
