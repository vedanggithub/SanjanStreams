package com.wbl;


interface TestInterface{
    String getValue(int i);
}
public class EvenOROdd {
		    public static void main(String[] args) {
	        //block lambda
	        TestInterface ref = (int i) -> {
	            String s;
	            if((i % 2) == 0) {
	                s = "Even";
	            }else {
	                s = "Odd";
	            }
	            return s;
	        };
	        
	        int num = 5;
	        System.out.println(num + " is- " + ref.getValue(num));
	    }
}
