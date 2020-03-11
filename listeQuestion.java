import java.util.ArrayList;
import java.util.List;

public class listeQuestion {
	
	
	List<String> questions = new ArrayList<String>();
	
		public listeQuestion() {
			questions.add("Comment allez vous ?");
			questions.add("Le mot \"Nez-nue-phare\" vous évoque-t'il quelque chose ?");
			questions.add("Avez vous des cheveux ?");
			questions.add("Comprennez vous mes questions ?");
			questions.add("A quoi joue-t'on ?");
			questions.add("Manger sain, c'est bon pour la santé ?");
			questions.add("Manger gras, c'est bon ?");
			questions.add("Aimez vous la nature ?");
			questions.add("Oui ou non ?");
	}

		public String get() {
			int indexAleatoire = 0 + (int)(Math.random() *8);
			return this.questions.get(indexAleatoire);
			}
}