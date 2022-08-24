package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	//private String defaultPasswordLength =10 ;
	private String department;
	private int mailboxCapacity= 500;
	private String alternateEmail;
	private String password;
	private String email;
	private String companySuffix= "company.com";

	
	//constructor to receive the firstname and lastname
	
	
	public Email (String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName= lastName;
	    this.department=setDepartment();
	     /* //call a method that returns a random password
	     this.password= randomPassword(10); 
	     System.out.println("your password is:"+this.password);*/
	    //combine elements to create email
	    email = firstName.toLowerCase()+"." +lastName.toLowerCase() +"@"+department+"."+ companySuffix;
	}
	
	
	private String setDepartment() {
		System.out.print("WELCOME" +" "+ firstName.toUpperCase()+" "+"ENTER YOUR DEPARTMENT CODE:\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter department code :");
		Scanner in =new Scanner(System.in);
	    int depChoice = in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "development";}
		else if(depChoice==3) {return "accounting";}
		else {return " ";}
		
	}
/*generate a random password
	private String randomPassword(int length) {
		String passwordSet = ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,./';\][=-@#$&()%&*(';
		char[] password= new char [length];
		for(int i=0; i<length; i++) {
			int rand = (Math.random() *passwordSet.length()); 
			password[i] = passwordSet.charAt(rand);
		} 
		return new String(password);
		
	}*/
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	//set alternate password
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	//change password 
	public void changePassword(String password) {
	this.password=password;
	}
	public int getMailboxCapacity(){return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getpassword() {return password;}
	
	public String showInfo() {
		return  "DISPLAY NAME:" + firstName + " "+lastName+
				"\nCOMPANY EMAIL:" +email +
				"\nMAILBOX CAPACITY:" + mailboxCapacity+ "mb";		
			   
	}
	
}
