import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        boolean done = false;

        do {
            System.out.println("Enter a move for A");
            playerA = in.nextLine();
            // Check for three conditions R, P, or S
            if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {

            }

            System.out.println("Enter a move for B");
            playerB = in.nextLine();
            // check for three conditions R, P, or S
            if (playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S") || playerB.equalsIgnoreCase("R")) {

            }
            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("It's a tie");

            }else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors! Player A wins!");

            }else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock! Player A wins!");

            }else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissor cuts Paper! Player A wins!");

            }else if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors! Player B wins!");

            }else if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock! Player B wins!");

            }else if (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper! Player B wins!");

            }
            else
                System.out.println("Your input is incorrect, try again.");

                System.out.println("Play again? (Y/N)");
                String again = in.nextLine();

                if (!again.equalsIgnoreCase("Y")) {
                    done = true;
                }

            }
            while (!done) ;

    }
}

