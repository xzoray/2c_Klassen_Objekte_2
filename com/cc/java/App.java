package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Grizabella", "white", 29, true);

        output(cat1.getStringAttributes("#name"));
        output(cat1.getStringAttributes("#color"));
        
        output(cat1.getAge());  
        


        output("-------------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35, false);

        output(cat2.getStringAttributes("#name"));
        output(cat2.getStringAttributes("#color"));
        
        output(cat2.getAge()); 

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

