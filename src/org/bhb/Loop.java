package org.bhb;

public class Loop {
public static void main(String[] args) {
	//			1	2	   4
	for (int i = 0; i <5; i++) {
		if (i==3) {
			continue;
		}
		//				3
		System.out.println(i);
	}
	
}
}
