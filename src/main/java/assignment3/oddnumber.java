//Java Program to print the elements of an array present on an odd position 
package assignment3;

public class oddnumber {
public static void main(String[] args) {	
int [] arr = new int [] {1, 2, 3, 4, 5};  //initialize array 		          
System.out.println("Elements of  array odd position: ");  		      
for (int i = 0; i < arr.length; i = i+2) {  //Loop the array by incrementing value of i by 2  
System.out.println(arr[i]);   
   }    
	}  
	} 
