      public class Lab3 {
	
	  public static void main(String[] args) {
	        // Create a Student
	   Student stu1 = new Student("Debora", "3215555689");	
	   Student stu2 = new Student("Issabell", "3215555689");
	   Student stu3 = new Student("Daniela", "3215555689");
	   
	   stu1.enroll("Math151");
	   stu2.enroll("Eng255");
	   stu3.enroll("His211");
	   
	   // stu1.showCourses();
	   //  stu1.checkBalance();
	   stu1.payTuition(600);
	   // stu1.checkBalance();
	   System.out.println(stu1.toString());
     }
  }
       class Student { 	 
	      private static int iD=1;
	      private String userId;
	      private String name;
	      private String ssn;
	      private String email;
	      public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		  private String phone;
	      private String city;
	      private String state;
	      private String courses = " ";
	      private static final int costOfCourse = 800;
	      private int balance = 0;	      
	 
	    public Student (String name, String ssn) {
	            iD++;
	         this.name = name;
	         this.ssn = ssn;
	         setUserId();
          	 setEmail();
       }
	    
     private void setAccountID() {
		// ODO Auto-generated method stub		
       }
     
     private void setEmail ()  {
	 email = name.toLowerCase() + "@sdetuniversity.com";
       System.out.println("Your email:  " +email);
       }     
     private void setUserId()  {
    	 int max = 90;
    	 int min = 10;
    	 int randNum =(int) (Math.random() * ((max - min)));
    	 randNum = randNum + min; 
    	 userId = iD + randNum + ssn.substring(6);
    	 System.out.println("Your User ID: "  + userId);
        }
     public void enroll(String course)  {
    	 this.courses = this.courses + "\n" + course;
    	 balance = balance + costOfCourse;    	 
        }
     
     public void payTuition(int amount)   {
    	 System.out.println("Payment: $" + amount); 
    	 balance = balance + amount;
         }     
     public void checkBalance() {
    	 System.out.println("Balance: $" + balance);     
         }        
     public void showCourses()  {  
    	 System.out.println(courses);
         }
     public String toString()   {
    	 return null "[	NAME:   " + name + " ]\n[COURSES: " + courses " ]\nBALANCE: "  + BALANCE + " ]";
    	 }
            }
    	 
    	