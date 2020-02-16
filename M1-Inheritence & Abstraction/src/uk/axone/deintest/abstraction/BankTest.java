package uk.axone.deintest.abstraction;

public class BankTest {
    public static void main(String[] args) {
       // Bank mybank = new Bank(); //Bank is abstract , cannot be instantiated

        HSBC highstreet= new HSBC("20-23-43", "slough");
        //this works as compiler adds default constructor. if we add ours then this is not used.If we ewant it we have to add it

        highstreet.depositCash(100);
        highstreet.processPersonalLoans();


        Barclays exeterBranch = new Barclays();
            exeterBranch.processPersdonalLoans();


    }
}
