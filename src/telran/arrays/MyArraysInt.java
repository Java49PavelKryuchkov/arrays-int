package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {
	static public int [] addNumber(int [] array, int num) {
		int array2[] = Arrays.copyOf(array, array.length+1);
		array2[array.length] = num;
		return array2;

	}
	public static int[] removeNumber(int [] array, int index) {
		//removes element at a given index for right index value (0 - array.lenght-1) 
		//and and returns new array without this element
		//returns the source array for a wrong index value
		//using the standard method System.arraycopy
		int result[] = array;
		if(index>-1 && index<array.length) {	
			result = new int[array.length-1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index+1, result, index, result.length-index);
		}
		return result;
	}
	public static int [] insertNumber(int [] array, int index, int num) {
		//inserts a given num at a given index for right value of index (0 - array.lenght) 
		//and returns new array with the inserted one
		//returns the source array for a wrong index 
		//value (less, than 0, and greater, than array.lenght)
		//using the standard method System.arraycopy
		int result[] = array;
		if(index>-1 && index<=array.length) {	
			result = new int[array.length-1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index, result, index+1, result.length-index);
		}
		return result;
	};
}
	