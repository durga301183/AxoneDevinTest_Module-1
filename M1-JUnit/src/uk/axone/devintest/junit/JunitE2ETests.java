package uk.axone.devintest.junit;
import org.junit.*;
import org.junit.runners.MethodSorters;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)

    public class JunitE2ETests {

        /*Login
         * book ticket
         * check status
         * cancel ticket
         * logout
         */

        //gets run only once at the beginning of the class being run
        @BeforeClass
        public static void loadTestData(){
            //Clear old data
            //load the tickets for check-in and cancel
            System.out.println("Loading Test Data ... ");
        }

        //will get at the beginning of each test
        @Before
        public void login(){
            System.out.println(" Logging into the application..");
        }

        @Test
        public void A_bookTicket(){
            System.out.println("Booking a ticket");
        }


        @Test
        public void C_checkIN(){
            System.out.println("Checking IN with the ticket");
        }

        @Test
        public void B_cancelTicket(){
            System.out.println("Cancelling the ticket");
        }


        //will get run after each test
        @After
        public void logout(){
            System.out.println("Logging out of the application..");
        }

        //gets run only once at the end of the class being run
        @AfterClass
        public static void tearDown(){
            //delete all test records for this run
            System.out.println("Tidying up Test Data");
        }


    }

