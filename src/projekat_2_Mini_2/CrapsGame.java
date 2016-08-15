package projekat_2_Mini_2;

import java.util.Scanner;

public class CrapsGame {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// petlja radi dok korisnik zeli da igra, sve dok ne unese "n"
		while (true) {
			System.out.println("Let's play Craps!");
			System.out.println("Press [Enter] to roll the dice!");
			input.nextLine();
			// poziv metode @roll() koja simulira bacanje kocke
			int rollTotal = roll();
			// provjera da li je korisnik pobjedio
			if (rollTotal == 7 || rollTotal == 11) {
				System.out.println("You won!");
				// ukoliko nije, provjera da li je korisnik izgubio
			} else if (rollTotal == 2 || rollTotal == 3 || rollTotal == 12) {
				System.out.println("You lose!");
				// ukoliko nije pobjedio niti izgubio, baca opet
			} else {
				int point = rollTotal;
				boolean keepPlaying = true;
				// korisnik ce bacati opet sve dok ne baci isti broj ili dok ne
				// dobije 7, tj izgubi
				while (keepPlaying) {
					System.out.println("Press [Enter] to roll the dice!");
					input.nextLine();
					rollTotal = roll();
					if (rollTotal == point) {
						System.out.println("You matched your point. You win!");
						keepPlaying = false;
					} else if (rollTotal == 7) {
						System.out.println("You rolled a 7. You lose!");
						keepPlaying = false;
					}
				}

			}
			System.out.println("Want to play again? (y/n)");
			String playAgain = input.nextLine();
			if (playAgain.equals("")) {

			} else if (playAgain.substring(0, 1).equals("n")) {
				break;
			}
		}
		input.close();
		System.out.println("Thanks for playing!");

	}

	public static int roll() {

		int roll1 = (int) (Math.random() * 6 + 1);
		int roll2 = (int) (Math.random() * 6 + 1);
		int rollTotal = roll1 + roll2;
		System.out.println("You rolled a " + roll1 + " and a " + roll2
				+ " for a total of " + rollTotal);

		return rollTotal;
	}
}
