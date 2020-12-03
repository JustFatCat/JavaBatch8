package com.syntax.class26;

public class FileMain {
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new WordFile(), new PDFFile()};
        for (File file: files) {
            file.open();
        }
    }
}
