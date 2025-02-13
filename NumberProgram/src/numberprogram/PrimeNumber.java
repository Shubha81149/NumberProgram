package numberprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = sc.nextInt();

		boolean flag = true;

		if (a == 1) {
			
			flag = false;
		} else {

			for (int i = 2; i <= a / 2; i++) {

				if (a % i == 0) {
					flag = false;
					break;
				}
			}
		}

		if (flag) {
			System.out.println(a + " is a Prime Number");
		} else {
			System.out.println(a + " is not a Prime Number");
		}
	}

}
