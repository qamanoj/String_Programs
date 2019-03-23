package com.ocorances;

import java.util.HashMap;

public class Ocurance {

	public static void main(String[] args) {
		
		String s="better";
		char[] c=s.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		//System.out.println(map); o/p={}
		for(int i=0;i<=c.length-1;i++)
		{
			if(map.containsKey(c[i]))
			{
				map.put(c[i], map.get(c[i])+1);
			}
			else
			{
				map.put(c[i], 1);
			}
		}
		System.out.println(map);
	}
}
