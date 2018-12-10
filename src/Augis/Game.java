package Augis;

import java.util.ArrayList;
import java.util.List;

import static Augis.Main.newDeck;

public class Game {
    private static Game game;
    private List<Person> players = new ArrayList<>();
    private Deck deck;

    public Game() {
        paruostiZaidima();
        dalintiKortas();
        ejimai();
        nugaletojas();
    }

    public static void main(String[] args) {
        game = new Game();
    }

    private void paruostiZaidima() {
        players.add(new Player());
        players.add(new Dealer());
    }

    private void dalintiKortas() {
        for (Person player : players) {
            newDeck.startingCards(player);
            player.printCards();
        }
    }

    private void ejimai() {
        for (Person player: players) {
            boolean ejimoPabaiga = false;
            while(!ejimoPabaiga) {
                player.printCards();
                boolean trauktiKorta = player.wantToHit();
                if (trauktiKorta) {
                    newDeck.dealCard(player);
                    System.out.println(player.getName() + " trauke korta.\n");
                    if (player.getTotal() > 21) {
                        ejimoPabaiga = true;
                        player.printCards();
                    }
                } else {
                    ejimoPabaiga = true;
                    System.out.println(player.getName() + " pasirinko stoveti.\n");
                }
            }
        }
    }

    private void nugaletojas() {
        int max = 0;
        int top = -1;
        for (int i = 0; i < players.size(); i++) {
            String name = players.get(i).getName();
            int total = players.get(i).getTotal();

            System.out.println(name + " kortu suma yra: " + total + ".");
            if (total > max && total <= 21) {
                max = total;
                top = i;
            }
            if (total == max) {
                top = i;
            }
        }
        if (top == -1) {
            System.out.println("Niekas nelaimejo");
        } else {
            System.out.println(players.get(top).getName() + " laimejo!");
        }
    }
}
