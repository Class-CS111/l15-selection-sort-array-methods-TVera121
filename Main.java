/********************************************
*	AUTHOR:	Tony Vera
* COLLABORATORS: N/A
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	4/6/2025
********************************************/

public class Main 
{
  public static void main(String[] args)
  {
    // Array to test Step 1 & 2
    int[] testValues = {12, 16, 26, 42, 53, 77, 84};

    // Empty Array to test Step 1 to ensure proper spacing between brackets
    int[] emptyTestValues ={};

    // Array to test Step 3
    int[] minIndexTestValues = {42, 16, 84, 12, 77, 26, 53};

    // Array to test Step 4
    int[] reverseTestValues = {42, 16, 84, 12, 77, 26, 53};

    // Array to test Step 5
    int[] selectionTestValues = {42, 16, 84, 12, 77, 26, 53};


    System.out.println("Step 1 Test Will print to Console array with the desired format:");
    System.out.println(ArrayMethods.arrayString(testValues));
    System.out.println(ArrayMethods.arrayString(emptyTestValues));
    System.out.println("End of Step 1 Test:\n");

    System.out.println("Step 2 Test will demonstrate the swaping of elements in index 0 and index 6 of the array:");
    System.out.println(ArrayMethods.arrayString(testValues));
    ArrayMethods.swap(testValues, 0, 6);
    System.out.println(ArrayMethods.arrayString(testValues));
    System.out.println("End of Step 2 Test:\n");

    System.out.println("Step 3 Test outputs to the console the array being used to test search\n"+
                        "for the index holding the min value in the array and the results of \n" +
                        "the search when the start indices are 0 and 4:");
    System.out.println(ArrayMethods.arrayString(minIndexTestValues));
    System.out.println(ArrayMethods.indexOfMin(minIndexTestValues, 0));
    System.out.println(ArrayMethods.indexOfMin(minIndexTestValues, 4));
    System.out.println("End of Step 3:\n");

    System.out.println("Step 4 Test ouputs the Array that is to be reveresed and the array once it's reversed:");
    System.out.println(ArrayMethods.arrayString(reverseTestValues));
    ArrayMethods.reverse(reverseTestValues);
    System.out.println(ArrayMethods.arrayString(reverseTestValues));
    System.out.println("End of Step 4:\n");

    System.out.println("Step 5 Test Outputs the array in intial order and then in ascending order after sorting has occured:");
    System.out.println(ArrayMethods.arrayString(selectionTestValues));
    ArrayMethods.selectionSort(selectionTestValues);
    System.out.println("End of Step 5:\n");

  }
}