package HW11modul2;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", 1867, "Tolstoy, Leo", 1225, 4.5,
                234, "russian",
                234234576, "Esmo", "A3", Genre.NOVEL, Cover.PAPERBACKS);
        Book book2 = new Book("Pride and Prejudice", 1813, "Austen, Jane", 432, 4.7,
                23, "english", 2345767, "Esmo",
                "A2", Genre.NOVEL, Cover.HARDCOVER);
        Book book3 = new Book("Divine Comedy", 1321, "Alighieri, Dante ", 712, 4.5,
                45, "italian", 3543578, "World",
                "A4", Genre.EPIC_POETRY, Cover.PAPERBACKS);

        Book book4 = new Book("Anna Karenina", 1877, "Tolstoy, Leo", 864,
                4.5, 23, "russian", 23445767, "Esmo",
                "A2", Genre.NOVEL, Cover.PAPERBACKS);
        Book book5 = new Book("Book about something05", 1675, "Author unknown", 4382, 4.3,
                23, "english", 23457667,
                "Esmo", "A2", Genre.MYSTERY, Cover.HARDCOVER);

        Library library = new Library(new Book[]{book1, book2, book3, book4, book5});
        //  library.displayBooksByGenre(Genre.NOVEL);
        library.displayBooksByAuthor("Tolstoy, Leo");
        // library.displayBooksByCover(Cover.PAPERBACKS);


        //library.insertionSortYear();
        //library.insertionSortAuthor();
        //library.insertionSortTitle();
        //library.displayInfo();
        //book1.percentageBookRead();
    }
}

