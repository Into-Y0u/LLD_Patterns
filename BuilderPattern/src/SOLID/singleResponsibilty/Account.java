package SOLID.singleResponsibilty;

import java.util.HashMap;

public class Account {
    private int accountNo;
    private String accountHolderName;
    private String accountHolderAddress;
    private HashMap<Integer, Object> accountMap = new HashMap<Integer, Object>();

    public Account() {

    }

    public void setAccountNo(int accNo) {
        this.accountNo = accNo;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountHolderAddress(String accountHolderName) {
        this.accountHolderAddress = accountHolderName;
    }

    public String createAccount() {
        accountMap.put(accountNo, this);
        return printAccountDetails();
    }

    public Account getAccount(int accountNo) {
        return (Account) accountMap.get(accountNo);
    }

    public String printAccountDetails() {
        return "[AccountNo]" + this.accountNo + "\n" + "[AccountHolderName]" + this.accountHolderName + "\n"
                + "[AccountHolderAddress]" + this.accountHolderAddress;
    }
}
