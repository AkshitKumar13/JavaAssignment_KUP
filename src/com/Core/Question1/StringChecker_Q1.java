package com.Core.Question1;

class StringChecker_Q1 {

        public boolean popInTheString(String str)
        {
            int len = str.length();
            //System.out.println(len);
            for (int i = 0; i < len; i++)
            {
                if (str.charAt(i) == 'p' && str.charAt(i+2) == 'p')
                    return true;
            }
            return false;
        }
        public static void main (String[] args)
        {
            StringChecker_Q1 obj= new StringChecker_Q1();
            //define first string
            String str1 =  "popeye";
            System.out.println("The given string is: "+str1);
            System.out.println("Is p?p appear in the given string------>   "+obj.popInTheString(str1));

            //define second string
            String str2= "puppy";
            System.out.println("The given string is: "+str2);
            System.out.println("Is p?p appear in the given string------>   "+obj.popInTheString(str2));


        }
    }




