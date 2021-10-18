package com.Core.Question5;

public class FindFactorial_Q5 {

    public static int firstFactorail(int num){
        if(num==0){
            return 1;
        }
        else {
             return num*firstFactorail(num-1);
        }
    }
    public static void main(String...args){
     int fact=firstFactorail(8);
      System.out.println(fact);
    }
}



