package numberprogram;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int sum = 0;
		int mul = 1;
		int m = n;
		
		while(n>0) {
			
			int r = n%10;
			sum+=r;
			mul*=r;
			n/=10;
		}

		if (sum == mul) {
			System.out.println(m + " is Spy Number");
		} else {
			System.out.println(m + " is not a Spy Number");
		}

	}

}
