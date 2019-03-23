package com.string.duplicatestring;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString 
{
	public static void main(String[] args) {

		String duplicates[]=new String[]{"java","string","hibernate","java"};
		
		/*String s="java spring hibernate java rest";
		String []duplicates=s.split(" ");*/
		
		Set nondup=new HashSet<>();
		Set dup=new HashSet<>();

		for(String string:duplicates)
		{
			if(!nondup.contains(string))
			{
				nondup.add(string);
			}
			else
			{
				dup.add(string);
			}
		}
		System.out.println(dup);
	}
}

