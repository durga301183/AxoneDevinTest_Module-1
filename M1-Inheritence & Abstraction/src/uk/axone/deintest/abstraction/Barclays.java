package uk.axone.deintest.abstraction;

public class Barclays implements Bank{


    @Override
    public void depositCash(int amount) {
        //might be slightly different method to what HSBC does. Barclays specific
    }

    @Override
    public boolean withdrawCash(int amount) {
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

    public boolean processPersdonalLoans(){
        return true;
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
}
