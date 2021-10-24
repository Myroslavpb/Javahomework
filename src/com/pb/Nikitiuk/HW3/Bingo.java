package com.pb.Nikitiuk.HW3;

import java.util.Scanner;

public class Bingo {public static void main(String[] args ){
    Scanner scan = new Scanner(System.in);
    int x ;
    String stop = "exit";
    int counter = 0;
    System.out.println("Try to guess number in the range from 0 to 100");
    System.out.println("Print number and push enter");



    do {
        x = scan.nextInt();
        counter++;
        if (counter < 2) {
            if (x >= 0 & x <= 100) {
                if (x == 5) {
                    System.out.println("bingo");
                    break;
                }

                System.out.println("Number " + x + " is wrong, try again");
                System.out.println( counter + " try");
            } else
                System.out.println("Wrong range, print number from  0 to 100");
        }
else

        if (x >= 0 & x <= 100 ) {
            if (x == 5) {
                System.out.println("bingo");
                break;
            }

            System.out.println("Number " + x + " is wrong, try again or Print Halt to exit program");
            System.out.println( counter + " try");

        } else
            System.out.println("Wrong range, print number from  0 to 100");
    }
    while (x !=5);



}
}
