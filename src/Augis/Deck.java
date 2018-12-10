package Augis;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public ArrayList<Cards> newDeck = new ArrayList<Cards>();

    public void addCards(Cards cardss){
        newDeck.add(cardss);
    }

    public void shuffleDeck(){
        Collections.shuffle(newDeck);
    }

    public void dealCard(Person person){
        person.getCard(newDeck.get(0));
        newDeck.remove(0);
    }

    public void startingCards(Person person){
        dealCard(person);
        dealCard(person);
    }
}

