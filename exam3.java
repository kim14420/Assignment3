package exam3;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a;
		String b;
		
		Scanner in = new Scanner (System.in);	
		System.out.print("Number? ");			
		a = in.nextInt();
		
		switch (a) {
		
			case 1:
			b = "dog";
			break;
			case 2:
			b = "cat";
			break;
			case 3:
			b = "chick";
			break;
			
			default:
			b = "I don't know";
			break;
		}
		
		System.out.println(b);
		
		in.close();
		
		
	}

}
