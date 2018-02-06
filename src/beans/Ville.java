package beans;

public class Ville {

	private String nomVille; 
	
	public Ville(String name) {
		super();
		this.nomVille = name;
	}

	public Ville() {}

	public void setName(String string) {
		this.nomVille = string;
	}
	
	public String getName()
	{
		return nomVille;
	}

	@Override
	public String toString() {
		return nomVille;
	}
}
