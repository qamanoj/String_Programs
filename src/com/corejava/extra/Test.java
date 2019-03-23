package com.corejava.extra;

public class Test {
	public static void main(String[] args) {
		
		String s="manoj";
		char[] ch=s.toCharArray();
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
