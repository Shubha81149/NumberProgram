package numberprogram;

import java.util.Scanner;

public class CheckBigestThreeNumberIn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1st Number: ");
		int a = sc.nextInt();
		System.out.println("Enter a 2nd Number: ");
		int b = sc.nextInt();
		System.out.println("Enter a 3rd Number: ");
		int c = sc.nextInt();

		if(a>b) {
			if(a>c) {
				System.out.println(a+" is a biggest number");
			}else {
				System.out.println(c+" is a biggest number");
			}
		}else {
			System.out.println(b+" is a biggest number");
		}
	}

}
