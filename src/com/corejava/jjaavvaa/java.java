package com.corejava.jjaavvaa;

import java.util.Scanner;

public class java 
{
 public static void main(String[] args) 
 {
	String s="java";
	char a[]=s.toCharArray();
	String s1="";
	for (int i = 0; i <=a.length-1; i++) 
	{
	  s1=s1+a[i]+a[i];	
	}
	System.out.println(s1);
}
}
