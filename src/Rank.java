//Ranks are Ace, King, Queen, Jack or value from 2-10

public enum Rank {
    ACE(1, "Ace"), TWO(2, "Two"), THREE(3, "Three"), FOUR(4, "Four"),
    FIVE(5, "Five"), SIX(6, "Six"), SEVEN(7, "Seven"), EIGHT(8, "Eight"),
    NINE(9, "Nine"), TEN(10, "Ten"), JACK(10, "Jack"), QUEEN(10, "Queen"),
    KING(10, "King");

    //private field
    private final int rankValue;
    private final String rankName;

    //constructor
    private Rank(int rankValue, String rankName) {
        //this.rankValue refering to ACE(1), TWO(2) etc.
        this.rankValue = rankValue;
        this.rankName = rankName;
    }

    //public method so Card can use it
    public int getRankValue() {
        return rankValue;
    }

    public String printRank() {
        return rankName;
    }
}
