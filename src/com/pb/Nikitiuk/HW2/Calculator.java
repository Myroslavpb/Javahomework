package com.pb.Nikitiuk.HW2;

import java.util.Scanner;

public class Calculator { public static void main(String[] args ) {
  String sign;
  float y, x;


  Scanner scan = new Scanner(System.in);
    System.out.println("Введіть число і натисніть enter ");
  x= scan.nextInt();
  System.out.println("Введіть операцію яку бажаєте виконати : +; -; *; /");
  sign = scan.next();

    System.out.println("Введіть число і натисніть enter ");
    y= scan.nextInt();

  float z = x/y;
switch (sign) {
  case "+" :
      System.out.println(" =" + (x +y));
         break;
  case "-":
    System.out.println("=" + (x-y));
     break;
  case "*":
    System.out.println("=" + (x*y));
    break;
  case "/":
    if (y==0)
      System.out.println("Universe has been destroyed downloading  last save");
    else
    System.out.println("=" + z);
    break;
}
  }



  }


