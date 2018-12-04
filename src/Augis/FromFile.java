package Augis;

        import java.io.File;
        import java.util.Scanner;

        import static Augis.Main.newDeck;

public class FromFile {
    public Scanner x;
    public int value;
    public String type;
    public String symbol;

    public void openFile(){
        try{
            x = new Scanner(new File("C:\\Users\\Augis\\Augio\\BLACKJACKGAME\\src\\Augis\\Kortos.txt"));
        }
        catch (Exception e){
            System.out.println("Failas nerastas");
        }
    }

    public void readFiles(){
        while(x.hasNext()){
            value = x.nextInt();
            type = x.next();
            symbol = x.next();
            Cards newCard = Cards.createCard(value, type, symbol);
            newDeck.addCards(newCard);

        }
    }

    public void closeFile(){
        x.close();
    }
}