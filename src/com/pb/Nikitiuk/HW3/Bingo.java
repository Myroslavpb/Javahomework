package com.pb.Nikitiuk.HW3;

import java.util.Scanner;

public class Bingo  {public static void main(String[] args ){

    Scanner scan = new Scanner(System.in);
    int x ;
    int counter = 0;
    int rnd = (int) (Math.random() * 100);
    int a = 247156;
    System.out.println("Try to guess number in the range from 0 to 100");
    System.out.println("Print number and push enter");


    do {
        x = scan.nextInt();
        counter++;
        if (x == a){
            System.out.println("The number was "+ rnd + " Have a nice day");
            break;}
        else
        if (counter < 2) {
            if (x >= 0 & x <= 100) {
                if (x == rnd) {
                    System.out.println("bingo, you guess number in" + counter + "tries");
                    break;
                }
                if (x<rnd) {
                    System.out.println("Number " + x + " is smaller you need, try again");
                    System.out.println(counter + " try");
                }
                if (x>rnd)
                {
                System.out.println("Number " + x + " is bigger you need, try again");
                System.out.println( counter + " try");
                }

                            } else
               System.out.println("Wrong range, print number from  0 to 100");
     }
       else

                  if (x >= 0 & x <= 100 )
                  {
           if (x == rnd) {
               System.out.println("bingo, you guess number in" + counter + "tries");
           break;
           }
                      if (x<rnd){
                          System.out.println("Number " + x + " is smaller you need, try again or print 247156 to exit ");
                      System.out.println( counter + " try");}
                      if (x>rnd)
                      { System.out.println("Number " + x + " is bigger you need, try again or print 247156 to exit");
                      System.out.println( counter + " try");}
      } else
           System.out.println("Wrong range, print number from  0 to 100");
    }
    while (x != rnd);



}
}