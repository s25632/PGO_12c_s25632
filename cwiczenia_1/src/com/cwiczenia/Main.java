package com.cwiczenia;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    //sortowanie do zadania 6 (wykorzystane też w #2 i #3)
    public static int[] bubbleSort(int[] arr) {
        int[] sortedArr = arr;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArr[j] > sortedArr[j + 1]) {
                    int temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                }
            }
        }
        return sortedArr;
    }


    //wypisywanie tablicy do zadania 6
    public static String printIntArr(int[] arr) {
        String[] tempArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = Integer.toString(arr[i]);
        }
        return Arrays.toString(tempArr);
    }

    public static void main(String[] args) {
        //zadanie 2
        System.out.println("Zadanie 2");
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadź pierwszą wartość: ");
        int num1 = scan.nextInt();
        System.out.print("Wprowadź drugą wartość: ");
        int num2 = scan.nextInt();
        System.out.print("Wprowadź trzecią wartość: ");
        int num3 = scan.nextInt();
        int numArr[] = {num1, num2, num3};
        int[] sortedNumArr = bubbleSort(numArr);
        System.out.println("Twoje liczby to: " + sortedNumArr[0] + ", " + sortedNumArr[1] + ", " + sortedNumArr[2] + ".");

        //zadanie 3
        System.out.println("Zadanie 3");
        System.out.print("Wprowadź pierwszą wartość: ");
        int arrToSort[] = new int[3];
        arrToSort[0] = scan.nextInt();
        System.out.print("Wprowadź drugą wartość: ");
        arrToSort[1] = scan.nextInt();
        System.out.print("Wprowadź trzecią wartość: ");
        arrToSort[2] = scan.nextInt();
        int[] arrSorted = bubbleSort(arrToSort);
        System.out.println("Twoje liczby to: " + arrSorted[0] + ", " + arrSorted[1] + ", " + arrSorted[2] + ".");

        //zadanie 4
        System.out.println("Zadanie 4");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        int i = 0;
        while (i < 10) {
            System.out.println("Hello World!");
            i++;
        }

        int j = 0;
        do {
            System.out.println("Hello World!");
            j++;
        }
        while (j < 10);

        //zadanie 5
        System.out.println("Zadanie 5");
        int num = 1;
        for (int k = 1; k <= 10; k++) {
            for (int l = 1; l <= 10; l++) {
                System.out.print(num * l + " ");
            }
            num++;
            System.out.println("");
        }

        //zadanie 6
        System.out.println("Zadanie 6");
        int min = 100;
        int max = 1000;
        int[] arr = new int[10];
        for (i = 0; i < 10; i++) {
            arr[i] = (int) Math.round(Math.random() * (max - min + 1) + min);
        }

        System.out.println("Generated array: " + printIntArr(arr));
        System.out.println("Sorted array: " + printIntArr(bubbleSort(arr)));




    }
}

