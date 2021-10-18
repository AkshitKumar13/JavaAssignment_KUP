package com.Core.Question21;

import java.util.Scanner;

class Employee {

      private int EmpId;
       private String EmpName;
      private String EmpDesignation;

      Employee(int EmpId,String EmpName,String EmpDesignation) {
          this.EmpId = EmpId;
         this.EmpName = EmpName;
         this.EmpDesignation = EmpDesignation;
      }

      public int getEmpId() {
          return EmpId;
      }

      public void setEmpId(int EmpId) {
          this.EmpId = EmpId;
      }
    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }
    public String getEmpDesignation() {
        return EmpDesignation;
    }

    public void setEmpDesignation(String EmpDesignation) {
        this.EmpDesignation = EmpDesignation;
    }

      @Override
      public String toString() {
          return "Employee [emp_id = " + EmpId +", name = " + EmpName + ", Desgination = " + EmpDesignation+
          "]";
      }
  }
  class main{
      public static void main(String args[]) {
          Scanner sc=new Scanner(System.in);

          System.out.println("enter employee id");
          int ID=sc.nextInt();

          System.out.println("enter employee name");
          String name=sc.next();

          System.out.println("enter employee designation");
          String designation =sc.next();

          Employee obj=new Employee(ID,name,designation);

          System.out.println(obj);

      }
      }
