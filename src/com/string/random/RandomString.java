package com.string.random;

import java.util.Random;

public class RandomString {
	public static void main(String[] args) {
		
		Random r=new Random();
		String[] s=new String[10];
		
		for(int i=1;i<10;i++)
		{
			int no=r.nextInt(10);
			s[i]=Integer.toString(no);
			System.out.println(s[i]);
		}
	}
}
