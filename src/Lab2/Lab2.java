package Lab2;

public class Lab2 {

}

class Student {
	// Properties	
	private static int iD=1000;
    private int userId;
    private String name;
    private String ssn;
    private String email; 
    private static final int costOfCourse = 800;
    private int balance;
    
    public Student (String name, String ssn)  {
    	iD++;
    	this.name = name;
    	this.ssn = ssn;
    	setUserId();
    	setEmail();
    }
    
    private void setEmail () {
    	email = name.toLowerCase() + " . " + iD + "@sdetuniversity.com";
    	System.out.println("Your email: " + email);
    }
    
    private void setUserId () {
    	int max = 9000;
    	int min = 1000;
    	int randNum = (int) (Math.rondom) + ((max - min)));
    	randNum = randNum + min;
    	System.out.println(randNum);
    }
    
    
    
    
    
    
    
    

}