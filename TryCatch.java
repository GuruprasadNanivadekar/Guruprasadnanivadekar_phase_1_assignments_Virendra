package TryCatchAssignment;

public class TryCatch {    
    public static void main(String[] args) {  
        int a[]=new int[5]; 
           try{    
         int data = 56/0;
         System.out.println(data);
         
               }    
              catch(NullPointerException e)  
                  {  
                   System.out.println("Null pointerException occurs");  
                  }  
           
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception.....");  
                  }   
           try{
        	   a[5]=58;
        	   System.out.println(a[4]);
           }
           catch(ArrayIndexOutOfBoundsException e)  
           {  
            System.out.println("ArrayIndexOutOfBounds Exception.....");  
           }    
    
           finally{
        	   System.out.println("This block will always ececuted");
           }
           
                   
    }  
}