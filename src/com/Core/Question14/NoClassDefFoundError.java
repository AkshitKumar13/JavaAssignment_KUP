package com.Core.Question14;

public class NoClassDefFoundError {
    void show()
    {
        System.out.println( "It is JavaTpoint section" );
    }
}

// Comment this class and after run this program then it will show the exception NoClassDefFoundError
class Data extends  NoClassDefFoundError
{
    void showData()
    {
        System.out.println( "It is database section" );
    }
}
class NoClassDefFoundErrorExample{
    public static void main(String args[])
    {
         Data data = new Data();  //after remove the Data class  run this program and you can see the exception NoClassDefFoundError
        data.showData();
        data.show();
    }
}
