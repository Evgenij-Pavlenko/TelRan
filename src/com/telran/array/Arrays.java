package com.telran.array;

public class Arrays {
	

	private static final int rand = 100; //max value arrays element
	public static void main(String[] args) {

		int aLeyght = 20; // leyght array
		int[] arrayInt = new int[aLeyght];
		
		arrayAdd(arrayInt);
		arrayAddMega(arrayInt); // all value Int
		arrayPrint(arrayInt);
		System.out.println("Max value in Array is: " + arrayMax(arrayInt));
		
		

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
	 * add elements in Array all int
	 */
	public static void arrayAddMega(int [] arrayInt) {
		
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = (int) (Math.random()*(Integer.MAX_VALUE) - Integer.MAX_VALUE);
			
		}
		
	}
	
	/*
	 * print Array as [1, 2, 3]
	 */
	private static void arrayPrint(int[] arrayInt) {
		System.out.println("Array with leght " + arrayInt.length + ":");
		System.out.print("[");
		for (int i = 0; i < arrayInt.length; i++) {
			if (i != arrayInt.length-1) {
				System.out.print(arrayInt[i] + ", ");
			}
			else System.out.print(arrayInt[i]);
			
		}
		System.out.print("]");
		System.out.println("");
		
	}
	/*
	 * find Max element in Array
	 */
	private static int arrayMax(int[] arrayInt) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arrayInt.length; i++) {
			if (arrayInt[i] > max) {
				max = arrayInt[i];
				
			}
		}
		return max;
	}
	
	

}
