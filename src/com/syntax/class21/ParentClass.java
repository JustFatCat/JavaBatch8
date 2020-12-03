package com.syntax.class21;

import com.syntax.class20.Parent;

public class ParentClass {
    int money;
    ParentClass(int money){
        this.money = money;
        System.out.println("From Parent");
    }

    void marry(){
        System.out.println("We have selected Lisa Clashinova " + money);

    }
}
