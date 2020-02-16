import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {


    //ArrayList<int> intList = new ArrayList<>();
    //Primitive Data types are not allowed in collections

    // Primitive Datatypes -> Wrapper Classes
    // int -> Integer
    // char -> Character
    // float -> Float
    // boolean -> Boolean
    // double -> Double
    // short -> Short
    // long -> Long
    // byte -> Byte


    public static void main(String[] args) {


        int i = 23;

        // auto boxing
        Integer num = i; //converted primitive datatype to object returning object representaTIOVE OF THE PRIMITIVE DATATYPER I
        //HERE WE HAVE CONVERTED THE PRIMITIVE DAYATYPE i TO OTS OBJECT FORM INTEGER


        // auto unboxing
        int x = num.intValue(); //gives the int representation of the integer object
//to retrieve the char from the character object
        char c = 'S';
        Character ch = c;
        char cha = ch.charValue();
//after auto boxing or auto unboxing we can hold off the int or char values

        //passed to List interface
        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(i); //gives i=23
//iteration for each loop
        for (Integer y : numList) {
            System.out.println(y);
        }

        System.out.println("_____USING TRADITIONAL FOR________________________");

        for (int z = 0; z < numList.size(); z++) {
            System.out.println(numList.get(z));
        }
//using the iterator to iterate through the list .iterator method of arraylist


        ListIterator<Integer> numItr = numList.listIterator();
        System.out.println("_____________ITERATOR________________");
        while (numItr.hasNext()) //iterator points before 10 and looks for  an element next
         //  after 23 there is no has next so loop[ breaks

        {
            System.out.println(numItr.next());
             if (numItr.nextIndex() == 2) {
                    if (numItr.next() == 30) {
                        numItr.add(67);
                    }
                }

            }
            System.out.println("_____________________________");
            for (Integer y : numList ) {
                System.out.println(y);
            }
            System.out.println("_____________________________");
            while(numItr.hasPrevious()) {
                System.out.println(numItr.previous());
            }
            System.out.println("_____________________________");

            Book b1 = new Book(11, "Java for Testers"); // Book Objects b1 and b2
            Book b2 = new Book(12, "Selenium for Testers");

            List<Book> books = new ArrayList<>();//creating list of books
            books.add(b1);
            books.add(b2);

            for (Book b : books ) {
                System.out.println(b.bookid + "---------" + b.bookName);
            }
           System.out.println("_____________________________");

            List<Book> bookList = new LinkedList<>(); //linked list which should be used where we have multi thrreaded environment
        //all methods are synchronised and uses diff methods to store. its faster to write
            bookList.add(b1);
            bookList.add(b2);

            for (Book b : books ) {
                System.out.println(b.bookid + "---------" + b.bookName);
            }

        }

    }






