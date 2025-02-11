package numberprogram;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		if(n%2==0) System.out.println(n+" is A Even Number");
		else System.out.println(n+" is not A Even Number");

	}

}
