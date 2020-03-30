package com.wbl;

public class Factorial {


	    public static void main( String[] args ) {


	        FactorialInterface<Integer> factorial = (n) -> {

	            int result = 1;
	            for (int i = 1; i <= n; i++)
	            result = i * result;
	            return result;
	        };

	        System.out.println("factorial of 5 = " + factorial.func(5));
	    }
	}

