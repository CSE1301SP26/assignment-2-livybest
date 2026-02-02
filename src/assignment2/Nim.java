import java.util.Scanner;

public class Nim {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("How many sticks will we start with?");
        int stickstart = in.nextInt();
        int stickpile = stickstart;
        int count = -1;

        while (stickpile > 0){
            
            int i = 1;
            while (i > 0){
                stickstart = stickpile;
                System.out.println("How many sticks will you take?");
                int humsticktake = in.nextInt();
                    if (humsticktake == 1){
                        stickpile = stickpile - 1;
                        i--;
                        count++;
                        System.out.println("Round " + count + ": " + stickstart + " at start, human takes " + humsticktake + " so " + stickpile + " remain.");
                        
                    }
                    else if (humsticktake == 2 && stickpile > 1){
                        stickpile = stickpile - 2;
                        i--;
                        count++;
                        System.out.println("Round " + count + ": " + stickstart + " at start, human takes " + humsticktake + " so " + stickpile + " remain.");
                        
                    }
                    else {
                        System.out.println("That is not an acceptable number of sticks, please pick 1 or 2");
                    }
            }
            if (stickpile != 0){
            //Computer's turn:
            
                double compsticktake = Math.random();
                    if (compsticktake >= 0.5){
                        stickpile = stickpile - 1;
                        int comptake1 = 1;
                        count++;
                        System.out.println("Round " + count + ": " +(stickpile + 1) + " at start, computer takes " + comptake1 + " so " + stickpile + " remain.");
                    }
                    else if (compsticktake < 0.5 && stickpile != 1){
                        stickpile = stickpile - 2;
                        int comptake2 = 2;
                        count++;
                        System.out.println("Round " + count + ": " + (stickpile + 2) + " at start, computer takes " + comptake2 + " so " + stickpile + " remain.");

                    }
        }

            }

            if (count % 2 == 0){
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            }

            






    }

