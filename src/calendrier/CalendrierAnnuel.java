package calendrier;

public class CalendrierAnnuel {
	CalendrierAnnuel[] calendrier;
	public CalendrierAnnuel() {
		CalendrierAnnuel calendrier = new CalendrierAnnuel();
			mois("Janvier",31);
			mois("Fevrier",28);
			mois("Mars",31);
			mois("Avril",30);
			mois("Mai",31);
			mois("Juin",30);
			mois("Juillet",31);
			mois("Août",31);
			mois("Septembre",30);
			mois("Octobre",31);
			mois("Novembre",30);
			mois("Décembre",31);
			
	}
	
	
	public class Mois {
		String nom;
		boolean jour;
		
		public Mois(String nom, int nbJours) {
			
		}
		
		private boolean estLibre(int jour) {
			return true;
		}
		
		private void reserver(int jour) {
			
		}
	
	
	}
}
