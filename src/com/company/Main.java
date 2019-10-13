package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        //FIND THE SMALLEST NUMBER//
        /*while (true) {

        System.out.println("input the first number: ");
        int x = myScan.nextInt();
        System.out.println("Input the second  number: ");
        int y = myScan.nextInt();
        System.out.println("Input the third number: ");
        int z = myScan.nextInt();
        System.out.println("The smallest number is: " + smallest(x, y, z));
    }
    }

        public static int smallest ( int x, int y, int z) {
            return Math.min(Math.min(x, y), z);


         */

        //FIND THE BIGGEST NUMBER//


       /* System.out.println("Enter the first number");
        int a = myScan.nextInt();
        System.out.println("Enter second number: ");
        int b = myScan.nextInt();
        System.out.println("Enter the third number");
        int c = myScan.nextInt();
        System.out.println("The biggest number is: " + biggest(a, b, c));
    }
    public static int biggest (int a, int b, int c){
        return Math.max(Math.max(a, b), c);


        */

        //FIND THE AVERAGE NUMBER//

        /*System.out.println("Give first number: ");
        int n1 = myScan.nextInt();
        System.out.println("Give second number: ");
        int n2 = myScan.nextInt();
        System.out.println("Give third number: ");
        int n3 = myScan.nextInt();
        System.out.println("The average number is: " + average(n1, n2, n3));

    }
    public static int average (int n1, int n2, int n3){
        return (n1 + n2 + n3)/3;

         */
//FIND THE MIDDLE CHAR OF A SENTENCE//
        /*System.out.println("Input a string");
        String txt = myScan.nextLine();

        System.out.println("The middle character of the string is: " + middle(txt));
    }

    public static String middle(String txt) {
        int position;
        int length;
        if (txt.length() % 2 == 0) {
            position = txt.length() / 2 - 1;
            length = 2;
        } else {
            position = txt.length() / 2;
            length = 1;
        }
        return txt.substring(position, position + length);

         */


        //SORT AN NUMERIC AND A STRING ARRAY//

       /* int[]myArray = {
                10, 11, 12, 13, 14};
        System.out.println("My numeric array is: " + Arrays.toString(myArray));
Arrays.sort(myArray);
        String[]myArray2 ={
                "Anna", "David","Johanna", "Erik"
        };
        System.out.println("My string Array is: " + Arrays.toString(myArray2));
        Arrays.s(myArray2);
        double[] myArray3={
                1.1, 2.5, 8.7, 9.9
        };
        System.out.println("My double Array sorted: " + Arrays.toString(myArray3));
        Arrays.sort(myArray3);


        */

        //THE VALUE OF THE ARRAY//
       /*int values[] = {10, 10, 10, 5};
        int sum = 0;

        for (int i : values)
        sum += i;


        System.out.println("The value is: " + sum);

        */
//PRINT OUT WITH PRINTF//
       /*int a = 15;
       int b = 10;
        System.out.printf("%2d, %2d" ,a, b);


        */

        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = "-";//Skriver ut - i arrayen
                System.out.printf("%2d ", a[i][j]);

            }
            System.out.println();


            List<String> myList = new ArrayList<>();
            myList.add("AAAA");
            String ahgf = myScan.nextLine();//input av användaren i arraylistan
            myList.add(ahgf);
            myList.add(myScan.nextLine());
            myList.add(myScan.nextLine());
            myList.add(myScan.nextLine());
            myList.add(myScan.nextLine());
    }
}




