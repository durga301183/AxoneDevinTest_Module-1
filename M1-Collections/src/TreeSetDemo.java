import java.util.Set;
import java.util.TreeSet;

//treeset is a subclass of  sorted set//when we use treeset we need to implement interface
public class TreeSetDemo {

    // does not allow null
        // sorts using the natural ordering
        public static void main(String[] args) {

            Set<String> countries = new TreeSet<>();

            countries.add("United Kingdom");
            countries.add("United Kingdom");
            countries.add("United Kingdom");
            countries.add("France");
            countries.add("Spain");
            countries.add("Germany");
            countries.add("Germany");
            countries.add("Germany");

            for (String c : countries) {
                System.out.println(c);
            }
            System.out.println("_____________________________");
            Set<Book> bookSet = new TreeSet<>();
            Book b1 = new Book(11, "Java for Testers");
            Book b2 = new Book(123, "Java2 for Testers");
            Book b3 = new Book(125, "Selenium3 for Testers");
            Book b4 = new Book(12, "Selenium for Testers");

            bookSet.add(b1);
            bookSet.add(b2);
            bookSet.add(b3);
            bookSet.add(b4);

            for (Book b : bookSet ) {
                System.out.println(b.bookid + "---------" + b.bookName);
            }

//thrown error because there is no natural ordering .it cannot sort them and thrown below error
            //Exception in thread "main" java.lang.ClassCastException: Book cannot be cast to java.lang.Comparable
        }
    }






