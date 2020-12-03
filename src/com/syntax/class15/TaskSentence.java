package com.syntax.class15;

public class TaskSentence {
    public static void main(String[] args) {
        //task 1
        String sent = "How are you?";
        System.out.println(sent.replaceAll("\\s", "") );//or we can use just " " instead of \\s

        //task 2
        String str = "35464##%3 **&* How **& Are you&";
        System.out.println(str.replaceAll("[^0-9]", ""));
        String str1 = str.replaceAll("[^0-9]", "");
        System.out.println(str1.length());

        //task 3
        String string = "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(string.replaceAll("[^!.?]", ""));//count the exclamation marks
        System.out.println(string.replaceAll("[^!.?]", "").length());// or [//sA-Za-z0-9], so only special characters left

    }


}
