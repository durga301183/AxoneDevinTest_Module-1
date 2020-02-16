package uk.axone.devintest.encap.pack1;

import java.io.File;
import java.io.FileInputStream;

    import java.io.File;
import java.io.FileInputStream;

//default level of access

//private level possible for nested class ie clas with in another class
public class AccessModifiers {

        //variables with public access
        public int i;
        public String str;
        public File readMe; // File is java io file so to be imported

        //variables with private access
        private int j;
        private String str1;

        //variables with protected access
        protected int n;
        protected FileInputStream fis;

        //variables with default access
        int k;
        boolean flag;

        //public method
        public void publicMethod(){

        }

        //private method
        private int privateMethod(){

                return 0;
        }

        //protected method
        protected boolean protectedMethod()
        {
            return false;
        }

        //default access method
        void defaultMethod(){

        }

    }








