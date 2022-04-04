package assignment2;

import java.util.Scanner;

public class palindromenumber {
public static void main(String[] args) {
String num, reverse = "121"; // Objects of String class  
Scanner in = new Scanner(System.in);   
System.out.println("Enter a number  it is a palindrome");  
num = in.nextLine();   
int length = num.length();   
for ( int i = length - 1; i >= 0; i-- )  
reverse = reverse + num.charAt(i);  
if (num.equals(reverse))  
System.out.println("Number is a palindrome.");  
 else  
System.out.println("Number is not a palindrome.");   
			 
			}
		 }

