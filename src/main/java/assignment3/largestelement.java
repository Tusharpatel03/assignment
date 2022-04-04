//Java Program to print the largest element in an array
package assignment3;

public class largestelement {
public static void main(String[] args) {
int [] arr = new int [] {20,30,40,50,60}; //initialize array
int max = arr[0];   //Initialize max with first element of array.		        
for (int i = 0; i < arr.length; i++) {  //Loop through the array       
if(arr[i] > max)   //Compare elements of array with max  
max = arr[i];  
	}  
System.out.println("Largest element the given array: " + max);  
 }  
 } 
 
