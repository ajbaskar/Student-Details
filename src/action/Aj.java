package action;

import java.awt.List;
import java.util.ArrayList;

public class Aj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a[]={1,2,3,4,5,6},c;
		c=a.length;
		
		for(int j=0;j<a.length;j++)
			if(j%2==0)
				System.out.print(a[j]);
				
			
		
		for(int j=0;j<a.length;j++)
			if(j==1 | j==c-1)
				System.out.print(a[j]);
		
		for(int j=0;j<a.length;j++)
			if(j==c/2)
				System.out.print(a[j]);*/
		
		
		/*String s="11:05:45PM",f,res="";
		int i;
		String find=s.substring(8);
		if(find.equals("AM")){
			f=s.substring(0,2);
			if(f.equals("12"))
				res="00"+s.substring(2,8);
			else
				res=s.substring(0,8);
			
		}
		else if(find.equals("PM")){
			i=Integer.parseInt(s.substring(0,2));
			if(i==12){
				res=s.substring(0,8);
			}
			else{
				i+=12;
				res=i+s.substring(2,8);
			}
		}*/
		
		/*String s="abcdef";
		String res=s;
		res+=res.substring(0,2);
		System.out.println(s);
		System.out.println(res);
		*/
		int b=0;
		ArrayList<Integer> li=new ArrayList<Integer>();
		ArrayList<Integer> li2=new ArrayList<Integer>();
		li.add(42);
		li.add(43);
		li.add(38);
			for(int a:li){
				b=a;
				if(b<38){
					li2.add(a);
					continue;
				}
				else{
					int c=100-b;
					int f=c%10;
					if(f>5)
						f=f-5;
					
					if(f<3)
						li2.add(a+f);
					else
						li2.add(a);
				}
				
			}
			
			
			System.out.print(li2);
			
			
		}
		
	}


