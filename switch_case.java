package prcatice;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		int score =70;
		switch(score) {
		case 100:
		case 95:
		case 90 :
			System.out.println("Very Good");
			break;
		case 80:
		case 85:
		case 70 :
			System.out.println("Good");
			break;
		case 40 :
			System.out.println("fail");
			break;
			default :
				System.out.println("Invalid grade");
		}
	}
}
