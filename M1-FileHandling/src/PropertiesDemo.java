import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.net.URL;
import java.util.Properties;

public class PropertiesDemo {

    static FileInputStream fis;  //declared outside as globaL VARIABLES as they were earlier in try block
    static Properties props; //as main methos is static we need to declare as static variables
    //only static variables can be used in a static method

    public static void main(String[] args) throws IOException {

        //to start reading the file we need class called fileinputstream
        //checked exceptions.so handle it by try catch
        //inputstream is aparent clas of fileinputstream so i can substitute with any child class which
        // is fileinputstream and throws io exception
        //we jave  aclass called properties from java.util package.
// Map takes key value pair. we have a file on disk and this class will help to read that file

        //method load take inputstream as parameter,once loaded then we can read the key valuer pairs.
//two exception blocks for fileinputstream and load methods


        //key = value, in the property file left is key and right is value
        try {
            fis = new FileInputStream("C:\\Users\\G S Sastry\\IdeaProjects\\Developer in Test-Dec 2019\\M1-FileHandling\\application.properties ");

            props = new Properties();
            props.load(fis);

        } catch (FileNotFoundException e) {

            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close(); //close method is added to throws class
        }


        //to start reading the property file

        String url = props.getProperty("URL");

        System.out.println(url);

        String bro = props.getProperty("browser");
        System.out.println(bro);

    }
}
//in general data is fetch from the file and stored ina map. map wil be accessed to read the data rather than reading each and every pair value as it sloes down the application.

//if there are two entried with same key then the later one os picked
// key which does not exist is returned a snull//all the dat acan be stored in map as key value pair and all data can beused where required  and we
//we dont have to read each and every line of the data.