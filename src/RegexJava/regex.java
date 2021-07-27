package RegexJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstName();
		userRegistration.lastName();

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
}

