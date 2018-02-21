package OOP;
class Person  {
		
	String name;
	String email; 
	String phone;
	
	void walk() {
		System.out.println(name + "is walking");
	}
	
	void eat()  {
		System.out.println(email);
	}
	
	void sleep ()  { 
		System.out.println(name + " is sleeping");
		
	}
}
public class Demo {
	
	public static void main (String[] args)  {
		
	
			Person person1 = new Person();
			person1.name = "Joe";
			person1.email = "joe@testmail.com";
			person1.phone = "7897897894";
			
			person1.walk();
			person1.sleep();
			person1.eat();
		}
		
		//Attributes, variables , adjectives , descriptors
		String name = "Joe";
		String email = "joe@testmail.com";
		String phone = "787988383"; 
		
		//Action, activity, behavior
	    void walking(name);
		System.out.println(name + " is walking");
		System.out.println(name + " is eating");

		//What if we wanted to do this for another person?
		String name2 =  "Sarah";
		String email2 = "sarah@testmail.com";
		String phone2 = "32782827282";
		
		walking(name2);
		System.out.println(name2 + " is eating");
		}
	// Enhance by adding functions to minimize code
	static void walking(String name)  {
		System.out.println(name + " is walking ");
		 }
     }

