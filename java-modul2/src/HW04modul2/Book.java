package HW04modul2;

public class Book {
    private String title;
    private int year;
    private String author;
    private int pages;
    private double reviewRate;
    private int bookmark;
    private String originalLanguage;
    private int internationalStandardBookNumber;
    private String publisher;
    private String paperSize;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getReviewRate() {
        return reviewRate;
    }

    public void setReviewRate(double reviewRate) {
        this.reviewRate = reviewRate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(String paperSize) {
        this.paperSize = paperSize;
    }

    public int getInternationalStandardBookNumber() {
        return internationalStandardBookNumber;
    }

    public void setInternationalStandardBookNumber(int internationalStandardBookNumber) {
        this.internationalStandardBookNumber = internationalStandardBookNumber;
    }


    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public void setBookmark(int bookmark) {
        this.bookmark = bookmark;
    }

    public int getBookmark() {
        return bookmark;
    }

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public Book(String title, int year, String author, int pages) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.pages = pages;
    }


    public Book(String title, int year, String author, int pages, double reviewRate) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.pages = pages;
        this.reviewRate = reviewRate;
    }


    public Book(String title, int year, String author, int pages, double reviewRate, int bookmark) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.pages = pages;
        this.reviewRate = reviewRate;
        this.bookmark = bookmark;
    }


    public Book(String title, int year, String author, int pages, double reviewRate, int bookmark, String originalLanguage) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.pages = pages;
        this.reviewRate = reviewRate;
        this.bookmark = bookmark;
        this.originalLanguage = originalLanguage;
    }


    public Book(String title, int year, String author, int pages, double reviewRate, int bookmark, String originalLanguage, int internationalStandardBookNumber) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.pages = pages;
        this.reviewRate = reviewRate;
        this.bookmark = bookmark;
        this.originalLanguage = originalLanguage;
        this.internationalStandardBookNumber = internationalStandardBookNumber;
    }

    public Book(String title, int year, String author, int pages, double reviewRate, int bookmark, String originalLanguage, int internationalStandardBookNumber, String publisher, String paperSize) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.pages = pages;
        this.reviewRate = reviewRate;
        this.bookmark = bookmark;
        this.originalLanguage = originalLanguage;
        this.internationalStandardBookNumber = internationalStandardBookNumber;
        this.publisher = publisher;
        this.paperSize = paperSize;
    }

    public Book(int bookmark) {
        this.bookmark = bookmark;
    }


    void displayInfo() {
        System.out.println("Title of the book: " + title);
        System.out.println("Published year: " + year);
        System.out.println("Author of the book: " + author);
        System.out.println("Bookmark page: " + bookmark);
        System.out.println("Original language: " + originalLanguage);
        System.out.println("International Standard Book Number: " + internationalStandardBookNumber);
        System.out.println("publisher: " + publisher);
        System.out.println("Amount of pages: " + pages);
        System.out.println("paperSize: " + paperSize);
        System.out.println("Google review rate: " + reviewRate);
    }


    void percentageBookRead() {
        int pagesRead = this.bookmark;
        int percentagePages;
        if (pagesRead == pages) {
            System.out.println("You have finished the book completely 100%");
        } else {
            percentagePages = (int) Math.round(pagesRead * 100 / (double) pages);
            System.out.println("You have read " + percentagePages + "%");
        }
        System.out.println();
    }
}

class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", 1867, "Tolstoi, Leo", 1225, 4.5, 234, "russian", 234234576, "Esmo", "A3");
        Book book2 = new Book("Pride and Prejudice", 1813, "Austen, Jane", 432, 4.7, 23, "english", 2345767, "Esmo", "A2");
        Book book3 = new Book("Divine Comedy", 1321, "Alighieri, Dante ", 712, 4.5, 45, "italian", 3543578, "World", "A4");

        Book book4 = new Book("Book about something04", 1815, "Author unknown", 4352, 3.0, 23, "english", 23445767, "Esmo", "A2");
        Book book5 = new Book("Book about something05", 1675, "Author unknown", 4382, 4.3, 23, "english", 23457667, "Esmo", "A2");
        Book book6 = new Book("Book about something06", 1900, "Author unknown", 4332, 2.5, 45, "english", 23457767, "Esmo", "A2");
        Book book7 = new Book("Book about something07", 2001, "Author unknown", 4352, 2.4, 78, "english", 23455767, "Esmo", "A2");
        Book book8 = new Book("Book about something08", 2001, "Author unknown", 4321, 4.7, 79, "english", 23745767, "Esmo", "A2");
        Book book9 = new Book("Book about something09", 2002, "Author unknown", 4322, 4.7, 80, "english", 23457967, "Esmo", "A2");
        Book book10 = new Book("Book about something10", 1202, "Author unknown", 4342, 4.7, 91, "english", 23945767, "Esmo", "A2");

        Book[] allBooks = new Book[]{book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};

        //insertionSortYear(allBooks);
        //insertionSortAuthor(allBooks);
        insertionSortTitle(allBooks);

        for (Book book : allBooks) {
            book.displayInfo();
            book.percentageBookRead();
            // System.out.println(book.getYear());
            // System.out.println(book.getAuthor());
        }

    }

    private static void insertionSortYear(Book[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Book temp = arr[i];
            int location = i - 1;
            while (location >= 0 && arr[location].getYear() > temp.getYear()) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = temp;
        }
    }

    private static void insertionSortTitle(Book[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Book temp = arr[i];
            int location = i - 1;
            while (location >= 0 && arr[location].getTitle().compareToIgnoreCase(temp.getTitle()) > 0) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = temp;
        }
    }

    private static void insertionSortAuthor(Book[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Book temp = arr[i];
            int location = i - 1;
            while (location >= 0 && arr[location].getAuthor().compareToIgnoreCase(temp.getAuthor()) > 0) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = temp;
        }
    }
}

