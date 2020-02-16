public class Book implements  Comparable<Book> {
//Book is an entity

    String bookName;
    int bookid;            //variables

    //constructor
    Book(int bookid, String bookName) {

        this.bookid = bookid;
        this.bookName = bookName;

    }

    //method shoudl be overridden and shoudl tell how to sort it, if w ewant to sort for example by id
    @Override
    public int compareTo(Book anotherBook) {
        if (this.bookid > anotherBook.bookid) {
            return 1;
        } else {
            if (this.bookid < anotherBook.bookid) {
                return -1;
            } else {
                return 0;
            }

        }
    }


}

