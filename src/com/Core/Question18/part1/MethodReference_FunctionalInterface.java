package com.Core.Question18.part1;


interface MethodRefInterface{
    int add(int num1,int num2);
}
interface MethodRefInterface2{
   int Sub(int num1,int num2);
}
interface StaticRefrenceInterface{
      int multi(int num1, int num2) ;



}


  class  MethodReference_FunctionalInterface  {
    public int result(int num1 ,int num2){
         return num1+num2 ;
    }
    public int subResult(int num1,int num2){
        return num1-num2;
    }
    static int multiply(int num1,int num2){
        return num1*num2;
    }

    public static void main(String...args){
        MethodReference_FunctionalInterface obj=new  MethodReference_FunctionalInterface();
        MethodRefInterface ref=obj::result;//instance method refrence

        MethodRefInterface2  ref2=obj::subResult;

        StaticRefrenceInterface ref3 =  MethodReference_FunctionalInterface::multiply; //Static method refrence

        int addRes=ref.add(4,5);//add instance method ref
        int subRes=ref2.Sub(10,5);
        int mulRes = ref3.multi(11, 5);//multiplication for static

        System.out.println("Add--"+addRes);
        System.out.println("Subtract-- "+subRes);
        System.out.println("Multiplication using Static ref -- "+mulRes);
    }

  }
