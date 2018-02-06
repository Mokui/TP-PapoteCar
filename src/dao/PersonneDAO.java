package dao;

import beans.Personne;

public interface PersonneDAO {

	public void insert(Personne p);
	public Personne findByPersonId(int persId);
}
