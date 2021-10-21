package com.Core.Question18.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface EmployeeInterface{
    Employee detail(String empName, int age, String city);
}


public class Employee {
    String empName;
    int age;
    String city;

    Employee(String empName, int age, String city){
        this.empName=empName;
        this.age=age;
        this.city=city;
    }
    public String toString(){
        return empName+" "+age+" "+city;
    }

    public static void main(String...args) {
    //using Consumer
    try {
       //  List<Employee> names = Arrays.asList();
        EmployeeInterface empInt=Employee::new;
        Employee emp=empInt.detail("Akshit",22,"Saharanpur");
        Employee emp2=empInt.detail("Rahul",22,"Noida");

        List<String> list=new ArrayList<>();
        list.add(String.valueOf(emp ));
        list.add(String.valueOf(emp2));
        System.out.println(list);
//Using consumer funtion
        System.out.println("Consumer print");
        Consumer<List<String>> printConsumer = (t) -> System.out.println(t);
   Stream<List<String>> empdetail = Stream.of((list));
       empdetail.forEach(printConsumer);

//Using Supplier
        System.out.println("Supplier print");

        Supplier<Boolean> PrintSupplier=() -> list.isEmpty();
           System.out.println(PrintSupplier.get());

        //Using predicate
        System.out.println("predicate print");

        Predicate<String> startPredicate = str -> str.startsWith("A");
       Predicate<String> lengthPredicate = str -> str.length() >= 10;
      list.stream().filter(startPredicate.and(lengthPredicate)).forEach(System.out::println);

      //Using Function
        System.out.println("Function print");

        Function<String, Integer> nameMappingFunction = String::length;
        List<Integer> nameLength = list.stream().map(nameMappingFunction).collect(Collectors.toList());
        System.out.println(nameLength);


    }
    catch (Exception e){
        System.out.print(e+""+e.getMessage());
    }
}

}




