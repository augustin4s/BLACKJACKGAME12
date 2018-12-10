package Augis;

import java.util.ArrayList;

public abstract class Person {
    public ArrayList<Cards> hand;
    public int total;
    public String name;
    public Person() {
        hand = new ArrayList<Cards>();
        this.total = 0;
    }

    public Cards getCard(Cards card){
        this.hand.add(card);
        total += card.getValue();
        return card;
    }

    public String getName(){
        return name;
    }

    public abstract boolean wantToHit();

    public int getTotal(){
        return total;
    }

    public void printCards(){
        System.out.print(name + " kortos yra: \n");
        for(int i=0; i<hand.size(); i++){
            System.out.println(hand.get(i).getType() + ", " + hand.get(i).getValue());
        }
        System.out.println();
    }
}
