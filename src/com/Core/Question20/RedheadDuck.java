package com.Core.Question20;

class RedheadDuck extends Duck {

    public RedheadDuck(double weight, int numberWings, Birds.DuckType duckType) {
        super(weight, numberWings, duckType);
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("Redhead ducks fly slow and quack mild.");
    }


    public static void main(String[] args) {
        //Create ducks
        Birds_Interface[] ducks = new Birds_Interface[3];
        ducks[0] = new RubberDuck(12, 2, Birds.DuckType.Rubber);
        ducks[1] = new MallardDuck(9, 2, Birds.DuckType.Mallard);
        ducks[2] = new RedheadDuck(15, 4, Birds.DuckType.Redhead);


        //Show details of a duck, i.e. when you call for e.g. ShowDetails() method of a duck, duck should print its traits.
        for (int i = 0; i < 3; i++) {
            ducks[i].showDetail();
            System.out.println();
        }
        System.out.println();
    }
}