package exam3;

import java.util.Scanner;

public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,x,y;
		

		Scanner in = new Scanner (System.in);	
		System.out.print("년을 입력하시오: ");	
		a = in.nextInt();
		
		x = 4;
		y = 0;
		
		
		if (a%x == y) {
			
			System.out.println("leap year");
		}
		
		else if (a%x != y)  {
			
			System.out.println("common year");
		}
		
		else {
			
			System.out.println("다시입력하시오.");
			
		}
		
		in.close();
	}

}
