package com.Core.Question16;

  class CloneMethod implements Cloneable{
    int rollno;
        String name;

    CloneMethod(int rollno,String name){
            this.rollno=rollno;
            this.name=name;
        }

        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){
            try{
                CloneMethod s1=new CloneMethod(1639,"akshit");

                CloneMethod s2=(CloneMethod)s1.clone();

                System.out.println(s1.rollno+" "+s1.name);
                System.out.println(s2.rollno+" "+s2.name);

            }
            catch(CloneNotSupportedException c){
                System.out.println(c);
            }


        }
    }


