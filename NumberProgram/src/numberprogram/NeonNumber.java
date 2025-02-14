package numberprogram;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int sq = n * n;
		int sum = 0;
		int m = n;
		while (sq > 0) {

			int r = sq % 10;
			sum += r;
			sq /= 10;

		}

		if (sum == m) {
			System.out.println(n + " is Neon Number");
		} else {
			System.out.println(n + " is not a Neon Number");
		}
	}

}
