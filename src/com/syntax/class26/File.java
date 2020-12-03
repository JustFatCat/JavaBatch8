package com.syntax.class26;

public abstract class File {
    public abstract void open();
    public void edit(){
        System.out.println("I can be edit");
    }
    public void close(){
        System.out.println("I can be close");
    }
}
