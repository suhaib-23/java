package prcatice;
import java.util.Scanner;
public class nested_if {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Your Age  :");
		int age = scan.nextInt();
		System.out.println("Have liceanse  ?");
		boolean ag = scan.nextBoolean();
		if(age>=16 && ag) {
			System.out.println("You Can Drive");
		}
		else {
			System.out.println("Get Out");
		}

	}

}
