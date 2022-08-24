package emailapp;

public class EmailApp {
	public static void main(String[] args) {
		
	Email em1 = new Email("john","migwi");
	em1.setAlternateEmail("alexia@gmail.com");
    em1.showInfo();
    System.out.println(em1.showInfo());
	}
}
