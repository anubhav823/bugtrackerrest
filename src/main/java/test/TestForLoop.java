package test;

import java.util.*;

public class TestForLoop {
	public static void main(String args[]) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		for(int i=0;i<5;i++)
			list1.add(i);
		for(int i=0;i<10;i++)
			list2.add(i);
		for(Integer i:list1) {
			for(Integer j:list2) {
					System.out.println("INNER "+j);
			}
			System.out.println("OUTER "+i);
		}
		
	}
}
