package com.anagram;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		String s1="java";
		String s2="vaaj";
		
		char[]a1=s1.toCharArray();
		char[]a2=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
}
