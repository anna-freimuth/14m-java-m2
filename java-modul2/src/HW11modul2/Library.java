package HW11modul2;

public class Library {

    private Book[] allBooks;

    public Library(Book[] allBooks) {
        this.allBooks = allBooks;
    }


    public void displayBooksByGenre(Genre genre) {
        for (int i = 0; i < allBooks.length; i++) {
            Genre temp = allBooks[i].getGenre();
            if (temp.equals(genre)) {
                System.out.println("This book by this Genre: " + temp + allBooks[i]);
                System.out.println("-------------------------");
            }
        }
    }


    public void displayBooksByAuthor(String author) {
        for (int i = 0; i < allBooks.length; i++) {
            String temp = allBooks[i].getAuthor();
            if (temp.equals(author)) {
                System.out.println("This book by this author: " + temp + allBooks[i]);
                System.out.println("-------------------------");
            }
        }
    }

    public void displayBooksByCover(Cover cover) {
        for (int i = 0; i < allBooks.length; i++) {
            Cover temp = allBooks[i].getCover();
            if (temp.equals(cover)) {
                System.out.println("This book by this cover: " + temp + allBooks[i]);
                System.out.println("-------------------------");
            }
        }
    }

    public void insertionSortYear() {
        for (int i = 1; i < allBooks.length; i++) {
            Book temp = allBooks[i];
            int location = i - 1;
            while (location >= 0 && allBooks[location].getYear() > temp.getYear()) {
                allBooks[location + 1] = allBooks[location];
                location--;
            }
            allBooks[location + 1] = temp;
        }
    }

    public void insertionSortTitle() {
        for (int i = 1; i < allBooks.length; i++) {
            Book temp = allBooks[i];
            int location = i - 1;
            while (location >= 0 && allBooks[location].getTitle().compareToIgnoreCase(temp.getTitle()) > 0) {
                allBooks[location + 1] = allBooks[location];
                location--;
            }
            allBooks[location + 1] = temp;
        }
    }

    public void insertionSortAuthor() {
        for (int i = 1; i < allBooks.length; i++) {
            Book temp = allBooks[i];
            int location = i - 1;
            while (location >= 0 && allBooks[location].getAuthor().compareToIgnoreCase(temp.getAuthor()) > 0) {
                allBooks[location + 1] = allBooks[location];
                location--;
            }
            allBooks[location + 1] = temp;
        }
    }

    public void displayInfo() {
        for (Book book : allBooks) {
            book.displayInfo();
        }
    }
}
