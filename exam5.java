package exam3;

import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char X,F,M;
		int Z;
		
		Scanner in = new Scanner (System.in);	
		System.out.print("성별과 나이를 입력하시오.");	
		X = in.next().charAt(0);
		Z = in.nextInt();
		
		F = 'F';
		M = 'M';
	
		
		if ((X == M) && (Z >= 18)) {
			
			System.out.println("MAN");
			
		}
		
		else if ((X == M) && (Z < 18)) {
			
			System.out.println("BOY");
				
		}
		
		else if ((X == F) && (Z >= 18)) {
			
			System.out.println("WOMAN");
		}
	
		else if ((X == F) && (Z < 18)) {

			System.out.println("GIRL");
		}
	
		
		else {
			
			System.out.println("다시 입력하시오.");
		}
		
		in.close();
	
	}

}
