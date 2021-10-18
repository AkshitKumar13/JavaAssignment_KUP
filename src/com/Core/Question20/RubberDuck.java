package com.Core.Question20;

class RubberDuck  extends Duck  {


    public RubberDuck(double weight, int numberWings, Birds.DuckType duckType) {
        super(weight, numberWings, duckType);
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("Rubber ducks don’t fly and squeak.");
    }
}
