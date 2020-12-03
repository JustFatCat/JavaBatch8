package com.syntax.class19;

public class BookHW {
    String name, author;
    BookHW(){
        name = "unknown";
        author = "unknown";
        System.out.println("Name is " + name + ". Author is " + author);
    }

    BookHW(String nameVal, String authorVal){
        name = nameVal;
        author = authorVal;
        System.out.println("Name is " + name + ". Author is " + author);
    }

    public static void main(String[] args) {
        BookHW book1 = new BookHW();
        BookHW book2 = new BookHW("Ubik", "Ph. Dick");

    }



}
