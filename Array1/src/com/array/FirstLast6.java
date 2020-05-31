package com.array;

public class FirstLast6 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		arr[0] = 5;
		arr[1] = 3;
		arr[2] = 6;
		arr[3] = 7;
		arr[4] = 5;
		
		boolean flag = firstLast6(arr);
		
		System.out.println(flag);

	}

	private static boolean firstLast6(int[] arr) {
		boolean flag=true;
		for(int i=0; i<3; i++) {
			//System.out.println(arr[i]);
			if(arr[0] == 6 || arr[arr.length-1] == 6) {
				flag =  true;
			}
			else {
				flag = false;
			}
		}
		
		return flag;
	}

	

}

