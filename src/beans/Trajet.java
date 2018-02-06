package beans;

import java.util.ArrayList;
import java.util.Date;

public class Trajet {

	private int idTrajet;
	private Ville villeDepart;
	private Ville villeArrive;
	private ArrayList<Ville> etapes = new ArrayList<>();
	private ArrayList<Voyage> inscriptionsVoyage = new ArrayList<>();
	private Date dateDepart;
	private int nbHeuresTrajet;
	private ArrayList<Personne> listePassagers = new ArrayList<>();
	private Vehicule voitureConcernee;

	public Trajet(Ville dep, Ville arriv, Vehicule veh) {
		this.villeDepart = dep;
		this.villeArrive = arriv;
		this.voitureConcernee = veh;
		this.etapes.add(villeDepart);
	}
	public int getIdTrajet() {
		return idTrajet;
	}
	public void setIdTrajet(int idTrajet) {
		this.idTrajet = idTrajet;
	}
	public Ville getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(Ville villeDepart) {
		this.villeDepart = villeDepart;
	}
	public Ville getVilleArrive() {
		return villeArrive;
	}
	public void setVilleArrive(Ville villeArrive) {
		this.villeArrive = villeArrive;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public int getNbHeuresTrajet() {
		return nbHeuresTrajet;
	}
	public void setNbHeuresTrajet(int nbHeuresTrajet) {
		this.nbHeuresTrajet = nbHeuresTrajet;
	}
	public Vehicule getVoitureConcernee() {
		return voitureConcernee;
	}
	public void setVoitureConcernee(Vehicule voitureConcernee) {
		this.voitureConcernee = voitureConcernee;
	}
	public ArrayList<Ville> getEtapes() {
		return etapes;
	}
	public void setEtapes(ArrayList<Ville> etapes) {
		this.etapes = etapes;
	}
	@Override
	public String toString() {
		String explications =  "Trajet partant de " + villeDepart + " à " + villeArrive
				+ ", avec un véhicule " + voitureConcernee + "\n Et avec comme étapes : \n ";
		for (Ville ville : this.etapes) {
			explications += "\n =================== \n";

			explications += " - "+ville + " \n";

			for (Voyage voyage : inscriptionsVoyage) {
				if((voyage.getVilleDep() == ville) && 
						!(this.listePassagers.size()>=this.voitureConcernee.getNbPlaces()) 
						)
				{
					this.listePassagers.add(voyage.getPersonne());
					this.voitureConcernee.chargement(voyage.getPersonne());
					explications += (voyage.getPersonne()+" monte dans le véhicule \n");
				}
				if(voyage.getVilleArrive() == ville && this.listePassagers.size()>0){

					this.listePassagers.remove(voyage.getPersonne());
					this.voitureConcernee.dechargement(voyage.getPersonne());
					explications += (voyage.getPersonne()+" descends du véhicule \n");
				}
			}

			explications += "("+ this.voitureConcernee.getNbPlacesLibres() 
			+ " place(s) sur "+ this.voitureConcernee.getNbPlaces()+"max)";

		}
		return explications;
	}

	public void addEtape(Ville etape) {
		this.etapes.add(etape);
	}

	public void addVoyage(Voyage ins) {
		this.inscriptionsVoyage.add(ins);
	}

	public void modifEtape(Ville etape2, Ville etape4) {
		for (Ville ville : this.etapes) {
			if(etape2.getName().equals(ville.getName())) {
				etape2.setName(etape4.getName());
			}
		}
	}

	public void supprEtape(Ville etape) {
		this.etapes.remove(etape);

		ArrayList<Voyage> newVoyageList = new ArrayList<>();
		//for all passengers
		for (Voyage voy : inscriptionsVoyage) {
			if(isCompatible(voy)) { 
				newVoyageList.add(voy);
			}
		}
		
		this.inscriptionsVoyage = newVoyageList;
	}

	public boolean isCompatible(Voyage v)
	{
		boolean checkDep = false;
		boolean checkArriv = false;

		//villes (depart+arrive) de voyage de passager est dans les etapes
		for (Voyage voyage : inscriptionsVoyage) {
			if(voyage.getVilleDep().equals(v))
			{
				checkDep = true;
			}
			if(voyage.getVilleArrive().equals(v))
			{
				return true;
			}

			if(checkDep && (this.getVilleArrive() == v.getVilleArrive()))
			{
				return true;
			}
		}

		return false;
	}
}
