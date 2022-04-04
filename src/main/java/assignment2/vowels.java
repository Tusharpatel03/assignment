package assignment2;
	
import java.util.Scanner;

		public class vowels {
		public static void main(String[] args) {
		char ch;//variable declaration
		Scanner scan = new Scanner(System.in); //create a scanner object for input  
		System.out.println("Enter the alphabet  vowel or consonant  ");
		ch=scan.next().charAt(0);// store the input from the user
		switch(ch){
			       //check vowel letters
			       case 'a':
			       System.out.println(ch+" is a vowel");
			       break;
			       
			       case 'e':
			       System.out.println(ch+" is a vowel");
			       break;
			       
			       case 'i':
			       System.out.println(ch+" is a vowel");
			       break;
			       
			       case 'o':
			       System.out.println(ch+" is a vowel");
			       break;
			       
			       case 'u':
			       System.out.println(ch+" is a vowel");
			       break;
			       
			       
			       default:
			       System.out.println(ch+" is a consonant");
			       break;     
			       
			}
		   }


	}
