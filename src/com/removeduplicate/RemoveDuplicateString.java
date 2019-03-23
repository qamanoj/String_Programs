package com.removeduplicate;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		
		String str="PAPA";
		
		Set<Character> set=new HashSet();
		StringBuffer sf=new StringBuffer();
		
		for (int i = 0; i <=str.length()-1; i++)
		{	
			Character ch=str.charAt(i);
			if(!set.contains(ch))
			{
				set.add(ch);
				sf.append(ch);
			}		
		}
		System.out.println(sf);
	}
}
