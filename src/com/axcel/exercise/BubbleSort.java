package com.axcel.exercise;

import java.util.Scanner;

/**
 *
 *  Inputs are
 *      Array of elements: Array: Array to be sorted
 *
 *  BubbleSort Algorithm:
 *  1-  If the length of the Array is 1
 *      1.1- the array is sorted
 *      1.2- stop
 *  2-  Set endOfArray= length of the Array - 1
 *  3-  While moving on the Array from start to end
 *      3.1-  While moving on the Array from start to endOfArray
 *          3.1.1-  Check if the current element is larger than the next element then
 *              3.1.1.1- Swap the current element with the next element
 *          3.1.2- Otherwise we ignore current element
 *      3.2- Set endOfArray=endOfArray-1 ie the Largest has moved to the end
 *  4-  stop
 *
 */
public class BubbleSort {

    /**
     *
     * @param array
     */
    void bubbleSort(int array[]) {
        int length = array.length;
        if (length <=1) {                            //  1-  If the length of the Array is 1
            return;                                  //      1.1- the array is sorted
        }                                            //      1.2- stop
        int endOfArray= length -1;                   //  2-  Set endOfArray= length of the Array - 1
        for (int i = 0; i < length-1; i++) {         //  3-  While moving on the Array from start to end
            for (int j = 0; j < endOfArray ; j++) //      3.1-  While moving on the Array from start to endOfArray
                if (array[j] > array[j + 1]) {       //         3.1.1-  Check if the current element is larger than the next element then
                    // swap temp and array[i]
                    int temp = array[j];             //            3.1.1.1- Swap the current element with the next element
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }                                    //         3.1.2- Otherwise we ignore current element
            endOfArray--;                            //      3.2- Set endOfArray=endOfArray-1 ie the Largest has moved to the end
            printArray(array);
        }

    }

    public static void main(String[] args) {
        // write your code here
        String msg = "This is an implementation of BubbleSort Algorithm";
        System.out.println(msg);
        System.out.println();



        int[] array = readArray();
        //int array[] = {10, 7, 8, 9, 1, 5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);

        printArray(array);



    }

    private static int[] readArray(){
        String msg = "Enter the number of elements to read:";
        System.out.println(msg);

        Scanner inputScanner = new Scanner(System.in);

        int length = inputScanner.nextInt();

        msg = "Enter "+ length +" elements to read:";
        System.out.println(msg);
        int[] array = new int[length];
        for (int i=0;i<length;i++){
            array[i] = inputScanner.nextInt();
        }
        return array;




    }

    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


}
