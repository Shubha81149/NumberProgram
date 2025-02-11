package basics;

import java.util.ArrayList;

public class NaturalNumber {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<10;i++) {
			
			al.add(i);
		}
		System.out.println("Natural numbers are: "+al);
	}

}
