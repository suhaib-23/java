package prcatice;
import java.util.Scanner;
public class logic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = 18;
		System.out.println("Enter Your Age :");
		age = scan.nextInt();
		if ((age >= 18)) {
			System.out.print("You Can Vote");
		}
		else {
			System.out.print("You Can't Vote");
		}
	}

}
