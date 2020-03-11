import java.util.Scanner;

public class Démarrage {
	public static void main(String[] args) {
		jeuNiOuiNiNon();
	}

	public static listeQuestion listeQuestion;

	private static void jeuNiOuiNiNon() {
		listeQuestion listeQuestion = new listeQuestion();
		int nombreReponseBonne = 0;
		String reponse = new String();
		int index = (int) (Math.random() * 10);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ni oui, Ni non\n\n");
		while (!reponse.equals("Oui") && !reponse.equals("oui") && !reponse.equals("non") && !reponse.equals("Non")) {
			if (nombreReponseBonne == 0) {
				nombreReponseBonne += 1;
				System.out.println(
						"Le but du jeu est de répondre aux questions posées, sans écrire les mots \"oui\" ou \"non\"\n");
				System.out.println("Question n°" + nombreReponseBonne + "\n");
				System.out.println(listeQuestion.get());
				reponse = sc.nextLine();
			} else {
				nombreReponseBonne += 1;
				System.out.println();
				System.out.println("Question n°" + nombreReponseBonne + "\n");
				System.out.println(listeQuestion.get());
				reponse = sc.nextLine();
			}
		}
		System.out.println("Perdu, vous avez répondu: \"" + reponse + "\" à la question.\n Votre score est de "
				+ nombreReponseBonne + " points.");
		reponse = null;
		nombreReponseBonne = 0;
	}
}