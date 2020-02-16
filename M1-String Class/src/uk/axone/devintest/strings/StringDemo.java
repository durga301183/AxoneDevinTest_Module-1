package uk.axone.devintest.strings;

public class StringDemo {

    public static void main(String[] args) {

            String str1 = new String();

            char[] chrArr = {'A','X','O','N','E'};
            String str2 = new String(chrArr);

            String str3 = new String("AXONE");

            //String Literal
            String str = "AXONE"; // Here String is a class but even though not primitive datatype , gives the same result
            System.out.println(str);

            //to concat
            str=str.concat("xyz");
            //str3 = str3.concat(" - Dev In Test");
            //str3.concat(" - Smart Tester");
            System.out.println(str);

            StringBuffer sBuff1 = new StringBuffer("AXONE");

            StringBuilder sBuff = new StringBuilder("AXONE");
            sBuff.append(" - DEv In Test");
            sBuff.append(" : DEc 2020");
            System.out.println(sBuff);

        }

    }




