//Java Program to print the elements of an array in reverse order
package assignment3;

public class reversearray {
public static void main(String[] args) {
int [] arr = new int [] {1, 2, 3, 4, 5};  
System.out.println("Original array: ");  
for (int i = 0; i < arr.length; i++) {  //Loop through the array in straight order 
System.out.print(arr[i] + " ");  
	}    
System.out.println("Array in reverse order: ");   
for (int i = arr.length-1; i >= 0; i--) { //Loop through the array in reverse order  
System.out.print(arr[i] + " ");  
		   }  
			  }  
		   }
