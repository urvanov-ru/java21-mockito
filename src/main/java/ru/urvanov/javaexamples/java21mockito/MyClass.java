package ru.urvanov.javaexamples.java21mockito;

public class MyClass {

    private MyDependencyClass myDependencyClass;
    
    public int sum(int x, int y) {
        return x + y;
    }

    public String name(String arg0) {
        return myDependencyClass.dependencyMethod("Name: " + arg0);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, Mockito!");
    }
}