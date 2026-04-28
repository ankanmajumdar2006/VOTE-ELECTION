import java.util.Scanner;

public class vote {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int totalVoters = 10;

    // Party codes and names
    int[] codes = {11, 21, 31, 41, 51};
    String[] parties = {"~AM", "+RT", "#LK", "$EP", "@FW"};
    int[] votes = new int[5];

    System.out.println("AREA: NETAJI COLONY");
    System.out.println("Total Voters: " + totalVoters);

    System.out.println("Party Codes:");
    for (int i = 0; i < codes.length; i++) {
      System.out.println(codes[i] + " for " + parties[i]);
    }

    System.out.println("\n--- Start Voting ---");

    for (int i = 1; i <= totalVoters; i++) {
      System.out.print("Voter " + i + ", enter your vote: ");
      int input = in.nextInt();

      boolean valid = false;

      for (int j = 0; j < codes.length; j++) {
        if (input == codes[j]) {
          votes[j]++;
          valid = true;
          break;
        }
      }

      if (!valid) {
        System.out.println("Invalid vote! Try again.");
        i--; // repeat same voter
      }
    }

    // Display results
    System.out.println("\n--- Results ---");
    int maxVotes = -1;
    int winnerIndex = -1;

    for (int i = 0; i < votes.length; i++) {
      System.out.println(parties[i] + ": " + votes[i]);

      if (votes[i] > maxVotes) {
        maxVotes = votes[i];
        winnerIndex = i;
      }
    }

    // Winner
    System.out.println("\nWinner: " + parties[winnerIndex] + " with " +
                       maxVotes + " votes");

    in.close();
  }
}