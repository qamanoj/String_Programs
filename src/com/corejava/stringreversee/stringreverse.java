package com.corejava.stringreversee;

public class stringreverse 
{
  public static void main(String[] args) 
  {
		String s = "qspiders";
	    char[] array= s.toCharArray();
	    String s1="";
	    for (int i= 0; i<=array.length-1; i++)
	    {
	    	s1=s1+array[array.length-1-i];
		}
	    System.out.println("qspiders------>"+s1);
	}
}

