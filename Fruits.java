package MapAssignment;

import java.util.HashMap;

class Fruits{
	public static void main(String[] args){
		
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		HashMap hs=new HashMap();
		
		hs.put(1,"Mango");
		hs.put(2,"Papaya");
		hs.put(3,"Banana");
		hs.put(4,"Apple");
		hs.put(5,"Orange");
		hs.put(6,"JackFruit");
		hs.put(7,"SweetLime");
		hs.put(8,"Gauava");
		hs.put(9,"Kiwi");
		hs.put(10,"Grapes");
				
		System.out.println("HashMap is "+hs);
		System.out.println("Size of HashMap is "+ hs.size());
		hs.remove(4);
		hs.remove(7);
		System.out.println("HashMap is "+hs);
		System.out.println("Does hashMap contains this 'Banana' element  " + hs.containsValue("Banana"));
		System.out.println("Does hashMap contains this 'Apple' element  " + hs.containsValue("Apple"));
		System.out.println("is hashset empty  " + hs.isEmpty());
		System.out.println("Value of 4 key: "+ hs.get("4"));
		
	    hs.clear();
	   System.out.println("get class  " +hs.getClass());
		
	   System.out.println("is HashMap empty  " +hs.isEmpty());
	    
	    
		
	}
}