public class Novel extends Book implements BookOperations {
    private String genre;

    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    public void borrowBook() {
        if (isBorrowed()) {
            System.out.println("Novel is already borrowed.");
            return;
        }
        setBorrowed(true);
        System.out.println(getTitle() + " borrowed succesfully.");
    }

    public void returnBook() {
        if (!isBorrowed()) {
            System.out.println("Novel is not borrowed.");
            return;
        }
        setBorrowed(false);
        System.out.println(getTitle() + " returned succesfully.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }

    public String toString() {
        return "\nTitle\t: " + getTitle() +
                "\nAuthor\t: " + getAuthor() +
                "\nYear\t: " + getYear() +
                "\nBorrowed: " + isBorrowed();
                
    }
}