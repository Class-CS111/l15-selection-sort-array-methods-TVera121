/********************************************
*	AUTHOR:	Tony Vera
* COLLABORATORS: N/A
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: 4/6/2025
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	TODO: <Pseudocode for selection sort here>
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**DESCRIPTION: */
  /*
   * Method used to take an array of integers and will output a String of the array as a horizontal list, 
   * separated by commas and enclosed with curly brackets
   * 
   * @param Array to be converted into a readable String
   * 
   * @return String of desired readable format of array
   */
  public static String arrayString(int[] a)
  {
    String arrayDisplay ="{ ";
    for(int i =0; i < a.length ; i++)
    {
      arrayDisplay += a[i];
      //The last value of the array will not require a comma
      if(i < a.length -1)
      {
        arrayDisplay += ", ";
      }
    }
    arrayDisplay += " }";
    return arrayDisplay;
  }
  
  /**DESCRIPTION: */
  /*
   * Method to swap two elements in an int array given the indexes where the swap should occur. 
   * 
   * @param Array with at least two values
   * @param value of the two indexes that are to be swapped in the array
   */
  public static void swap(int[] array, int a, int b)
  {
    int valueHolder;
    valueHolder = array[a];
    array[a]= array[b];
    array[b] = valueHolder;
  
  }
	
	/**DESCRIPTION: */
  /*
   * Method to find the index of the minimum element in the array, starting from that specific index. 
   * This method loops through the array and return the index of the minimum element, beginning from the start index
   * (ignores all earlier indices).
   * 
   * @param array with at least one value.
   * @param int value of the desired index used to start to search for the min element in the array.
   * 
   * @return the int value of the index holding the min value in the array
   */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minIndex=startIndex;

    for(int i = startIndex; i < array.length - 1; i++)
    {
      if(array[startIndex] > array[i+1])
      {
        startIndex= i+1;
        minIndex = startIndex;
      }
    }
    return minIndex;
  }

	/**DESCRIPTION: */
  /*
   * Method reverses the order of a given array.
   * 
   * @param Array to be reversed 
   */
  public static void reverse(int[] array)
  {
    for(int i = 0; i < array.length/2; i++)
    {
      ArrayMethods.swap(array, i, array.length-1-i);
    }
  }

	/**DESCRIPTION: */
  /*
   * Method takes an array and sorts it into ascending order (least to greatest)
   * 
   * @param Array to be sorted
   */
  public static void selectionSort(int[] array)
  {
    int minIndex;
    for(int i = 0; i < array.length - 1; i++)
    {
     minIndex = ArrayMethods.indexOfMin(array, i);
     if(minIndex >i)
     {
      ArrayMethods.swap(array, minIndex, i);
     }

    }
    System.out.println(ArrayMethods.arrayString(array));

  }

}