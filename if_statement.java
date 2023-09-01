package prcatice;

import java.util.Scanner;

public class if_statement {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter Your Time  :");
		int time =scan.nextInt();
		if (time>=5  && time<=18) {
			System.out.print("Have nice day");
		}
		else if (time<18  && time>24) {
			System.out.print("have nice night ");
		}
		else {
			System.out.print("Invalid");
		}
	}

}
