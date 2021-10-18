package com.Core.Question8;

public class UsingStaticInitialize {
    private static String firstname="Akshit"; //static variables
    private static String lastname ="Kumar";  //static variable
    private static int age=22 ;              //static variable

//static block
    static {
        System.out.println("Using Static Block");

        System.out.println(firstname+" "+lastname+" "+age);
    System.out.println(" ##########################");
    }
    //static method
    private static void print(){
        System.out.println("using static method");
         firstname="Aman";          //using static method we can change the value of static variable
         lastname="verma";
         age=22;
        System.out.println(firstname+" "+lastname+" "+age);

    }


    //main method
    public static void main(String...args){
             System.out.println("In main");
            System.out.println(firstname + " " + lastname + " " + age);
        System.out.println("##########################");
            print();   // static method call automatic

    }
}



