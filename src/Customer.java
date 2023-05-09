public class Customer {
    private Card customersATMCard;
    Customer(Card newATMCard){

        customersATMCard = newATMCard;
        }
    public Card getATMCard() {

        return customersATMCard;
    }

}
