package com.first;

public class StringOperations {
	public String add(String a, String b) {
		return a + b;
	}

	public int length(String a) {
		return a.length();
	}

	public boolean contain(String a) {
		return a.contains("a");
	}

	public static void main(String[] args) {
		StringOperations mo = new StringOperations();
		System.out.println("Concat:\t" + mo.add("Hello", "World"));
		System.out.println("Sub:\t" + mo.length("Bananas"));
		System.out.println("Mult:\t" + mo.contain("Happy"));

	}
}
