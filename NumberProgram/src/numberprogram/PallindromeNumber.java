package numberprogram;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int rev = 0;
		int m = n;
		while(n>0) {
			
			int r = n%10;
			rev = (rev*10)+r;
			n/=10;
		}
        if(rev == m) {
        	System.out.println(m+" is a Pallindrome");
        }else {
        	System.out.println(m+" is not a Pallindrome");
        }
	}

}
