//Maps using key value pair
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

    public class MapDemo {

        public static void main(String[] args) {

            Map<String, String> simpleMap = new HashMap<>();//syntax which has one of the implementing class as hashmap
            simpleMap.put("name", "Sridevi");//put is like add which takes key value pair
            simpleMap.put("role", "Trainer");
//get me the entry object which is of type string which represent one entry in the map where object is map.entry

            for (Map.Entry<String, String> simpleMapEntry : simpleMap.entrySet()) {
                //for each of the entry gte me the key ,getting key and value in one go
                System.out.println(simpleMapEntry.getKey() + "_____" +simpleMapEntry.getValue());
            }

            System.out.println("_____________________________");
//treemap
            Map<String, String> appConfig = new TreeMap<>();
            appConfig.put("url", "www.axone.uk");
            appConfig.put("username", "admin");
            appConfig.put("password", "devintest");
            appConfig.put("appName", "Selenium");
            appConfig.put("address", "192.168.1.1");

            appConfig.put("username", "sriadmin");


            System.out.println("_____________________________");



            for (Map.Entry<String, String> appConfigEntry : appConfig.entrySet()) {
                System.out.println(appConfigEntry.getKey() + "_____" +appConfigEntry.getValue());
            }

            Map<String, Book> bookMap = new HashMap<>();
            bookMap.put("Sri", new Book(123, "Java"));
            bookMap.put("Karthik", new Book(23, "Selenium"));

            System.out.println("_____________________________");
            for (Map.Entry<String, Book> bookMapEntry : bookMap.entrySet()) {
                System.out.println(bookMapEntry.getKey() + "_____" +bookMapEntry.getValue());
            }
        }
    }


