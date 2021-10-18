package com.Core.Question22;

class CreditCard {
    // Main Method
    // Returns true if given
// card number is valid
        static boolean isValid(String cardNo)
        {


            int Sum = 0;
            boolean flag = false;
            for (int i = cardNo.length() - 1; i >= 0; i--)
            {
                int d;
               d = cardNo.charAt(i) - '0';

                if (flag == true)
                    d = d * 2;

                // We add two digits to handle
                // cases that make two digits
                // after doubling
                Sum += d / 10;

                Sum += d % 10;



            }
            return (Sum % 10 == 0);
        }

        // Driver code
        static public void main (String[] args) {
           // String cardNo = "126345678"; //Not Okay
             String cardNo= "623456789"; //Okay
            if (isValid(cardNo))
                System.out.println("Okay");
            else
                System.out.println("Not Okay");

        }
}