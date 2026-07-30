//Frequency of character in a string using Hasing

package Striver_A2Z.Hashing;

import java.util.*;

public class Hashing_2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int hash[] = new int[256];

        // Pre-compute frequency
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            char c = sc.next().charAt(0);   // sc.next -> string return karta hai , aur hume chaiye string ka eek specific character eg: "a" to hum likte hai "a".chatAt(0); => 'a' => 97
            System.out.println(hash[c]);
        }
    }
}