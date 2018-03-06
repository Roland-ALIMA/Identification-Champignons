import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Champi {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		Random rand = new Random();
		boolean reponse = false;
		
		List<Integer> listeQuestion = new ArrayList<>();
		listeQuestion.add(2);
		listeQuestion.add(3);
		listeQuestion.add(4);
		
		int numChoisie = rand.nextInt(listeQuestion.size());
		
		int questionChoisie = listeQuestion.get(numChoisie);
		
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");

		switch(questionChoisie) {
		case 2:
			System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
			reponse = clavier.nextBoolean();
			if (!reponse) {
				System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
				reponse = clavier.nextBoolean();
				if (!reponse) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("le cèpe de Bordeaux");
				} else {
					System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
					reponse = clavier.nextBoolean();
					if (!reponse) {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("la girolle");
					} else {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("le pied bleu");
					}
				}
			} else {
				System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
				reponse = clavier.nextBoolean();
				if (!reponse) {
					System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
					reponse = clavier.nextBoolean();
					if (!reponse) {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("le coprin chevelu");
					} else {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("l'agaric jaunissant");
					}
				} else {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'amanite tue-mouches");
				}
			}
			break;
		case 3:
			System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
			reponse = clavier.nextBoolean();
			if (!reponse) {
				System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
				reponse = clavier.nextBoolean();
				if (!reponse) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("le coprin chevelu");
				} else {
					System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
					reponse = clavier.nextBoolean();
					if (!reponse) {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("le cèpe de Bordeaux");
					} else {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("la girolle");
					}
				}
			} else {
				System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
				reponse = clavier.nextBoolean();
				if (!reponse) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'agaric jaunissant");
				} else {
					System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
					reponse = clavier.nextBoolean();
					if (!reponse) {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("le pied bleu");
					} else {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("l'amanite tue-mouches");
					}
				}
			}
			break;
		case 4:
			System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
			reponse = clavier.nextBoolean();
			if (!reponse) {
				System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
				reponse = clavier.nextBoolean();
				if (!reponse) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("le coprin chevelu");
				} else {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'agaric jaunissant");
				}
			} else {
				System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
				reponse = clavier.nextBoolean();
				if (!reponse) {
					System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
					reponse = clavier.nextBoolean();
					if (!reponse) {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("le cèpe de Bordeaux");
					} else {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("la girolle");
					}
				} else {
					System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
					reponse = clavier.nextBoolean();
					if (!reponse) {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("le pied bleu");
					} else {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("l'amanite tue-mouches");
					}
				}
			}
			break;
		}
		
		clavier.close();

	}

}
