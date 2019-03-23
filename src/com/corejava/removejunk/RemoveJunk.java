package com.corejava.removejunk;

public class RemoveJunk 
{
	public static void main(String[] args) 
	{
		String s="12345abcdefgABCDEFG@#$%&*()+java";
		s=s.replaceAll("[a-zA-z0-9]","");
		System.out.println(s);
		
		System.out.println("***********");
		
		String s1="12345@@@@@@#$#$#$#%&%&%&%&abbbsgbGSGBSGGSjava";
		s1=s1.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s1);
		
		System.out.println("***********");
		
		String s2="12345 @@@@@@ #$#$#$# %&%&%&%& abbbsgb GSGBSGGS java";
		s2=s2.replaceAll("[^A-Z]", "");
		System.out.println(s2);
	}
}
