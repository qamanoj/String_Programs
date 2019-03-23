package com.removeduplicate;

import java.util.HashSet;
import java.util.Set;

public class StringRemove1 {
	public static void main(String[] args) {
		
		String s="java hibernate java python spring";
		String []s1=s.split(" ");
		
		Set<String> set=new HashSet();

		for (int i = 0; i < s1.length; i++)
		{
			if(!set.contains(s1[i]))
			{
				set.add(s1[i]);
			}
		}
		System.out.println(set);
	}
}
