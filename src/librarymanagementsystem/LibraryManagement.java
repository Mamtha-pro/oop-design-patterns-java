package librarymanagementsystem;

public class LibraryManagement {
    public static void main(String[] args) {



        Member student = new Student(5, 14);
        student.getMaxBooks();
        student.getDuration();

        System.out.println("-----------");

        Member faculty = new Faculty(10, 30);
        faculty.getMaxBooks();
        faculty.getDuration();
    }
}
