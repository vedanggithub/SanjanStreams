package com.wbl;

public class Reverse {
	public static void main(String[] args) {

		ReverseInteface<String> reverse = (str) -> {

			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};

		System.out.println("Lambda reversed = " + reverse.func("Lambda"));
	}
}
