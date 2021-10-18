package com.Core.Question16;

public class UsingCopyConstructor {

        private static int ID;
        private static String StudentName;
        //constructor to initialize roll number and name of the student
        UsingCopyConstructor(int ID, String StudentName)
        {
            this.ID = ID;
            this.StudentName = StudentName;
        }
        //creating a copy constructor
        UsingCopyConstructor(UsingCopyConstructor cons)
        {
            System.out.println("\nAfter invoking the Copy Constructor:\n");
            ID =  cons.ID;
           StudentName = cons.StudentName;
        }
        //creating a method that returns the ID of the Student
        Integer showID()
        {
            return ID;
        }
        //creating a method that returns the name of the Student
        String showName()
        {
            return StudentName;
        }
        //class to create student object and print roll number and name of the student
        public static void main(String args[])
        {
            UsingCopyConstructor copyConstructor = new UsingCopyConstructor(1639, "Akshit Kumar");
            System.out.println("Name of the Student1: "+ copyConstructor.showName());
            System.out.println("Id of the Student1: "+ copyConstructor.showID());
//passing the parameters to the copy constructor
            UsingCopyConstructor copyConstructor2 = new UsingCopyConstructor(copyConstructor);
            System.out.println("Name of the Student2: "+ copyConstructor2.showName());
            System.out.println("Id of the Student2: "+ copyConstructor2.showID());
        }
    }

