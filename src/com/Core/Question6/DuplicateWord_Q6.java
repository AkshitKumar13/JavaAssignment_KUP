package com.Core.Question6;


public class DuplicateWord_Q6 {
    public static void main(String...args){
        String str="hello world Hello java Java Python world";
        int count;
        str=str.toLowerCase();
        String duplicate_word[]=str.split(" ");

        for(int i=0;i<duplicate_word.length;i++) {
            count = 1;
            for (int j = i+1; j < duplicate_word.length; j++) {
                if (duplicate_word[i].equals(duplicate_word[j])) {
                    count++;
                    duplicate_word[j] = "0";
                }
            }
            if (count > 1 && duplicate_word[i] != "0")
                System.out.println(duplicate_word[i]+"---- "+count);


        }
    }

}
