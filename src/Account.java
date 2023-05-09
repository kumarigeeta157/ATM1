public class Account {
    private int bankID;
    private int acctNumber;
    private String customerName;
    private String acctType;
    private Double acctBalance;
    private int pin;
    private int stripNumber;
    static int accountNumberIncrementor =100000;

    public Account(int bankID, String customerName, String acctType, int pin, int stripNumber) {
        this.bankID = bankID;
        this.acctNumber = acctNumber;
        this.customerName = customerName;
        this.acctType = acctType;
        this.acctBalance = acctBalance;
        this.pin = pin;
        this.stripNumber = generateStripNumber(bankID);
        this.acctNumber = generateAccountNumber(stripNumber, acctType );

    }

    public int getBankID() {
        return bankID;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAcctType() {
        return acctType;
    }

    public Double getAcctBalance() {
        return acctBalance;
    }

    public int getPin() {
        return pin;
    }

    public int getStripNumber() {
        return stripNumber;
    }

    public int generateStripNumber(int bankID){
        accountNumberIncrementor++;
        int newStripNumber = (bankID * 1000000) + accountNumberIncrementor;
        return newStripNumber;
    }
    public int generateAccountNumber(int stripNumber, String acctType){
        if((acctType.startsWith("s")) || (acctType.startsWith("S"))){
            acctNumber = (stripNumber * 10) + 1;
        } else {
            acctNumber = (stripNumber * 10) + 2;
        }

        return acctNumber;
    }




}
