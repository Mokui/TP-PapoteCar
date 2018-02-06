package beans;
public class Voyage {

	private Ville villeDep;
	private Ville villeArrive;
	private Personne personne;

	public Voyage(Ville dep, Ville etape, Personne p2) {
		this.villeDep = dep;
		this.villeArrive = etape;
		this.personne = p2;
	}

	public Ville getVilleDep() {
		return villeDep;
	}

	public void setVilleDep(Ville villeDep) {
		this.villeDep = villeDep;
	}

	public Ville getVilleArrive() {
		return villeArrive;
	}

	public void setVilleArrive(Ville villeArrive) {
		this.villeArrive = villeArrive;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Voyage [villeDep=" + villeDep + ", villeEtape=" + villeArrive + ", personne=" + personne + "]";
	}
}
