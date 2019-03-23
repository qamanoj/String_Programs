package com.corejava.swapping;

public class Swapping 
{
	public static void main(String args[])
    {
        // Declare two strings
        String a = "Hello";
        String b = "Worldwide";
         
        // Print String before swapping
        System.out.println("Strings before swap: a = " + a + " and b = "+b);
         
        // append 2nd string to 1st
        a = a + b;
         
        // store intial string a in string b
        b = a.substring(0,a.length()-b.length());
         
        // store initial string b in string a
        a = a.substring(b.length());
         
        // print String after swapping
        System.out.println("Strings after swap: a = " +a+ " and b = " + b);        
        
        /*String s="manojkumar";
       String s1=s.substring(5);		//kumar
        System.out.println(s1);*/
    }    
}
