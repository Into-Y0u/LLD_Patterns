package SOLID.singleResponsibilty;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNo(1);
        account.setAccountHolderName("Taposh");
        account.setAccountHolderAddress("ABC Village");
        System.out.println(account.createAccount());
        Account newAccount = account.getAccount(1);
        System.out.println("Single object printing " + newAccount.printAccountDetails());
    }
}
