package beans;

public class Vehicule {

	private int nbPlaces;
	private Personne conducteur;
	private int nbPlacesLibres;

	public Vehicule(Personne c1, int inbPassagersMax) {
		this.nbPlaces = inbPassagersMax;
		this.nbPlacesLibres = 0;
		this.conducteur = c1;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public Personne getConducteur() {
		return conducteur;
	}

	public void setConducteur(Personne conducteur) {
		this.conducteur = conducteur;
	}

	@Override
	public String toString() {
		return "conduit par "+ this.conducteur.getUsername() + " possèdant " + this.nbPlaces + "places";
	}

	public int getNbPlacesLibres() {
		return nbPlacesLibres;
	}

	public int setNbPlacesLibres(int nbPlacesLibres) {
		this.nbPlacesLibres = nbPlacesLibres;
		return nbPlacesLibres;
	}
	
	public void chargement(Personne p2) {
		this.setNbPlacesLibres(this.getNbPlacesLibres() + 1);
	}

	public void dechargement(Personne personne) {
		this.setNbPlacesLibres(this.getNbPlacesLibres() - 1);
	}

}
