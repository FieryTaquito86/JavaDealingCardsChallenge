// Card's face value

public class Card {

    //private fields
    //"Suit" represents the enum Suit class, "Rank" represents enum Rank class
    private Suit suit;
    private Rank rank;
    private boolean isFaceUp;

    //constructor that gives rank and suit
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        isFaceUp = true; //cards start face down (you don't know what dealer has)
    }

    //public methods
    public String getSuit() {
        return suit.printSuit();
    }

    public int getRank() {
        return rank.getRankValue();
    }

    //making a string to use in main summary
    //only show the string if isFaceUp is true
    //if isFaceUp is false, the card is face down, you cannot see the cards
    @Override
    public String toString() {
        //instead of creating a string and usual if statement
        // this line evalueates isFaceUp, if true, excecute and returns what comes after ?
        // if false, java returns what comes after :
        return isFaceUp ? rank.printRank() + " of " + suit.printSuit() : "Face Down";
    }
}