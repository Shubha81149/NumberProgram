package numberprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = sc.nextInt();

		for(int i=1;i<=a;i++) {
			
			if(a%i==0) {
				al.add(i);
			}
		}
		System.out.println("Factor of The Numbers are: "+al);
	}

}
