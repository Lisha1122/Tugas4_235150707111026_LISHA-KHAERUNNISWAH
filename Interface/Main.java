public class Main {
    public static void main(String[] args) {
        // Create objects
        Textbook textbook = new Textbook("Java Programing", "John Smith", 2020, "Mathematics");
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        Magazine magazine = new Magazine("National Geograhic", "Various", 2021, "Sains");

        System.out.println("----- Book Information -----");
        System.out.println(textbook);
        System.out.println(novel);
        System.out.println(magazine);
     
        System.out.println("\n---- Borrowing and Returning Books ----");
        System.out.printf("Textbook: %s borrowed successfully.\n", textbook.getTitle());
        System.out.printf("Magazine: %s borrowed successfully.\n", magazine.getTitle());
        System.out.printf("Textbook: %s returned successfully.\n", textbook.getTitle());
        System.out.printf("%s is %s\n", "Novel\t: To Kill a Mockingbird", novel.isBorrowed() ? "borrowed" : "not borrowed");
        
    }

    }

