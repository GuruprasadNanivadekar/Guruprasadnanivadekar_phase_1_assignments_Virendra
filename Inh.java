package AmulAssignment;

class Product {

	int id = 98;
	String name= "Amul";
	
	
}
	class classA extends Product {
		int count = 80;
		String category = "Butter";
		
		
	}
	
	class classB extends Product {
		int count = 90;
		String category = "Milk";
		
		
	}
	
	class classC extends Product {
		int count = 100;
		String category = "choco";
		
		void display(){
			System.out.println("Id = " +id +" "+ "Name = " + name + " count = "+ count + " category = " + category);
		}
	}

	class subA extends classA {
		int price = 30;
		int total = count * price;
		void display(){
			System.out.println("Id = " +id +" "+ "Name = " + name + " count = "+ count + " category = " + category +" "+ "total = "+total);
		}
	}

	class subB extends classB {
		int price = 10;
		int total = count * price;
		void display(){
			System.out.println("Id = " +id +" "+ "Name = " + name + " count = "+ count + " category = " + category +" " + "total = "+total);
		}
	}
	
	
	
public class Inh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subA a = new subA();
		a.display();
		subB b = new subB();
		b.display();
		classC c = new classC();
		c.display();
	}

}