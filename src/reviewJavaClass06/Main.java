package reviewJavaClass06;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        Student[] students = new Student[3];
        Book book1 = new Book("Harry Potter", "Harry Potter", "Joan Rowling", "123", 1999, true);
        Book book2 = new Book("Java", "Java", "Aladin", "12345", 1995, true);

        books[0] = book1;
        books[1] = book2;

        /*Book AccessingTheBookThrowOBJ = books[1];
        System.out.println(AccessingTheBookThrowOBJ.setTitle());*/

        Student stud = new Student("Moneer", "123", 30);
        Student stud1 = new Student("Bryan", "Bryan123", 25);
        Student stud2 = new Student("Mike", "Mike123", 27);
        students[0] = stud;
        students[1] = stud1;
        students[2] = stud2;

        Librarian librarian = new Librarian("Ali", "77");

        Library library = new Library("Syntax", books, students, librarian);

        library.issueBook(book1, stud1, librarian);
        library.issueBook(book1, stud1, librarian);
    }


}
