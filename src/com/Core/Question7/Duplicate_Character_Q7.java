package com.Core.Question7;

import java.util.Scanner;

public class Duplicate_Character_Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        int lengthWithChar = input.length();
        input = input.replaceAll(Character.toString(ch), "");
        int lengthWithoutChar = input.length();
        System.out.println(lengthWithChar - lengthWithoutChar);
    }
}



