package PatternMatching;

import java.util.*;
import java.util.regex.*;    
public class Regx2{  
    public static void main(String args[]){  
  
        String mail1 = ("xyz@domain.com");  
        String mail2 =("abcd@domain.co.in");  
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	    System.out.println("Is the above mail1 valid? " + mail1.matches(regex)+"\n");
	    System.out.println("The mail1 is: " + mail1 +"\n");
	    System.out.println("Is the above mail2 valid? " + mail2.matches(regex)+"\n");
	    System.out.println("The mail2 is: " + mail2+"\n");
        
        
        String phoneNumber = "9999999998";
        String phoneNumber2 = "8946622365";
        
        String regex2 = "(0/91)?[7-9][0-9]{9}";
        System.out.println("The phone number is: " + phoneNumber+"\n");
	    System.out.println("Is the above phone number valid? " + phoneNumber.matches(regex2)+"\n");
	    System.out.println("The phone number is: " + phoneNumber2+"\n");
	    System.out.println("Is the above phone number valid? " + phoneNumber2.matches(regex2)+"\n");
        
	    
	    String Password = "!@#$%^&*Aa1";
	    String Passwordx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,15}$";
	    System.out.println("The phone number is: " + "Password is "+"\n");
	    System.out.println("Is the above password valid? " + Passwordx.matches(Passwordx)+"\n");
	    
	    
    }
    
}