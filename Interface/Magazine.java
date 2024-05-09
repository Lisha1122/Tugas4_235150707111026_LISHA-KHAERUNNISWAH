public class Magazine extends Book implements BookOperations {
    private String category;

    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }

    public void borrowBook() {
        if (isBorrowed()) {
            System.out.println("Magazine is already borrowed.");
            return;
        }
        setBorrowed(true);
        System.out.println(getTitle() + " borrowed succesfully.");
    }

    public void returnBook() {
        if (!isBorrowed()) {
            System.out.println("Magazine is not borrowed.");
            return;
        }
        setBorrowed(false);
        System.out.println(getTitle() + " returned succesfully.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: " + category);
    }

    public String toString() {
        return "\nTitle\t: " + getTitle() +
                "\nAuthor\t: " + getAuthor() +
                "\nYear\t: " + getYear() +
                "\nBorrowed: " + isBorrowed();
               }
}