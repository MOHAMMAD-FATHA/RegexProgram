package RegexJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstName();
		userRegistration.lastName();
		userRegistration.email();
		userRegistration.contactNumber();
		userRegistration.password1();
		userRegistration.password2();
	}
}

class UserRegistration {
	Scanner sc;
//User's First Name
	public void firstName() {
		sc = new Scanner(System.in);
		System.out.print("Enter First Name :: ");
		String FirstName = sc.next();
		boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", FirstName);
		if (answer ) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid first name ");
		}

	}
//User's Last Name 
public void lastName(){
    sc = new Scanner(System.in);
    System.out.print("Enter Last Name :: " );
    String LastName = sc.next();
    Boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}",LastName);
    if (answer){
        System.out.println("thank you");
    } else {
        System.out.println("please enter valid last name ");
    }

}
//User's Email Address
public void email(){
    sc = new Scanner(System.in);
    System.out.print("Enter email ID :: " );
    String Email = sc.next();
    Boolean answer = Pattern.matches("^[a-zA-Z0-9+_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",Email);
    if (answer){
        System.out.println("thank you");
    } else {
        System.out.println("please enter valid email ID ");
    }

}
//User's Contact Number
public void contactNumber(){
    sc = new Scanner(System.in);
    System.out.print("Enter contact number with country code :: " );
    String ContactNumber = sc.nextLine();
    boolean answer = Pattern.matches("91\\s[0-9]{10}",ContactNumber);
    if (answer){
        System.out.println("Thank you");
    }else {
        System.out.println("enter valid contact number");
    }

}

public void password1(){
    // rule1 = minimum 8 characters
    sc = new Scanner(System.in);
    System.out.print("Enter password  :: " );
    String password = sc.nextLine();
    boolean answer = Pattern.matches("[a-zA-Z0-9]{8,}",password);
    if (answer){
        System.out.println("Thank you");
    }else {
        System.out.println("enter valid password");
    }
}

public void password2(){
    // rule1 = minimum 8 characters & atleast 1 upper case
    sc = new Scanner(System.in);
    System.out.print("Enter password  :: " );
    String password = sc.nextLine();
    boolean answer = Pattern.matches("[A-Z]+[a-z]{7,}",password);
    if (answer){
        System.out.println("Thank you");
    }else {
        System.out.println("enter valid password");
    }
}
}
