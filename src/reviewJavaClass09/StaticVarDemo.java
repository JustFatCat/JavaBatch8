package reviewJavaClass09;
class Student {
    static int totalStudentCount;
    static String schoolName = "Syntax";
    String name;
    final static int MAX_STUDENTS_ALLOWED = 300;
    static Student student = null;

    private Student() {
        totalStudentCount++;
    }

    static Student getInstance() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }


        void printInfo(){
            System.out.println("Name of the student " + name + ". Name of the school " + schoolName + ". Total students registered " + totalStudentCount);
        }
    }

    class School {
        Student[] students = new Student[Student.MAX_STUDENTS_ALLOWED];
        int studentCounter = 0;

        public void addStudent(Student student) {
            if (studentCounter < Student.MAX_STUDENTS_ALLOWED) {
                students[studentCounter++] = student;
                System.out.println("Student " + student.name + " admitted");
            } else {
                System.out.println("No more room, please join next Batch");
            }
        }
    }
    public class StaticVarDemo {
        public static void main(String[] args) {
            Student student5 = Student.getInstance();
            student5.name = "Sofia";
            student5.printInfo();

            Student student6 = Student.getInstance();
            student6.name = "Ali";
            student6.printInfo();
            System.out.println(student5.name);
            System.out.println(student6.name);

        /*Student student2 = new Student();
        student2.name = "Sofia";
        student2.printInfo();
        school.addStudent(student2);

        Student student3 = new Student();
        student3.name = "Mike";
        student3.printInfo();
        school.addStudent(student3);

        Student student4 = new Student();
        student4.name = "Natasha";
        student4.printInfo();
        school.addStudent(student4);*/

        }
    }
