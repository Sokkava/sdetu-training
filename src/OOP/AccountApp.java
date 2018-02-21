package OOP;

  public class AccountApp { 
	  
	  public static void main(String[] args) {
		  LoanAccount la = new LoanAccount();
		  la.increaseRate(); 
		  la.setRate();
		  la.setAmortSchedule();
		  la.setTerm(20);	
		  
		  // Polyphormism changes where we are pointing
		  
		  IRate account1 = new LoanAccount();
		 account1.increaseRate();
		 account1.setRate();		 
	  }
  }