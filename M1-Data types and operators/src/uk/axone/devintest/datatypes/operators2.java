package uk.axone.devintest.datatypes;

public class operators2 {
    int x = 10;
    int y = 20;

    //Arithmetic  Operators
    int a =  x - y;//subtraction
    int b = x * y;//multiplication
    int c = x / y;//division
    int d = x % y;//Modulus - 3 %2 = 1; 15 % 5 = 0; 7 %5 = 2

    //Assignment operators
    int k = 4;
    int m = 3;

    k += m; //k = k + m;
    k -= m;//k = k - m;
    k *= m;//k = k * m;
    k /= m;// k= k / m;

    // Increment Operators
   int x = 10;
   int y = 10;

        System.out.println(x++); // x = x + 1 - Post increment - Value is incremented but available only in the next statement
        System.out.println(x);
        System.out.println(++y); // y = y + 1 - pre increment - value is incremented and available in the same statement
        System.out.println(y);

    //decrement
    x--;// x = x -1 - post decrement
        --y;// y = y -1 - pre decrement

        System.out.println("------------------------------");
    //comparison operators - return a boolean value
    x =20;
    y =10;

        System.out.println(x == y);//used only for primitive datatypes
        System.out.println(x != y);

    //numeric data types only
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);

}


