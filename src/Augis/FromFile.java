package Augis;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

        import static Augis.Main.newDeck;

public class FromFile {
    private Scanner x;
    private int value;
    private String type;
    private String symbol;

    public void openReadClose(){
        x = null;
        try{
            x = new Scanner(new File("C:\\Users\\Augis\\Augio\\BLACKJACKGAME\\src\\Augis\\Kortos.txt"));
            while(x.hasNext()){
                value = x.nextInt();
                type = x.next();
                symbol = x.next();
                Cards newCard = Cards.createCard(value, type, symbol);
                newDeck.addCards(newCard); }
        }
        catch (Exception e){
            System.out.println("Failas nerastas");
        }
        finally {
            if(x != null){
                try{
                    x.close();
                } catch (Exception e){
                    System.out.println("Nepavyko sekmingai uzdaryti failo");
                }
            }
            System.out.println("Failas nuskaitytas sekmingai");
        }
    }
}