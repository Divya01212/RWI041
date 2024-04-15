package A;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to check the number");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("no is even");
		} else {
			System.out.println("no is odd");
		}
	}
}
//}