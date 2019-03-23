package com.corejava.extra;

import java.util.Scanner;

public class Example 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line");
		String s=sc.nextLine();
		//char[] c=s.toCharArray();
		String[] c=s.split(" ");
		String	temp = c[0];
		c[0] = c[c.length-1];
		c[c.length-1]=temp;
			
		for (int i = 0; i <=c.length-1; i++) 
		{
			System.out.print(c[i]+" ");
		}
	}
}

