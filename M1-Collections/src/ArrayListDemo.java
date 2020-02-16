import java.util.ArrayList;

public class ArrayListDemo {

    // Insertion order is maintained
    // Duplicates are allowed
    // null is allowed
    public static void main(String[] args) {

        // pre java 1.4

        ArrayList hbs = new ArrayList();// resizable -array implementation of the List interface

        //since java 1.5
        ArrayList<String> herbList = new ArrayList<String>();

        //since java 1.7 . array list of type string
        ArrayList<String> hbList = new ArrayList<>();

        hbList.add("Basil");
        hbList.add("Thyme");
        hbList.add("Rosemary");
        hbList.add("Thyme");
        hbList.add("Thyme");
        hbList.add(null);
        hbList.add(null);
//to iterate through the array list
        for (String herb : hbList) //for each string herb in the hblist
        {

            System.out.println(herb);
        }
        System.out.println("_____________________________");
           hbList.remove(0);
            hbList.remove("Thyme"); //should be printed to see the removed string
            for (String herb: hbList) {
                System.out.println(herb);
            }
           System.out.println("_____USING TRADITIONAL FOR________________________");

            for (int i = 0 ; i< hbList.size(); i++) {
                System.out.println(hbList.get(i));
            }

        }





    }
