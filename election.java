import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Election {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] names = new String[5];
        int[] votes = new int[5];
        int totalVotes = 0;

        // Input phase
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name " + (i+1) + ":");
            names[i] = br.readLine();
            System.out.println("Enter votes for " + names[i] + ":");
            votes[i] = Integer.parseInt(br.readLine());
            totalVotes += votes[i];
        }

        // Output phase
        System.out.println("Name\tVotes\tPercentage");
        int maxVotesIndex = 0;
        for (int i = 0; i < 5; i++) {
            double percentage = ((double) votes[i] / totalVotes) * 100;
            System.out.printf("%s\t%d\t%.2f%%\n", names[i], votes[i], percentage);
            if (votes[i] > votes[maxVotesIndex]) {
                maxVotesIndex = i;
            }
        }
        
        System.out.println("Winner of the election: " + names[maxVotesIndex]);
    }
}
