package StudentAssignment;

public class A3 {

	String name ;
	int age;
	char section;
	char gender ;
	int sub1;
	int sub2;
	int sub3;
	
	
	A3 (String n , int a , char c , char cc, int ss1 , int ss2 , int ss3){
		name= n;
		age = a;
		section = c;
		gender = cc;
		sub1 = ss1;
		sub2 = ss2;
		sub3 = ss3;
				
	}
	
	public int marks(){
		int total = sub1 + sub2 + sub3 ;
		return total ;
	}
	
	public float percentage(){
		float per = ((sub1 + sub2 + sub3)*100)/300;
		return per;
	}
	
	public void display(){
		System.out.println(name +" "+ age +" "+ section +" "+ gender+" " + sub1+" " + sub2 +" "+ sub3+" " +"\n"+ "Total Marks = " + marks() + "\n"+ "Percentage = " +  percentage()+"\n");
		
	}
	
	
	
	public static void main(String[] args) {
		A3 s1 = new A3("Avi",21,'A','M',88,78,85);
		
		A3 s2 = new A3("Rishi",23,'B','M',89,94,89);
		
		A3 s3 = new A3("Radha",23,'B','F',81,92,84);
		
		A3 s4 = new A3("Anuja",23,'A','M',89,94,89);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}

}
