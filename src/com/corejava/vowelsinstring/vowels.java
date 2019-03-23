package com.corejava.vowelsinstring;

public class vowels 
{
	public static void main(String[] args)
	{
		String s="qspiders java";
		char array[]=s.toCharArray();
		int count=0;
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
			{
				System.out.println(array[i]);
				count++;
			}
		}
		System.out.println("no of vowels "+count);
	}

}
