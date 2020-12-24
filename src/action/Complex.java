package action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Complex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in=new Scanner(System.in);
		System.out.println("enter the any numbers");
		String s=in.nextLine();
		
		int l=s.length();
		String single[]={"one","two","three","four","five","six","seven","eight","nine"};
		String two[]={"eleven","twelve","thirteen","fourteen","sixteen","seventeen","eighteen","nineteen"};
		String	ten[]={"ten","twenty","thirty","forty","fixty","sixty","seventy","eighty","ninety"};
		
		if(l==1){
			int temp=Character.getNumericValue(s.charAt(0));
			System.out.println(single[temp-1]);
		}
		else if(l==2){
			if(Character.getNumericValue(s.charAt(1))==0){
				int temp=Character.getNumericValue(s.charAt(0));
				System.out.println(ten[temp-1]);
			}
			else if(Character.getNumericValue(s.charAt(0))==1){
				int temp=Character.getNumericValue(s.charAt(0));
				System.out.println(two[temp-1]);
			}
			else{
				int temp1=Character.getNumericValue(s.charAt(0));
				int temp2=Character.getNumericValue(s.charAt(1));
				System.out.println(ten[temp1-1]+" "+single[temp2-1]);	
			}
		}
		else
		System.out.println("Enter the 100 or below number");
		*/
		
		LinkedList<String> li=new LinkedList<String>();
	li.add("a");
	li.add("b");
	li.add("c");
	li.add("d");
	li.addFirst("da");
	li.addLast("hi");
	System.out.println(li);
	li.removeFirst();
	li.removeLast();
	li.add(0, "F");
	li.set(1, "A");
	System.out.println(li);
	}
	
}
