package com.string.wordcountinstring;

public class WordCountinString 
{

	public static void main(String[] args) 
	{
		String str="hello world demo program";
		char[] ch=str.toCharArray();
		for (int i = 0; i <=ch.length-1; i++)
		{
			String s="";
			while(i<ch.length && ch[i]!=' ')
			{
				s=s+ch[i];
				i++;
			}
			//if(s.length()>0)
				System.out.println(s+"--->"+ s.length());
		}
	}
}
