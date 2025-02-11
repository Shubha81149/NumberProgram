package basics;

import java.util.ArrayList;

public class SkipOneNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<=10;i++) {
			
			if(i==3) {
				continue;
			}
			al.add(i);
		}
		System.out.println("SkipTheOneNumber: "+al);
	}
}
