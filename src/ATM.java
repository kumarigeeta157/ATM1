import java.util.Scanner;

public class ATM {
    private Transaction theTransaction = null;
    private BankNetwork networkOfBankOnATM = null;
    static Scanner userInput = new Scanner(System.in);
    ATM(BankNetwork networkOfBankOnATM){
        this.networkOfBankOnATM = networkOfBankOnATM;

    }
    public boolean isStripReadable(Card theCard){
        int numberOfDigitsInStrip = (int) (Math.log10(theCard.getStripNumber())+1);

        theTransaction = new Transaction(theCard.getStripNumber());
        if(numberOfDigitsInStrip == 10){
            return true;

        }
        else{
            return false;
        }

    }
    public boolean insertPIN(Card theCard , int pin){
        int numberOfDigitsInPIN = (int) (Math.log10(pin)+1);
        if(numberOfDigitsInPIN != 4){
            System.out.println("You have to enter 4 digits for a PIN.");
            return false;

        }
        else{
            theTransaction.setPin(pin);
            networkOfBankOnATM.verifyThePIN(theTransaction);
        }
        return false;

    }
    public void pickAcctToAccess(){
        System.out.println("What Account do you want to withdrawal From ");
        System.out.println("(1 - Savings , 2 - Checking )");
        if(userInput.hasNextInt()){
            int numberEntered = userInput.nextInt();
            theTransaction.setAcctToWithdrawalFrom(numberEntered);

        }
        else{
            System.out.println("You Entered an Invalid Option");
        }

    }

    public void amountToWithdrawal(){
        System.out.println("Hoe much do you want to withdrawal");
        System.out.println("Increments of 10 ");
        if(userInput.hasNextInt()){
            int numberEntered = userInput.nextInt();
            theTransaction.setWithdrawalAmt(numberEntered);
            networkOfBankOnATM.requestWithdrawalAmt(theTransaction);

        }
        else {
            System.out.println("You Entered an Invalid Amount ");
        }

    }

    public void getTransactionInfo(){
        System.out.println("Thank you " + theTransaction.getCustomerName() + " for using the XYZ Bank ATM\n");

        System.out.println("Date / Time of Transaction: " + theTransaction.getCurrentDateTime());
        System.out.println("\nTransaction");

        System.out.print("Removed $" + theTransaction.getWithdrawalAmt() + " from your ");

        if(theTransaction.getAcctToWithdrawalFrom() == 1){

            System.out.println("Savings Account.\nYour current balance is " + theTransaction.getAcctBalance());

        } else {

            System.out.println("Checking Account.\nYour current balance is " + theTransaction.getAcctBalance());

        }

    }


    public void isATMCardsBankInNetwork(Card customersATMCard) {
    }
}
