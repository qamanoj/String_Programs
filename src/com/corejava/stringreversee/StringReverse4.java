package com.corejava.stringreversee;

public class StringReverse4 
{
	public static void main(String[] args) 
	{
		String s="my name is manoj";
		String a[]=s.split(" ");
		/*String rev="";
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i]+" ";
		}
		System.out.println(rev);*/
		
		for (int i = 0; i <=a.length/2-1; i++) {
			String temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
