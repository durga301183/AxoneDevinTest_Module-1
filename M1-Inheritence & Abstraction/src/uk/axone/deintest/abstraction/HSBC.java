package uk.axone.deintest.abstraction;

public class HSBC implements Bank,FinancialInstitution {

    String sortCode;

    public HSBC(String sortCode, String branchName){

    }
    @Override
    //annoation , this makes sure i am implementing methods in interface
    public void depositCash(int amount) {
//HSBC specific implementation for deposit cash
    }

    @Override
    public boolean withdrawCash(int amount) {
      //  HSBC specific implementation
        return false;
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public int getSortcode() {
        return 0;
    }
   //own methods other than interface methods
    public boolean processPersonalLoans(){
        return false;
    }


    @Override
    public int getCompanyNumber() {
        return 0;
    }

    @Override
    public String getVATReg() {
        return null;
    }

    @Override
    public int getEncryptionType() {
        return 0;
    }

    @Override
    public int getFinType() {
        return 0;
    }
}
