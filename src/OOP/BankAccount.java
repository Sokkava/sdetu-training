package OOP;

public class BankAccount implements IRate {		
	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
		// final >> constant (often static final) 
	private static final String routingNumber = "013546";
	
	private String name;
	String ssn; 
	String accountType; 
	int balance;
	
	// Constructor  definitions: unique methods
	// 1. They are used to define /setup/ initialize properties of an object
	// 2. Constructors are IMPLICITILY called upon INSTANTIation
    // 3. The same name as the class itself
	// 4. Constructors have NO return type
	
	BankAccount() {
		System.out.println("New Account created");
	}
	// Overloading: call same method name with different arguments
	
	BankAccount(String accountType, double initDeposit)  {
		//initDeposit, accountType, Msg are all local variables
		System.out.println("New Account: " + accountType);
		System.out.println("INITIAL DEPOSIT OF : $ " + initDeposit );
	    String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must at least $1,000" ; 
		} else { 
			Msg = "Thanks for you initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = (int) initDeposit;
	}
	
	//Getters / setters 
	
	// Allow the user to define name
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	public String getName() { 
		return name;
	}
	public String getSsn()  {
 	  return ssn;
    }
	
	public String setSsn(String ssn)  {
		return this.ssn = ssn;
	}
	
	// Interface methods 
	
	public void setRate()  {
		System.out.println("SETTINGS RATE");
	}
	public void increaseRate() { 
		System.out.println("INCREASING RATE");
	}
		
	// Define methods 	
	public void deposit (double amount) {
         balance = (int) (balance + amount);
         showActivity ("DEPOSIT");
    }	
	
	void withdraw (double amount)  {
		balance = (int) (balance + amount);
		showActivity("WITHDRAW");	
		
	}
		private void showActivity(String activity) {
			System.out.println("Your recent transaction:"  +  activity);
			System.out.println("Your balance is: $"  +  balance );
			// TODO Auto-generated method stub		
	 }
     void checkBalance() {
    	 System.out.println("Balance: " + balance);    	 
     }
     
     void getStatus()  {
     
     }
      
     @Override
     public String  toString() {
		return " [ " + name + " . " + accountNumber + ".BALANCE: $" + balance + "]" ;
    	 
     }
}
    	 
     	 
    	 
    	 
    	 