package prcatice;
import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What  is your height ?");
		int he = scan.nextInt();
		System.out.println("What is your Weight  ?");
		int we = scan.nextInt();
		if (he>=175) {
			if (we>=80) {
				System.out.println("You can be soldier");
			}
			else {
				System.out.println("you are skinny");
			}
		}
		else {
			System.out.println("Under hieght");
		}
	}

}
