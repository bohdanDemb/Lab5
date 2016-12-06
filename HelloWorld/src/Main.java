import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥м`€ користувача");
		String userName = sc.next();
		System.out.println("¬вед≥ть р≥вень доступу");
		String password = sc.next();
		if(password.equals("admin")){
			System.out.println("Hello, administrator" );
		}
		else
		System.out.println("Hello, "+userName);
	}
}
