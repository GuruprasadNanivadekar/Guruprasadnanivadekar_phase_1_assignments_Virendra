package StackAssignment;

import java.io.*; 
import java.util.*; 

public class StackAssignment { 
 public static void main(String[] args) 
 { 
    
     Stack stack1 = new Stack(); 

     
     Stack<String> stack2 = new Stack<String>(); 

     stack1.push(20); 
     stack1.push("Apple"); 
     stack1.push("Mango");
     stack1.push("Banana");
     stack1.push("Orange"); 
     stack1.push("Grapes"); 
     stack1.push("Mumbai");
     stack1.push("Pune");
     stack1.push("Delhi");
     stack1.push("Nagpur");
     stack1.push(20);
     stack1.push(30);
     stack1.push('c');
     stack1.push('h');
     
     
     System.out.println(stack1);
     stack1.remove(2);
     stack1.remove(3);
     stack1.remove(4);
     stack1.remove(5);
     stack1.remove(6);
    System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 
     System.out.println("Popped element from stack 1: " + stack1.pop());
     System.out.println("Popped element from stack 1: " + stack1.pop());
     System.out.println("Popped element from stack 1: " + stack1.pop());
     System.out.println("Popped element from stack 1: " + stack1.pop());
     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
     System.out.println("index of element Apple inside the stack"+ stack1.indexOf("Apple"));
     System.out.println("index of element Delhi inside the stack"+ stack1.indexOf("Delhi"));
     System.out.println(stack1);
      
 } 
}