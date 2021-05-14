package view;

import java.util.Scanner;

public class GameStart {

    public static void start() {

        System.out.println("1) Create Game");
        System.out.println("2) Join Multiplayer Game");
        System.out.println("3) Exit Game");

        Scanner scan = new Scanner(System.in);
        boolean isValid = true;
        String entry = scan.nextLine();
        int option = 0;
            if (entry.chars().allMatch(Character::isDigit) && !entry.equals("")) {
                option = Integer.parseInt(entry);
            } else {
                System.out.println("The option is invalid");
                isValid = false;
            }
        while(isValid) {
            switch (option) {
                case 1:
                    System.out.println("Game Created");
                    isValid = false;
                    break;
                case 2:
                    System.out.println("Enter Host Ip");
                    isValid = false;
                    break;
                case 3:
                    System.out.println("Exiting Game...");
                    isValid = false;
                    break;
                default :
                    System.out.println("Wrong Option");
                    entry = scan.nextLine();
                    if (entry.chars().allMatch(Character::isDigit) && !entry.equals("")) {
                        option = Integer.parseInt(entry);
                    } else {
                        System.out.println("The option is invalid");
                        isValid = false;
                    }
            }
        }


    }
}


