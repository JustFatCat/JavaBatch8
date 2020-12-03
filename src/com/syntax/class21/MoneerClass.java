package com.syntax.class21;

public class MoneerClass extends ParentClass{
    int money;

    MoneerClass(int money) {
        super(money);
        //super.money = 30;
        //this.money = 20;
        }
       /*MoneerClass(int money){
           super(money);
           System.out.println("From child");
       }*/
        void marry(){
        super.marry();
        System.out.println("I will marry Katrina, ok go merry her, here is the money " + money);
    }

    public static void main(String[] args) {
        MoneerClass moneerClass = new MoneerClass(100);
        moneerClass.marry();
    }
}
