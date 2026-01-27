package librarymanagementsystem;

public class Student implements Member {

    public int numberOfBooks;
    public int duration;

    public Student(int numberOfBooks, int duration) {
        this.numberOfBooks = numberOfBooks;
        this.duration = duration;
    }


    @Override
    public void getMaxBooks() {
        int maxAllowed = 5;

        if (numberOfBooks <= maxAllowed) {
            System.out.println("Student can take " + numberOfBooks + " books");
        } else {
            System.out.println("Student cannot take more than " + maxAllowed + " books");
        }
    }

    @Override
    public void getDuration() {
        System.out.println("Students should return books within: " + duration + " days");
    }
}
