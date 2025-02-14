package numberprogram;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		int sum = 0;
		int m = n;
		int t = n;
		int count = 0;

		while (t > 0) {
			count++;
			t /= 10;
		}
		t = n;
		while (t > 0) {

			int r = t % 10;
			int mul = 1;

			for (int i = 1; i <= count; i++) {
				mul *= r;
			}
			sum += mul;
			t /= 10;
		}

		if (sum == m) {
			System.out.println(m + " is a ArmStrong Number");
		} else {
			System.out.println(m + " is not a ArmStrong Number");
		}

	}

}
