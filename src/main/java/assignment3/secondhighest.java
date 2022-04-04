//Find 2nd Largest Number in an Array
package assignment3;

import java.util.Arrays;

public class secondhighest {
public static void main(String[] args) {	
int num[] = {1, 9, 5, 2, 8, 3, 55};
int n = num.length;
Arrays.sort(num);
System.out.println("second highest number " + num[n-2]);
			}

		}

