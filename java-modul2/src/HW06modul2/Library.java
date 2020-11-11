package HW06modul2;

import de.telran.data.Book;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public boolean addBook(Book kniga) {
        if (size < books.length) {
            books[size] = kniga;
            size++;
            return true;
        }
        return false;
    }

    public void insertionSortAuthor(){
        Book[] arr = books;
        for (int i =1; i < size; i++) {
            Book temp = arr[i];
            int location  = i - 1;
            while(location >= 0 && arr[location].getAuthor().compareToIgnoreCase(temp.getAuthor()) > 0){
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location+1] = temp;
        }
    }

    public  int binarySearchBook (String author){
        int elementPosition = -1;
        int lowIndex = 0;
        int highIndex = size -1;
        while(lowIndex<=highIndex){
            int middleIndex = (lowIndex + highIndex)/2;
            if(books[middleIndex].getAuthor().equalsIgnoreCase(author)){
                    elementPosition= middleIndex;
                    break;
            }else if (books[middleIndex].getAuthor().compareToIgnoreCase(author) > 0) {
                highIndex = middleIndex - 1;
            } else {
                lowIndex = middleIndex + 1;
            }
        } return elementPosition;
    }


    public boolean deleteBookFromArray(Book kniga) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(kniga)) {
                books[i] = books[size - 1];
                books[size - 1] = null;
                // теоретически работает и без неё но с интересным эффектом
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayDeleteBook() {
        System.out.println(books[size - 1]);
        System.out.println(books[size]);
        System.out.println(books[size + 1]);
    }

    public void displayAllArray() {
        for (Book element : books) {
            System.out.println(element);
        }
    }
}

