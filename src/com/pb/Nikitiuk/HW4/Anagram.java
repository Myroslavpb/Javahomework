package com.pb.Nikitiuk.HW4;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = in.nextLine().toUpperCase();


        System.out.print("Enter second string: ");
        String second = in.nextLine().toUpperCase();

        String result = isAnagram(first, second);
        System.out.println(result);
    }

    private static String isAnagram(String first, String second) {
        if (first == null || second == null || first.equals("") || second.equals("") || !first.matches("[A-Za-z,А-Я,а-я. ]+")
                || !second.matches("[A-Za-z,А-Я,а-я. ]+")) {
            return "No anagram.";
        }
        String answer = "";

        String st = first.replaceAll("[,. ]+", "");
        String nd = second.replaceAll("[,. ]+", "");

        if (st.equals("") || nd.equals("")) {
            return "No anagram.";
        }

        char[] arraySt = st.toCharArray();
        char[] arrayNd = nd.toCharArray();
        Arrays.sort(arraySt);
        Arrays.sort(arrayNd);

        if (Arrays.equals(arraySt, arrayNd)) {
            answer = "Anagram.";
        } else {
            answer = "No anagram.";
        }
        return answer;
    }
}
