package Augis;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Person{
    private Scanner scanner;
    public Player() {
        name = "Zaidejas";
        scanner = new Scanner(System.in);
    }

    public boolean wantToHit() {
        System.out.print("\nPasirinkite norima veiksma (0 - Traukti korta, 1 - Stoveti) \n");
        System.out.print("\nJusu pasirinktas veiksmas: ");
        while (true) {
                String action = scanner.nextLine();
                switch(action){
                    case "0":
                        return true;
                    case "1":
                        return false;
                        default:
                            System.out.println("Nera tokio veiksmo");
                            System.out.print("\nPasirinkite norima veiksma (0 - Traukti korta, 1 - Stoveti) \n");
                            System.out.print("\nJusu pasirinktas veiksmas: ");
                            break;
                }
            }

        }
    }
