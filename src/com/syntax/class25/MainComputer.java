package com.syntax.class25;

public class MainComputer {
    public static void main(String[] args) {
        Computer[] computerArray = new Computer[4];
        computerArray[0] = new Apple("Type", "model", 123);
        computerArray[1] = new Lenovo("Type", "model", 123);
        computerArray[2] = new HP("Type", "model", 123);
        computerArray[3] = new Dell("Type", "model", 123);

        for (Computer comp : computerArray) {
            comp.showMovies();
            comp.performOperations();
        }

        //здесь я создаю массив и каждым элементом делаю объект, потом с помощью for each loop
        //прохожу по каждому элементу массива и его методы выполняются, это на основе полиморфизма


    }
}
