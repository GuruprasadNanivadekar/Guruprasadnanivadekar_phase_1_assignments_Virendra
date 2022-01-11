package CustomHandling;

public class SalaryAssignment{  
	  
	   static void validate(int sal)throws InvalidAgeException{  
	     if(sal<2100)  
	      throw new InvalidAgeException("work hard");  
	     else  
	      System.out.println("great work");  
	     if(sal<9000)  
		      throw new InvalidAgeException("work hard");  
		     else  
		      System.out.println("Your salary is very good"); 
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	        validate(50000);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  

class InvalidAgeException extends Exception{ 
	

	InvalidAgeException(String s){  
	  super(s);  
	 }  
}