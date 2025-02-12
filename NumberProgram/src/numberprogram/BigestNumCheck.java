package numberprogram;

import java.util.Scanner;

public class BigestNumCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1st Number: ");
		int m = sc.nextInt();
		System.out.println("Enter a 2nd Number: ");
		int n = sc.nextInt();
		
        if(m>n) {
        	System.out.println("M is a Bigger Number");
        }else {
        	System.out.println("N is a Bigger Number");
        }
		
	}

}
