package com.Core.Question3;

public class RemoveCharacter_Q3 {
    public static String remove_Character(String str, char rm_Char){
        if(str==null||str.isEmpty()) {
            return "";

        }
        StringBuilder sb = new StringBuilder();
        char[] chArray = str.toCharArray();
        for(int i=0;i<chArray.length;i++){
            if (chArray[i]!=rm_Char)
        sb.append(chArray[i]);
        }
        return sb.toString();
    }
    public static void main(String...args){
       String  str= "abcdefabcdeabcdaaa";
       char r_Char='a';
        String result = remove_Character(str, r_Char);
        System.out.println("Original string:---  ");
        System.out.println(str);
        System.out.println("Second string:----   ");
        System.out.println(result);
    }


}
