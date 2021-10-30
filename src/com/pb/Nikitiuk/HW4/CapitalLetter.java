package com.pb.Nikitiuk.HW4;

import java.io.BufferedReader;
import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {

    static String cap(){
        return "Hello,please enter sentence";
    }


    public static void main(String[] args) {

        System.out.println(cap());
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        s = new String(chars);
        System.out.println(s);
    }
}