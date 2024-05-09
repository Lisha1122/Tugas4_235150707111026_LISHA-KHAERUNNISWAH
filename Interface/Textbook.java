public class Textbook extends Book implements BookOperations {
    private String subject;

    public Textbook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    public void borrowBook() {
    if (isBorrowed()) {
        System.out.println("Textbook is already borrowed.");
         } else {
        setBorrowed(true);
        System.out.println(getTitle() + " borrowed successfully.");
        }
    }   

    public void returnBook() {
        if (!isBorrowed()) {
            System.out.println("Textbook is not borrowed.");
        } else {
            setBorrowed(false);
            System.out.println(getTitle() + " returned succesfully.");
        }
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    public String toString() {
        return "Title\t: " + getTitle() +
                "\nAuthor\t: " + getAuthor() +
                "\nYear\t: " + getYear() +
                "\nBorrowed: " + isBorrowed() +
                "\nSubject\t: " + subject;
    }
}