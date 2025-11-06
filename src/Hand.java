//Current player's cards
//add cards to a hand, clear out a hand at the beginning

import java.util.ArrayList;

public class Hand {

    //attribute of hand
    private ArrayList<Card> cards;

    //constructor
    public Hand() {
        cards = new ArrayList<Card>(); //creates list of cards
    }

    //reset hand by clearing out list
    public void reset() {
        cards.clear();
    }

    //add card object
    public void add(Card card) {
        cards.add(card);
    }

    //showing players hand
    public String showHand() {
        String hand = "";
        //loop through hand, for every card in hand, add to string
        for (Card c : cards) {
            hand += c.toString() + ", "; //comma between cards
        }
        if (!hand.isEmpty()) hand = hand.substring(0, hand.length() - 2); //removing last comma
        return hand;
    }

    public boolean give(Card card, Hand hand) {
        // if we dont have card
        if (!cards.contains(card)) {
            return false;
        } else {
            //remove card
            cards.remove(card);
            hand.add(card);
            return true;
        }
    }
}
