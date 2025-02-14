package numberprogram;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int m = n;
		while (n > 0) {

			int r = n % 10;
			int fact = 1;

			for (int i = 1; i <= r; i++) {
				fact *= i;
			}
			sum += fact;
			n /= 10;
		}

		if (sum == m) {
			System.out.println(m + " is a Strong Number");
		} else {
			System.out.println(m + " is not a Strong Number");
		}
	}

}
