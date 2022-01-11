package HashSetAssignment;

import java.util.LinkedHashSet;

class HashSetAssignment{
	public static void main(String[] args){
		
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		
		hs.add("Mango");
		hs.add("Papaya");
		hs.add("Banana");
		hs.add("Apple");
		hs.add("Orange");
		hs.add("JackFruit");
		hs.add("SweetLime");
		hs.add("Gauava");
		hs.add("Kiwi");
		hs.add("Grapes");
				
		System.out.println("LinkedHashset is "+hs);
		System.out.println("Size of LinkedHashset is "+ hs.size());
		
		System.out.println("Does Linkedhashset contains this 'Orange' element  " + hs.contains("Orange"));		
		System.out.println("is Linkedhashset empty  " + hs.isEmpty());
		System.out.println("remove the element "+hs.remove("JackFruit")+hs.remove("SweetLime"));
		System.out.println("LinkedHashset is "+hs);
		System.out.println("Size of LinkedHashset is "+ hs.size());
		
	    hs.clear();
	    System.out.println("get class  " +hs.getClass());
		
	    System.out.println("is Linkedhashset empty  " +hs.isEmpty());
	    
	    
		
	}
}