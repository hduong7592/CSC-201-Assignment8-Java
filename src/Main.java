/**
 * Hieu Duong
 * CSC 201
 * Assignment 8
 * Problem 8.28:
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns
 * true if m1 and m2 are strictly identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical.
 *
 * 09/23/2017
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[][] array1 = getArray(1); // Get array1

        int[][] array2 = getArray(2); // get array2

        //Compare 2 arrays
        boolean isEqual = equals(array1, array2);
        if(isEqual){
            System.out.println("The 2 arrays are strictly identical.");
        }
        else{
            System.out.println("The 2 arrays are not strictly identical.");
        }

        //Print out result
        System.out.println("Array1: "+DisplayArray(array1));
        System.out.println("Array2: "+DisplayArray(array2));
    }

    /**
     * Get array method
     * @param ArrayNo
     * @return
     */
    public static int[][] getArray(int ArrayNo) {
        Scanner input = new Scanner(System.in);

        // Enter array values
        int[][] array = new int[3][3];
        System.out.println("Array "+ArrayNo+": enter " + array.length + " rows and "
                + array[0].length + " columns: ");
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = input.nextInt();

        return array;
    }

    /**
     * Compare 2 arrays method
     * @param array1
     * @param array2
     * @return
     */
    public static boolean equals(int[][] array1, int[][] array2) {
        boolean isEqual = false;
        int value = 0;

        //Declare max row and max col
        int maxrow = 3, maxcol = 3;

        for(int row = 0; row < maxrow; row++)
        {
            for(int col=0; col<maxcol; col++)
            {
                if(array1[row][col] == array2[row][col])
                {
                    //Do nothing
                }
                else
                {
                    //Assign value -1 to show that the value are not equal
                    value = -1;
                }
            }
        }

        if(value < 0){
            isEqual = false;
        }
        else{
            isEqual = true;
        }

        return isEqual;
    }

    /**
     * Display array method
     * @param array
     * @return
     */
    private static String DisplayArray(int[][] array) {
        String WholeArray = "";

        for(int row=0; row< array.length; row++)
        {
            for(int col=0; col<array[0].length;col++)
            {
                WholeArray += array[row][col]+" ";
            }
        }

        return WholeArray;
    }

}

