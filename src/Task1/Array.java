package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the size of the array");
		Scanner s=new Scanner(System.in);
		int size= s.nextInt();
		int myArray[]= new int[size];
		int sum=0;
		System.out.println("Enter the elements of the array one by one");
		for(int i=0; i<size; i++) {
			myArray[i] = s.nextInt();
			sum = sum+ myArray[i];
		}
		System.out.println("Elements of the array are:" + Arrays.toString(myArray));
		System.out.println("Sum of the element of the array::"+sum);
	}


	}


