package exam3;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,x;
		
		
		Scanner in = new Scanner (System.in);	
		System.out.print("월을 입력하시오: ");	
		a = in.nextInt();
		
		switch (a) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			x = 31;
			break;
		
		case 2:
			x = 28;
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			x = 30;
			break;
		
		default:
			x = 0;
			break;
			
					
		}
		
		System.out.println(x);
	
		in.close();
	}

}
