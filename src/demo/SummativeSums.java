package demo;

public class SummativeSums {
	
	public static int addElements(int [] arr) {
		int theSum = 0;
		for(int i=0; i<arr.length; i++) {
			theSum = theSum + arr[i];
		}
		
		return theSum;
	}
	
	private static void output(String msg) {
		System.out.println(msg);

	}

	
	public static void main(String[] args) {
		
		int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int[] arr2 = { 999, -60, -77, 14, 160, 301 };
		int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
		140, 150, 160, 170, 180, 190, 200, -99 };
		
		output("#1 Array Sum: "+addElements(arr1));
		output("#2 Array Sum: "+addElements(arr2));
		output("#3 Array Sum: "+addElements(arr3));

	}
	

}
