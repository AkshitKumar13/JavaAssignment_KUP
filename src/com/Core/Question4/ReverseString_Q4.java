package com.Core.Question4;

public class ReverseString_Q4 {
    public static void main(String...args)
    {
        String str="abcdef";
         String rev_str ="";
        for(int i= str.length()-1;i>=0;i--){
          rev_str +=  str.charAt(i);
        }
        //original string
        System.out.print("original string----\n "+str);

// reverse string
        System.out.print("\n"+"reverse string--- \n"+rev_str);
    }
}
