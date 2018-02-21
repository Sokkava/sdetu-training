package basics;

public class Cities {
	
	public static void main(String[] args) { 
		
		String[] cities = {"New York", "San Francisko", "Miami", "Dallas"};
			
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);		
		
		
		String[] countries; 
		
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[3]);
	
		
		//Declare the array 
				String[] states = new String [5];
				states[0] = "California";
				states[1] = "Ohio";
				states[2] = "New Jersey";
				states[3] = "Texas";
				states[4] = "Utah";
				
				int i = 0;
				do { 				
				System.out.println(states[i]);
				i = i + 1; 
				} while (i<5); 		
				// while loop:tests condition first then enters loop
				int n =0 ;
				while (n <=4) { 
		String state = states[n];
					if (state == "Texas") {
						System.out.println("STATE FOUND !");
						boolean stateFound = true;
					}
					n++; 
					}	
				System.out.println("\nPrintin with for loop");
				for (int x = 0; x <5; x++) {
						System.out.println(states[x]);
				}
				
	         }	
           
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	

