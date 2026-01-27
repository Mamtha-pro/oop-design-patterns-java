package librarymanagementsystem;

public class Faculty implements Member {

    public int numberOfBooks;
    public int duration;

    public Faculty(int numberOfBooks, int duration) {
        this.numberOfBooks = numberOfBooks;
        this.duration = duration;
    }

    @Override
    public void getMaxBooks() {
        int maxAllowed = 10;

        if (numberOfBooks <= maxAllowed) {
            System.out.println("Faculty can take " + numberOfBooks + " books");
        } else {
            System.out.println("Faculty cannot take more than " + maxAllowed + " books");
        }
    }

    @Override
    public void getDuration() {
        System.out.println("Faculty should return books within: " + duration + " days");
    }
}
