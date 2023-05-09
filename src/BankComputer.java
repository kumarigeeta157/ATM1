import java.util.ArrayList;

public class BankComputer {

    private int bankID = 9;
    private String bankName = " ";
    private ArrayList<BankComputer> banksInDatabase = new ArrayList<BankComputer>();



    public int getBankID() {
        return bankID;
    }



    public ArrayList<Account> accounts= new ArrayList<>();
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

    static int getFirstTwoDigits(int stripNumber){
        String stringOfStripNumber = Integer.toString(stripNumber);
        int bankIDFromStrip = Integer.parseInt(stringOfStripNumber.substring(0,2));
        return bankIDFromStrip;

    }

    public boolean verifyThePIN(Transaction theTransaction){
        boolean cardVerification = false;
        if(theTransaction.getDidCardVerify()){
            for(BankComputer bank : banksInDatabase){
                if(bank.getBankID() == theTransaction.getBankID()){
                    bank.verifyThePIN(theTransaction);
                    cardVerification = true;
                }
                else{
                    System.out.println("The card Bank Id does not match in the System . ");

                }

            }

        }
        return cardVerification;

    }
    public void requestWithdrawalAmt(Transaction theTransaction){
        if(theTransaction.getDidCardVerify()) {
            for (BankComputer bank : banksInDatabase) {
                if (bank.getBankID() == theTransaction.getBankID()) {
                    bank.requestWithdrawalAmt(theTransaction);

                }

            }
        }
        else{

            System.out.println("An Error Occurred During the Withdrawal .");

        }

    }

    public void addAcctToBank(Account theAccount) {
    }
}
