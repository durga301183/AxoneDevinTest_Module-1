package uk.axone.devintest.encap.pack2;

//import uk.axone.devintest.encap.pack1.AccessModifiers; //class outside the package so need to mention the package level though inherited

import uk.axone.devintest.encap.pack1.AccessModifiers;

public class AccessModifierschild extends AccessModifiers {

    void checkdefaultaccess() {

      //  defaultMethod();//cannot call default level access methods or variables

      //  protectedMethod(); can directly call
       // k=10; not allowed
        int i;

        protectedMethod();

        }
    }
