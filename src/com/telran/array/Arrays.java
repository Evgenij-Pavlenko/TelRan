package com.telran.array;

public class Arrays {
	

	private static final int rand = 100; //max value arrays element
	public static void main(String[] args) {

		int aLeyght = 20; // leyght array
		int[] arrayInt = new int[aLeyght];
		
		arrayAdd(arrayInt);
		System.out.println(arrayInt);
		

	}
	public static void arrayAdd(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*rand);
			
		}
		
	}
	
	

}
