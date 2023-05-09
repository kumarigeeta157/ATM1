import java.util.Date;

public class Transaction {
    private int bankID;
    private Date currentDateTime;
    private String customerName;
    private double acctBalance;
    private int withdrawalAmt;
    private int acctNumberUsed;
    private int pin;
    private int stripNumber;
    private int acctToWithdrawalFrom;
    private boolean DidCardVerify;

    public Transaction(int stripNumber) {
    }


    public int getBankID() {
        return bankID;
    }

    public Date getCurrentDateTime() {
        return currentDateTime;
    }


    public void setCurrentDateTime(Date currentDateTime) {
        this.currentDateTime = currentDateTime;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public double getAcctBalance() {
        return acctBalance;
    }

    public int getWithdrawalAmt() {
        return withdrawalAmt;
    }

    public int getAcctNumberUsed() {
        return acctNumberUsed;
    }

    public int getPin() {
        return pin;
    }

    public void setStripNumber(int stripNumber) {
        this.stripNumber = stripNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getStripNumber() {
        return stripNumber;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }

    public void setAcctNumberUsed(int acctNumberUsed) {
        this.acctNumberUsed = acctNumberUsed;
    }

    public void setAcctToWithdrawalFrom(int acctToWithdrawalFrom) {
        this.acctToWithdrawalFrom = acctToWithdrawalFrom;
    }

    public void setDidCardVerify(boolean didCardVerify) {
        DidCardVerify = didCardVerify;
    }

    public void setWithdrawalAmt(int withdrawalAmt) {
        this.withdrawalAmt = withdrawalAmt;
    }

    public int getAcctToWithdrawalFrom() {
        return acctToWithdrawalFrom;
    }

    public boolean getDidCardVerify() {
        return DidCardVerify;
    }

    public void setDidTheCardVerify(boolean cardVerified){
        DidCardVerify = (cardVerified)?true:false;
    }


}
