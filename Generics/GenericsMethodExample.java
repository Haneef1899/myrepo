package com.tns.Generics;

public class GenericsMethodExample {

	
	public static <T> void printArray(T[] elements) {
		for(T element: elements) {
			System.out.print(element + " ");
            
		}
		System.out.println();
		
	}
	public static void main(String args[]) {
		Integer[] intArray= {1,2,3,4,5};
		String[] strArray= {"Hello" , "world"};
		
		
		System.out.print("Integer Array: ");
		printArray(intArray);
		System.out.print("String Array:");
		printArray(strArray);
	}
}
