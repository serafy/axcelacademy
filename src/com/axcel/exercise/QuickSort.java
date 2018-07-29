package com.axcel.exercise;
// Java program for implementation of QuickSort

/**
 *  Inputs are
 *      Array of elements: Array: Array to be sorted
 *      1st element index: low
 *      last element index: high
 *  QuickSort Algorithm:
 *  1-  Partition the Array using Partition Algorithm with Array as input
 *      1.1 -  output1: is the index of the pivot
 *      1.2 -  output2: The Array with the pivot in its correct location
 *  2 - Set pivotIndex = output1 of step 1
 *  3 − Execute QuickSort Algorithm with sub Array from low to the pivotIndex -1
 *  4 - Execute QuickSort Algorithm with sub Array from the pivotIndex +1 to high
 *
 *  Inputs are
 *  *      Array of elements: Array: Array to be sorted
 *  *      1st element index: low:
 *  *      last element index: high:
 *  Partition Algorithm:
 *  1-  Set pivot = Array[high] i.e the last element of the Array
 *  2−  Set indexOfSmallerElement = low-1 ie indexOfSmallerElement points to the low index
 *  3-  While moving on the Array from low to high-1
 *      3.1- Check if the current element is less then or equal to the pivot then
 *          3.1.1 - indexOfSmallerElement = indexOfSmallerElement +1 ie move the indexOfSmallerElement one step to the right
 *          3.1.2 - Swap the element on the indexOfSmallerElement with the current element
 *      3.2- Otherwise we ignore current element
 *  4- Set correctPivotIndex = indexOfSmallerElement+1
 *  5- Swap the element on correctPivotIndex with the pivot ie the element on high
 *  6- Output correctPivotIndex
 *
 *
 */
class QuickSort
{


    /**
     *  This function takes last element as pivot,
     *        places the pivot element at its correct
     *        position in sorted array, and places all
     *        smaller (smaller than pivot) to left of
     *        pivot and all greater elements to right
     *        of pivot
     *
     *  Partition Algorithm:
     *    1-  Set pivot = Array[high] i.e the last element of the Array
     *    2−  Set indexOfSmallerElement = low-1 ie indexOfSmallerElement points to the low index
     *    3-  While moving on the Array from low to high-1
     *        3.1- Check if the current element is less then or equal to the pivot then
     *            3.1.1 - indexOfSmallerElement = indexOfSmallerElement +1 ie move the indexOfSmallerElement one step to the right
     *            3.1.2 - swap the element on the indexOfSmallerElement with the current element
     *        3.2- Otherwise we ignore current element
     *    4- Set correctPivotIndex = indexOfSmallerElement+1
     *    5- Swap the element on correctPivotIndex with the pivot ie the element on high
     *    6- Output correctPivotIndex
     *
     *
     * @param array Array tobe soreted , the array will be changed so that:
     *              all elments less than the pivot will be on the left
     *              and all eliments grater than the pivot will be on the right
     * @param low
     * @param high
     * @return the new pivot location
     */
    int partition(int array[], int low, int high)
    {
        int pivot = array[high];                    // 1-  Set pivot = Array[high] i.e the last element of the Array
        int indexOfSmallerElement = (low-1);        // 2−  Set indexOfSmallerElement = low-1 ie indexOfSmallerElement points to the low index

        for (int j=low; j<high; j++)                // 3-  While moving on the Array from low to high-1
        {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot)                  //     3.1- Check if the current element is less then or equal to the pivot then
            {
                indexOfSmallerElement++;            //          3.1.1 - indexOfSmallerElement = indexOfSmallerElement +1
                                                    //              ie move the indexOfSmallerElement one step to the right

                // swap arr[left] and arr[j]
                int temp = array[indexOfSmallerElement]; //     3.1.2 - swap the element on the indexOfSmallerElement with the current element
                array[indexOfSmallerElement] = array[j];
                array[j] = temp;
            }                                       //     3.2- Otherwise we ignore current element
        }

        int correctPivotIndex = indexOfSmallerElement+1; // 4- Set correctPivotIndex = indexOfSmallerElement+1
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = array[correctPivotIndex];        //  5- Swap the element on correctPivotIndex with the pivot ie the element on high
        array[correctPivotIndex] = array[high];
        array[high] = temp;
 
        return correctPivotIndex;                   //  6- Output correctPivotIndex
    }

    /**
     * The main function that implements QuickSort()
     *
     * QuickSort Algorithm:
     *
     *         1-  Partition the Array using Partition Algorithm with Array as input
     *             1.1  output1: is the index of the pivot
     *             1.2  output2: The Array with the pivot in its correct location
     *         2 - Set pivotIndex = output1 of step 1
     *         3 − Execute QuickSort Algorithm with sub Array from the start to the pivotIndex -1
     *         4 - Execute QuickSort Algorithm with sub Array from the pivotIndex +1 to the end of the Array
     *
     *
     * @param array --> Array to be sorted,
     */
    private void sort(int[] array) {
        int length = array.length;
        sort(array, 0, length-1);
    }

    /**
     *   The main function that implements QuickSort()
     *       array[] --> Array to be sorted,
     *       low  --> Starting index,
     *       high  --> Ending index
     * QuickSort Algorithm:
     *
     *   1-  Partition the Array using Partition Algorithm with Array as input
     *       1.1-  output1: is the index of the pivot
     *       1.2-  output2: The Array with the pivot in its correct location
     *   2 - Set pivotIndex = output1 of step 1
     *   3 − Execute QuickSort Algorithm with sub Array from low to the pivotIndex -1
     *   4 - Execute QuickSort Algorithm with sub Array from the pivotIndex +1 to high
     *
     * @param array   array[] --> Array to be sorted
     * @param low   low  --> Starting index
     * @param high  high  --> Ending index
     */


    private void sort(int array[], int low, int high)
    {
        if (low < high)
        {
            /* pivotIndex is partitioning index, array[pivotIndex] is now at right place */
            int pivotIndex = partition(array, low, high); // 1-  Partition the Array using Partition Algorithm with Array as input
                                                          //    1.1-  output1: is the index of the pivot
                                                          //    1.2-  output2: The Array with the pivot in its correct location
                                                          // 2 - Set pivotIndex = output1 of step 2
            // Recursively sort elements before partition and after partition
            sort(array, low, pivotIndex-1);         // 3 − Execute QuickSort Algorithm with sub Array from the low to the pivotIndex -1
            sort(array, pivotIndex+1, high);         // 4 - Execute QuickSort Algorithm with sub Array from the pivotIndex +1 to high
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[])
    {
        int inputArray[] = {10, 7, 8, 9, 1, 5};

 
        QuickSort quickSort = new QuickSort();
        quickSort.sort(inputArray);

 
        System.out.println("sorted array");
        printArray(inputArray);
    }


}
/*This code is contributed by Rajat Mishra */
