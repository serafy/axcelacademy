package com.axcel;

import java.util.Scanner;

/**
 * This is a runner class
 */
public class Main {

    /**
     * This is my Main Class main method
     * @param args not used
     */
    public static void main(String[] args) {
	// write your code here
        String msg = "This is a Test program";
        System.out.println(msg);
        System.out.println();



        int[] array = readArray();
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
