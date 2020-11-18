package HW11modul2;

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
    private Genre genre;
    private Cover cover;

    public Genre getGenre() {
        return genre;
    }

    public Cover getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
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

    public int getPages() {
        return pages;
    }

    public double getReviewRate() {
        return reviewRate;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPaperSize() {
        return paperSize;
    }

    public int getInternationalStandardBookNumber() {
        return internationalStandardBookNumber;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }


    public void setBookmark(int bookmark) {
        this.bookmark = bookmark;
    }

    public int getBookmark() {
        return bookmark;
    }

    public Book() {
    }


    public Book(String title, int year, String author, int pages, double reviewRate, int bookmark, String originalLanguage,
                int internationalStandardBookNumber, String publisher, String paperSize, Genre genre, Cover cover) {
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
        this.genre = genre;
        this.cover = cover;
    }

    public Book(int bookmark) {
        this.bookmark = bookmark;
    }

    public void percentageBookRead() {
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

    public void displayInfo() {
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
