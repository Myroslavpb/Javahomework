package com.pb.Nikitiuk.HW2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
    int x;


System.out.println("Введіть ціле число від 0 до 100");

x=scan.nextInt();
    if(x >= 0 & x < 101)
    {
         if ( x >= 0 & x <= 14  )
                System.out.println("Ваше число належить інтервалу від 0 до 14");
            if (x <= 35 & x > 14)
                System.out.println("Ваше число належить інтервалу від 14 до 35");
            if (x <= 50 & x > 35)
                System.out.println("Ваше число належить інтервалу від 36 до 50");
            if (x <= 100 && x > 50)
                System.out.println("Ваше число належить інтервалу від 51 до 100");
        }

    else System.out.println("Спробуй ще раз");



                                 ;




         }










    }

