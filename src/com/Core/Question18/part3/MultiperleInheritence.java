package com.Core.Question18.part3;




interface Sum{
   default void result(int a,int b){
       int sum=a+b;
       System.out.println("Sum:- "+sum);
    }
     static void method2(){
        System.out.println("Static method print ");
    }
}
interface Multi{
  default void result(int a,int b){
      int mul=a*b;
System.out.println("Multiply: "+mul);
    }
}



  class MultiperleInheritence implements  Sum,Multi{ //using multiple inheritence

      @Override
      public void result(int a, int b) { //override
          Sum.super.result(a, b);
          Multi.super.result(a,b);
      }

    public static void main(String...args){
        MultiperleInheritence obj=new MultiperleInheritence();
       obj.result(5,2);
        Sum.method2();
    }

  }
