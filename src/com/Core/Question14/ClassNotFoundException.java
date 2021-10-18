package com.Core.Question14;

public class ClassNotFoundException {


        public static void main(String args[]) {
            try
            {
                Class.forName("ClassNotFoundException");
            }

            catch (java.lang.ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}
