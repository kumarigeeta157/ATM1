public class Card {
    private int pin;
    private int stripNumber;
    Card(int stripNumber){
        this.stripNumber = stripNumber;

    }
    Card(int pin , int stripNumber){
        this.pin = pin;
        this.stripNumber = stripNumber;

    }
    public int getPin() {
        return pin;
    }

    public int getStripNumber() {
        return stripNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setStripNumber(int stripNumber) {
        this.stripNumber = stripNumber;
    }
}
