public class TestATM {
    public static void main(String[] args){

        Account theAccount = new Account(10, "7895", "kamal", 10000, 12312224);

        Card customersATMCard = new Card(theAccount.getPin(), theAccount.getStripNumber());

        Customer theCustomer = new Customer(customersATMCard);

        BankComputer xyzBankComputer = new BankComputer();

        xyzBankComputer.addAcctToBank(theAccount);

        BankNetwork theBankNetwork = new BankNetwork();

        theBankNetwork.addBankToNetwork(xyzBankComputer);

        ATM mainStreetATM = new ATM(theBankNetwork);

        mainStreetATM.isStripReadable(customersATMCard);

        mainStreetATM.isATMCardsBankInNetwork(customersATMCard);

        mainStreetATM.insertPIN(customersATMCard, 1234);

        mainStreetATM.pickAcctToAccess();

        mainStreetATM.amountToWithdrawal();


        mainStreetATM.getTransactionInfo();

    }

}
