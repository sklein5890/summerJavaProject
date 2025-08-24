import java.util.Scanner;

public class RollGame {
    public static void main(String[] args) {
        RollGame main = new RollGame();
    }
/* ROLL OFF:
You and bot roll 2d6 na the higher total wins
 */
    public RollGame(){
        System.out.println("Welcome to Roll Off \nYou and bot roll 2d6 and the higher total wins");
        start();
    }

    private int randomD6(){
        return (int)((Math.random()* 6)+1);
    }

    private void Game(){
        int pRoll1 = randomD6();
        int pRoll2 = randomD6();
        int pTotal = pRoll1 + pRoll2;
        System.out.println("You rolled " + pRoll1 + " and " + pRoll2 + " for a TOTAL of "+ pTotal);
        int bRoll1 = randomD6();
        int bRoll2 = randomD6();
        int bTotal = bRoll1 + bRoll2;
        System.out.println("Bot rolled " + bRoll1 + " and " + bRoll2 + " for a TOTAL of "+ bTotal);

        if (pTotal > bTotal){
            System.out.println("You win!");
        } else if (pTotal < bTotal) {
            System.out.println("You lose!");
        }
        else{
            System.out.println("you Tied");
        }
        System.out.println("Do you want ot play again? (Y)es or (N)o: ");
        Scanner sc = new Scanner(System.in);
        String replayChoice = sc.nextLine();
        if (replayChoice.equals("Y")){start();}
        else  if (replayChoice.equals("N")){
            System.out.println("Goodbye!");
        }
    }

    private void start(){
        System.out.println("Enter 'Roll' to start: ");
        Scanner input = new Scanner(System.in);
        String startMsg = input.nextLine();
        if(startMsg.equals("Roll")){
            Game();
        }
        else{
            start();
        }
    }




}