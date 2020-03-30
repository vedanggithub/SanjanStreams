package com.wbl;

import java.util.function.BiFunction;

 class Multiplay {
		   public static int multiply(int a, int b){  
			return a*b;  
		   }  
		}  
		public class Multilication {  
		   public static void main(String[] args) {  
			BiFunction<Integer, Integer, Integer> product = Multiplay::multiply;  
			int pr = product.apply(11, 5);  
			System.out.println("Product of given number is: "+pr);  
		   }  
		}

