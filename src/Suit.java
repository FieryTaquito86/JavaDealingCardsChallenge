//Seperating Suit for neatness
//Suit can be Hearts, Diamonds, Spades, or Clubs

public enum Suit {
//GIVING IT A STRING VALUE SO I CAN USE IT IN SUMMARY
//Ex: APPLES("Apples") where "Apples" is the string value of APPLES
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    CLUBS("Clubs");

    //final - constant that is NOT allowed to change during program running
    private final String suitText;

    //constructor that converts suitText to string to later use in the public printSuit
    private Suit(String suitText) {
        this.suitText = suitText;
    }

    //making a public method for Card to use
    public String printSuit() {
        return suitText;
    }
}
