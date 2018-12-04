package Augis;

import java.util.ArrayList;

public class Dealer extends Person{
    public Dealer() {
        name = "Dealeris";
    }

    public boolean wantToHit(){
        int softCap = 16;
        if(total < softCap) return true;
        if(total > softCap) return false;
        return false;
    }

    @Override
    public void printCards() {
        System.out.print(name + " kortos yra: \n");
        Cards cardd = hand.get(0);
        System.out.println(cardd.getType() + ", " + cardd.getValue());
        System.out.println("Ir paslepta korta");
        System.out.println();
    }
}
