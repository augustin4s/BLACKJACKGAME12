package Augis;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Deck newDeck = new Deck();
    private static Game game;
    private static Cards newCard;

    public static void main(String[] args) {
        fillDeckWithCards();
        game = new Game();
    }

    private static void fillDeckWithCards() {
        FromFile f = new FromFile();
        f.openReadClose();
        newDeck.shuffleDeck();
    }
}