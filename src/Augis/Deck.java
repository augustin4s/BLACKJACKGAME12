package Augis;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public ArrayList<Cards> newDeck = new ArrayList<Cards>();

    public void addCards(Cards cardss){
        newDeck.add(cardss);
    }

    public ArrayList<Cards> getNewDeck() {
        return newDeck;
    }

    public void printDeck(){
            for (int i = 0; i < this.newDeck.size(); i++) {
                System.out.println((i + 1) + "." +
                        this.newDeck.get(i).getValue() + " -> " +
                        this.newDeck.get(i).getType() + " -> " +
                        this.newDeck.get(i).getSymbol());
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(newDeck);
    }

    public void dealCard(Person person){
        person.getCard(newDeck.get(0));
        newDeck.remove(0);
        //System.out.println(newDeck.size() + " kiekis");
    }

    public void startingCards(Person person){
        dealCard(person);
        dealCard(person);
    }
}

