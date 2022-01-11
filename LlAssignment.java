package LinkedListAssignment;

import java.util.Iterator;
import java.util.LinkedList;

import javax.xml.soap.Node;

public class LlAssignment {

		public static void main(String a[]){
	   
	        LinkedList<String> ll = new LinkedList<String>();
	        ll.add("April");
	        ll.add("May");
	        ll.add("June");
	        ll.add("July");
	        ll.add("August");
	        ll.add("November");
	        
	        
	        ll.addLast("December");
	        System.out.println("December is added "+ ll);
	        ll.addFirst("January");
	        System.out.println("January is added "+ ll);
	        ll.add(1,"February");
	        System.out.println("February is added"+ ll);
	        ll.add(2,"March");
	        System.out.println("March is added"+ ll);
	        ll.add(8,"September");
	        System.out.println("September is added"+ ll);
	        ll.add(9,"October");
	        System.out.println("October is added "+ ll);
	        
	        System.out.println("Printing Just Odd Months");
	        System.out.println("Even months are = "+ll.get(1)+","+ll.get(3)+","+ll.get(5)+","+ll.get(7)+","+ll.get(9)+","+ll.get(11));
	        System.out.println("Odd Months are = "+ll.get(0)+","+ll.get(2)+","+ll.get(4)+","+ll.get(6)+","+ll.get(8)+","+ll.get(10));
	        
	        Iterator itr = ll.iterator();
	        while(itr.hasNext()){
	        	System.out.println(itr.next());
	        }
	        System.out.println("First month = "+ll.getFirst()+" Last month = "+ll.getLast());
	        
	        
		 System.out.println("Does LinkedList contains 'Your Birthday month'? "+ll.remove("October"));
		 System.out.println("Updated List ="+ll);	   
		 //System.out.println("Does LinkedList contains 'Winter months'? "+ll.getFirst()+","+ll.getLast());
		 System.out.println("Does LinkedList contains 'Winter months'? "+ll.contains("December")+ll.contains("January"));
		}
		
}
