package com.Core.Question20;

class Duck implements Birds_Interface {
    private double weight;
    private int numberWings;
    private Birds.DuckType duckType;
    public Duck(double weight, int numberWings, Birds.DuckType duckType)
    {
        this.weight = weight;
        this.numberWings = numberWings;
        this.duckType = duckType;
    }
    @Override
    public void showDetail() {
        if (duckType == Birds.DuckType.Mallard)
        {
            System.out.println("Mallard duck:");
        }
        if (duckType == Birds.DuckType.Rubber)
        {
            System.out.println("Rubber duck:");
        }
        if (duckType == Birds.DuckType.Redhead)
        {
            System.out.println("Redhead duck:");
        }
        System.out.println("Weight:   "+weight);
        System.out.println("Number of wings:   "+numberWings);
    }

}
