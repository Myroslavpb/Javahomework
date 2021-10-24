package com.pb.Nikitiuk.HW3;

import java.util.Arrays;
import java.util.Scanner;


public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Insert array elements:");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println();
        System.out.println(" sum = " + sum);

        int positive = 0;
        for (int i = 0; i < 10; i++){
            if (array[i] > 0 )
            positive ++;}
            System.out.println("Positive elements: " + positive);
        System.out.println();

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
        for (int i = 0; i < 10 - 1; i++){
            if (array [i]>array[i+1])
            {
                isSorted = false;
                buf = array[i];
                array[i] = array [i+1];
                array[i+1] = buf;
            }
        }
        }
System.out.println("Bubble sorted elements" + Arrays.toString(array));
    }
    }
