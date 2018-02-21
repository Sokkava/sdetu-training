package basics;

public class Whether {
	public static void main (String []args) {
		
		int temperature = 45;
		String sunCondition = "Overcast"; 
		
		if (temperature > 80) {
			System.out.println ("it is pleasant. Wear shorts and t-shirts");
			System.out.println ("Wear a hat to keep the sun out of your eyes. ");
		}		
		else if ((temperature > 60) && (sunCondition != "Sunny")) { 
			System.out.println ("This is cool day, make sure to wear warmer clothes.");
		}
		else { 
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
		System.out.println("The program is ending");	
	}
}
