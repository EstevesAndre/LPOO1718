import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Totoloto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Number of bets: ");
		Scanner s = new Scanner(System.in); // scans the number of bets
		
		int numBets = 0;
		
		while(s.hasNext()) {
			if(s.hasNextInt()) {
				numBets = s.nextInt();
				break;
			}
			else {
				System.out.print("Number of bets(again): ");
				s = new Scanner(System.in);
			}
		}
		s.close();

		int bets[][] = new int[numBets][6];

		for(int i = 0; i < bets.length; i++) {
			while(!verifyBet(bets[i])) {
				createBet(bets[i]);
			}
		}

		System.out.println("\n-------------------------------");
		
		for(int x = 0; x < bets.length; x++) {
			Arrays.sort(bets[x]);		// sort array
			System.out.print("Bet " + (x + 1) + ": ");

			for(int n: bets[x]) {
				System.out.print(n + "  ");
			}
			System.out.println("\n-------------------------------");
		}

	}

	public static void createBet(int[] bet) { // creates the bet, 6 numbers
		Random rn = new Random();

		for(int i = 0; i < 6; i++) { 
			int num = rn.nextInt(49)+1;
			bet[i] = num;
		}
	}

	public static boolean verifyBet(int[] bet) { // verifies if the bet has no repeated numbers

		for(int i = 0; i < bet.length; i++) { 
			int aux = bet[i];
			for(int j = i + 1; j < bet.length; j++) {
				if (aux == bet[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
