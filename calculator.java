package prcatice;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose Your Operator :----");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		int choose = scan.nextInt();
		System.out.println("Enter First Number :");
		int x = scan.nextInt();
		System.out.println("Enter Second Number :");
		int y =scan.nextInt();
		
		if(choose == 1) {
			System.out.println("The Answer is " + add(x,y));
		}
		else if(choose == 2){
			System.out.println("The Answer is " + sub(x,y));
		}
		else if(choose == 3){
			System.out.println("The Answer is " + mul(x,y));
		}
		else if(choose == 4){
			System.out.println("The Answer is " + div(x,y));
		}
		else {
			System.out.println("You're Out Of Range");
		}
	}
	public static int add(int x ,int y) {
		int result ;
		result = x+y;
		return result;
	}
	public static int sub(int x ,int y) {
		int result ;
		result = x-y;
		return result;
	}
	public static int mul(int x ,int y) {
		int result ;
		result = x*y;
		return result;
		
	}
	public static int div(int x ,int y) {
		int result ;
		result = x/y;
		return result;
	}

}
