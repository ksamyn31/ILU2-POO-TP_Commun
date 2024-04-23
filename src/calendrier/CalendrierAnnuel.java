package calendrier;


public class CalendrierAnnuel {
	
	public class Mois {
	    private String nom;
	    private boolean[] jours;

	    public Mois(String nom, int nombreJours) {
	        this.nom = nom;
	        this.jours = new boolean[nombreJours];
	    }

	    public boolean estLibre(int jour) {
	        return !jours[jour - 1];
	    }

	    public void reserver(int jour) {
	        if (!estLibre(jour - 1)) {
	            throw new IllegalStateException("Ce jour est déjà réservé.");
	        }
	        jours[jour - 1] = true;
	    }
	}

	public class Calendrier {
	    private Mois[] calendrier;

	    public Calendrier() {
	        calendrier = new Mois[12];
	        calendrier[0] = new Mois("Janvier", 31);
	        calendrier[1] = new Mois("Février", 28);
	        calendrier[2] = new Mois("Mars", 31);
	        calendrier[3] = new Mois("Avril", 30);
	        calendrier[4] = new Mois("Mai", 31);
	        calendrier[5] = new Mois("Juin", 30);
	        calendrier[6] = new Mois("Juillet", 31);
	        calendrier[7] = new Mois("Août", 31);
	        calendrier[8] = new Mois("Septembre", 30);
	        calendrier[9] = new Mois("Octobre", 31);
	        calendrier[10] = new Mois("Novembre", 30);
	        calendrier[11] = new Mois("Décembre", 31);
	    }
	    
	}

}