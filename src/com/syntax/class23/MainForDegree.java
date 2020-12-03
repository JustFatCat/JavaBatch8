package com.syntax.class23;

public class MainForDegree {
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.prerequisite();

        Bachelors bachelors = new Bachelors();
        bachelors.prerequisite();

        Masters masters = new Masters();
        masters.prerequisite();
    }


}
