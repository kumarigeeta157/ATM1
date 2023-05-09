import java.util.ArrayList;

public class BankNetwork {
    private ArrayList<BankComputer> banksInDatabase = new ArrayList<BankComputer>();

    public void addBankToNetwork(BankComputer newBank){

        this.banksInDatabase.add(newBank);

    }
    public boolean isATMCardsBankInNetwork(Card theCard){

        boolean cardVerification = false;

        int cardBankID = getFirstTwoDigits(theCard.getStripNumber());

        for(BankComputer bank : banksInDatabase){

            if(bank.getBankID() == cardBankID){

                cardVerification = true;

            }

        }

        return cardVerification;

    }

    static int getFirstTwoDigits(int stripNumber) {

        String stringOfStripNumber = Integer.toString(stripNumber);

        int bankIDFromStrip = Integer.parseInt(stringOfStripNumber.substring(0, 2));

        return bankIDFromStrip;
    }
    public boolean verifyThePIN(Transaction theTransaction){
        boolean cardVerification = false;
        if(theTransaction.getDidCardVerify()){
            for(BankComputer bank : banksInDatabase){

                if(bank.getBankID() == theTransaction.getBankID()){

                    bank.verifyThePIN(theTransaction);
                    cardVerification = true;
                } else {
                    System.out.println("The card Bank ID doesn't match any in the system");

                }
            }

        }
        return cardVerification;

    }
    public void requestWithdrawalAmt(Transaction theTransaction){

        if(theTransaction.getDidCardVerify()){

            for(BankComputer bank : banksInDatabase){
                if(bank.getBankID() == theTransaction.getBankID()){
                    bank.requestWithdrawalAmt(theTransaction);
                }
            }

        } else {

            System.out.println("An Error Occurred During the Withdrawal");
        }

    }

}
