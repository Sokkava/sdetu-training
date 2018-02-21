package basics;

public class Strings {
	
	public static void main(String [] args) {
		String bookTitle;
		String wordChoice = "Rings";
		bookTitle = "The lord of the Kings";
		
		if (bookTitle.contains("Rings")) {
			System.out.println("The book contains the word Ring");
		}
		
		String browser = "Choice";
		
		if (browser.equalsIgnoreCase("Choice")) {
			System.out.println("The browser is chrome");
			
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "98412536";
		
		
		//firstName.substring(0, 1);
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,3));
		System.out.println(SSN.substring(5));
		
	}
}
	
	
	
