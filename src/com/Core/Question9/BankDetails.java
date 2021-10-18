package com.Core.Question9;


class Bank{
    String bankcity;
    float rateofInterest;
    Bank(String bankcity,float rateofInterest){
        this.bankcity=bankcity;
        this.rateofInterest=rateofInterest;
    }

    public void getDetails(){
        System.out.println("City "+bankcity);
        System.out.println("Rate of Interest is  "+rateofInterest);

    }
}

  class SBI extends Bank{
      private final String brachId;
      String branchId;

      SBI(String bankcity, float rateofInterest, String brachId) {
          super(bankcity, rateofInterest);
          this.brachId=branchId;
      }
      public void getDetails(){
          super.getDetails();
          System.out.println(" Branch ID :-  "+branchId);

      }
}
class BOI extends Bank{

    String branchId;

    BOI(String bankcity, float rateofInterest, String branchId) {
        super(bankcity, rateofInterest);
        this.branchId=branchId;
    }
    public void getDetails(){
        super.getDetails();
        System.out.println(" Branch ID :-  "+branchId);

    }
}
class ICICI extends Bank{

    String branchId;

    ICICI(String bankcity, float rateofInterest, String branchId) {
        super(bankcity, rateofInterest);
        this.branchId=branchId;
    }
    public void getDetails(){
        super.getDetails();
        System.out.println(" Branch ID :-  "+branchId);

    }
}
class BankDetails{
    public static void main(String...args){
        Bank bank = new Bank("Noida", 1.2f);
        SBI sbiBranch = new SBI("Saharanpur",1.0f,"121");
        BOI boiBranch = new BOI("Delhi",1.5f,"125");
        ICICI iciciBranch = new ICICI("Haridwar",2.0f,"130");

        //call getdetail method
        System.out.println("---central bank---");
        bank.getDetails();
        System.out.println("#########################");
        sbiBranch.getDetails();
        System.out.println("#########################");
        boiBranch.getDetails();
        System.out.println("#########################");
        iciciBranch.getDetails();
    }


}






