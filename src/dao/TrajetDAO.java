package dao;

import beans.Ville;
import beans.Voyage;

public interface TrajetDAO {
	
	public void addEtape(Ville etape);
	public void addVoyage(Voyage v);
}
