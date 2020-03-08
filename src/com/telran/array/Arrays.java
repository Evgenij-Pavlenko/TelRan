package com.telran.array;

public class Arrays {
	

	private static final int rand = 100; //max value arrays element
	public static void main(String[] args) {

		int aLeyght = 20; // leyght array
		int[] arrayInt = new int[aLeyght];
		
		arrayAdd(arrayInt);
		arrayPrint(arrayInt);
//		arrayMax(arrayInt);
		
		

	}
	/*
	 * add elements in Array
	 */
	public static void arrayAdd(int [] arrayInt) {
		
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = (int) (Math.random()*rand);
			
		}
		
	}
	
	/*
	 * print Array as
	 */
	private static void arrayPrint(int[] arrayInt) {
		System.out.println("Array with leght " + arrayInt.length);
		System.out.print("[");
		for (int i = 0; i < arrayInt.length; i++) {
			if (i != arrayInt.length-1) {
				System.out.print(arrayInt[i] + ", ");
			}
			else System.out.print(arrayInt[i]);
			
		}
		System.out.print("]");
		
	}
	
	

}
