package exam3;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner (System.in);	
		String a, b;
		System.out.print("영문 대문자를 입력하시오.: ");			
		a = in.nextLine();
		
		switch (a) {
		case "A":
			b = "Excellent";
			break;
		case "B":
			b = "Good";
			break;
		case "C":
			b = "Usually";
			break;
		case "D":
			b = "Effort";
			break;
		case "F":
			b = "Failure";
			break;
			
		default:
			b = "error";
			break;
			
			
		}
		
		System.out.println(b);
		
		in.close();
	}

}
