package OOP;

public class BankAccountApp {
	//Creating a new bank account >> 
	
	public static void main(String[] args)  {
		
		BankAccount acc1 = new BankAccount();
		// acc1.accountNumber = "01689453";
		
		// with Encapsulation : public API methods
		acc1.setName ("Roger Hue");   
		System.out.println(acc1.getName());
		
		acc1.accountNumber = "01689453";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(2000);
		
		//Polymorphism through overriding 
		System.out.println (acc1.toString());
				
		// Polymorphism through overloading
		
		 BankAccount acc2 = new BankAccount("checking Account", 0); 
	    acc2.accountNumber = "01689453";
	    
	    BankAccount acc3 = new BankAccount ("Savings Account", 5000);
	    acc3.accountNumber = "01689453";
	    acc3.checkBalance();

	    // Demo for inheritance 
       /*  CDAccount cd1 = new CDAccount();
         cd1.balance = 3000;
         cd1.interestRate = "4.5";
         cd1.name = "Juan";
         cd1.accountType = "CD Account";
         System.out.println(cd1.toString());
         cd1.compount();
         */
         
     }
}
         
       
         
         



