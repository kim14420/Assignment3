package exam3;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner (System.in);

		System.out.print("정수를 입력하시오: ");
		int x = input.nextInt();

		if (x == 0) {

			System.out.println("zero");
		}

		else if (x > 0) {

			System.out.println("plus");
		}

		else {

			System.out.println("minus");
		}

		input.close();
	}

}
