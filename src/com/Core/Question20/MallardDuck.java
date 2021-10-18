package com.Core.Question20;

class MallardDuck extends Duck{

    public MallardDuck(double weight, int numberWings, Birds.DuckType duckType) {
        super(weight, numberWings, duckType);
    }
    public void showDetail(){
        super.showDetail();
        System.out.println("Mallard ducks fly fast and quack loud.");
    }
}
