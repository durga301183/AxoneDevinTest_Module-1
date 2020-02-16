import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> countries= new HashSet<>();

        /* no duplicate elements and atmst one null element
        set does not allow duplicates. insertion order is not maintained

        for real time example, if we are trying to pick up all the web elements and create a set of all those web elemenst and
        if we are trying to test or look for anything in the application and if it contains null or something is missing , we always try to
         demosntratrate null.
         */

        countries.add("united kingdom");
        countries.add("united kingdom");
        countries.add("null");

        countries.add("germany");



        for (String c: countries){
            System.out.println(c);
        }
    }










}
