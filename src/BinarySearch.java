/*This program demonstrates Searching Technique called as Binary Search
 * In Binary Search, element to be found is compared with the middle element
 * if it is smaller than middle element then searching takes place in first half
 * else searching takes in second half where now first element is middle element
 * Technique is illustrated below along with Java code
 */

import java.util.Scanner;
 
class BinarySearch   //class BinarySearch which includes main function
{
	
  public static void main(String args[])  //main method
  {
    int i, first, last, middle, n, search, array[]; //variables with data type int 
 
    Scanner sc = new Scanner(System.in);  //creating object of scanner class
    System.out.print("Enter number of elements : "); //message to get input number of elements in an array
    n = sc.nextInt();  //getting no of elements in array
    
    array = new int[n]; //declaring array of size n
 
    System.out.print("Enter " + n + " integers : ");  //displaying message to enter elements in array
    for (i = 0; i < n; i++) {   //loop starts from 0 and ends at n
      array[i] = sc.nextInt();  //elements are stored in array
    } //loop ends
 
    System.out.print("Enter value to find : "); //message to user to enter element to find 
    search = sc.nextInt(); //element which is to be find is stored in search variable
 
    first  = 0;   //variables are initialized first = 0
    last   = n - 1;  //last element is n - 1 as the process wont reach upto last element in binary search
    middle = (first + last)/2;   //middle element is average of first and last number
 
    while( first <= last )   //while array doesn't end
    {
      if ( array[middle] < search ) {  //if middle element is less than the element to be searched then searching takes places at right side of middle element
        first = middle + 1;    //in this case first element is middle element+1 as number to be searched is greater
        }
      
      else if ( array[middle] == search ) {  //if element to be searched is itself a middle element then our work is done and we print the message that element is found
        System.out.println(search + " found at location " + (middle + 1) + ".");  //element found message along with position at which it is found
        break; //exit from loop after printing
      }
      
      else {
         last = middle - 1;  //if element to be searched is less than middle element then exactly opposite happens to that of if loop
      } //in this case first element is array[0] while last element is array[middle-1]
      
      //major concept here to be remembered is comparison with the middle element in array and thus suitably choosing first and last element
      
      middle = (first + last)/2; //after every check middle element is set as average of first and last so that check takes place
   }
    
   if ( first > last ) {   //if array size exceeds that is we don't get the element till last condition
      System.out.println(search + " is not present in the array.\n");  //we print the message element not found  
  }
   
  }//end of main
}//end of class                //binary search reduces our time complexity and gives us best case O(1) when element to be searched is middle element and has time complexity O(log n)