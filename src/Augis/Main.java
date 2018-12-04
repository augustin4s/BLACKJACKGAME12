package Augis;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Deck newDeck = new Deck();
    private static Game game;
    public static Cards newCard = Cards.createCard(0,"test", "test");

    public static void main(String[] args) {
        fillDeckWithCards();
        game = new Game();
    }


    private static void fillDeckWithCards() {
        FromFile f = new FromFile();
        f.openFile();
        f.readFiles();
        f.closeFile();
        newDeck.shuffleDeck();
        //newDeck.printDeck();
    }
}