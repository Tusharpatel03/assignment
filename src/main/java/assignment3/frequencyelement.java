//java Program to find the frequency of each element in the array
package assignment3;

public class frequencyelement {
public static void main(String[] args) {
int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
int [] fr = new int [arr.length];  //Array fr will store frequencies of element  
int visited = 1;  
for(int i = 0; i < arr.length; i++){  
int count = 1;  
for(int j = i+1; j < arr.length; j++){  
if(arr[i] == arr[j]){  
count++;   
fr[j] = visited;  
	 }  
	} 
if(fr[i] != visited)  
fr[i] = count;  
	 }  
System.out.println(" Element & Frequency");  //Displays the frequency of each element present in array  
for(int i = 0; i < fr.length; i++){  
if(fr[i] != visited)  
System.out.println("    " + arr[i] + "    &    " + fr[i]);  
			        }    
			}

		}

