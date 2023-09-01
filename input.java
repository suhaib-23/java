package prcatice;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result;
		System.out.println("Enter Your Num 1 :  ");
		int x = scan.nextInt();
		
		System.out.println("Enter Your Num 2 :  ");
		int y = scan.nextInt();
		 result = x+y;
		 System.out.print(result);
	}
}
