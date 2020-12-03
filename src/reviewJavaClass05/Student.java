package reviewJavaClass05;

public class Student {
    public static void main(String[] args) {
        School.schoolName = "Harvard";

        School stud1 = new School();
        stud1.name = "John";
        stud1.lastName = "Terry";
        stud1.age = 12;

        School stud2 = new School();
        stud2.name = "James";
        stud2.lastName = "Miller";
        stud2.age = 9;

        /*System.out.println(stud1.name);
        System.out.println(stud2.name);
        System.out.println(stud1.schoolName);
        System.out.println(stud2.schoolName);*/

        /*stud1.printDetails();
        stud2.printDetails();*/

        stud1.study(3);

        School.goToSchool();


    }
}
