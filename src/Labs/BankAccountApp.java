package Labs;

public class BankAccountApp {
		public static void main(String[] args) { 
			BankAccount acc1 = new BankAccount("465329874", 1000, 50);
			BankAccount acc2 = new BankAccount("465329874", 1000);
			BankAccount acc3 = new BankAccount("465329874", 1000);
			
			acc1.setName ("Jim");
			System.out.println(getName());
			acc1.makeDeposit(500);
			acc1.makeDeposit(500);
			acc1.makeDeposit(600);
	}

		private static char[] getName() {
			// TODO Auto-generated method stub
			return null;
		}

} 
      class BankAccount {
	// Properties of bank account	
	private static int iD = 1000;
	private String accountNumber;  //ID + random  2 digit number + SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance; 
	
	// Constructor 	
	public BankAccount(String SSN, double initDeposit) {
	    balance = initDeposit;
	    this.SSN = SSN;
	    iD++;
	    setAccountNumber();    
     }
	private void setAccountNumber()   {
  	    int random = (int) (Math.random()*10);
  	    accountNumber = iD +""+ random + SSN.substring(0,2);
  	    System.out.println("Your Account Number"+accountNumber);
  	   // accountNumber = iD + " " + random + SSN.substring(0, 2);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName()  { 
		return name;	
	}
	public void payBill (double amount)  {
		balance = balance-amount;
	}
	public void makeDeposit(double amount) {
		balance = balance+amount;
	}	
}

