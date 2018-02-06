import beans.Personne;
import beans.Trajet;
import beans.Vehicule;
import beans.Ville;
import beans.Voyage;

public class Application {

	public static void main(String[] args) {
		Ville dep = new Ville(), arriv = new Ville(), etape = new Ville(), 
				etape2 = new Ville(), etape3 = new Ville(), etape4 = new Ville();
		dep.setName("Paris");
		arriv.setName("Nantes");
		etape.setName("Rennes");
		etape2.setName("Le Mans");
		etape3.setName("Angers");
		etape4.setName("Babylone");
		
		
		Personne c1 = new Personne("Marc"),p2 = new Personne("Joseph");
		
		Vehicule veh = new Vehicule(c1,5);
		
		Trajet t1 = new Trajet(dep,arriv,veh);
		Voyage ins = new Voyage(etape,etape2,p2);
		
		t1.addEtape(etape);
		t1.addEtape(etape2);
		t1.addEtape(etape3);
		
		//si possible 
		t1.addVoyage(ins);
		
		t1.supprEtape(etape2);
		
		System.out.println(t1);
		
		
	}
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//
//			String url = "jdbc:mysql://localhost:3306/papotecar?autoReconnect=true&useSSL=false";
//			String user = "root";
//			String passwd = "root";
//
//			Connection conn = DriverManager.getConnection(url, user, passwd);
//
//			//Création d'un objet Statement
//			Statement state = conn.createStatement();
//			//L'objet ResultSet contient le résultat de la requête SQL
//			ResultSet result = state.executeQuery("SELECT * FROM personne");
//			//On récupère les MetaData
//			ResultSetMetaData resultMeta = result.getMetaData();
//
//			System.out.println("\n**************************************************************");
//			//On affiche le nom des colonnes
//			for(int i = 1; i <= resultMeta.getColumnCount(); i++)
//				System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
//
//			System.out.println("\n**************************************************************");
//
//			while(result.next()){         
//				for(int i = 1; i <= resultMeta.getColumnCount(); i++)
//					if(!result.getObject(i).toString().isEmpty()) {
//						System.out.print("\t" + result.getObject(i).toString() + "\t |");
//					}
//					else
//					{
//						System.out.print("|");
//					}
//				System.out.println("\n---------------------------------");
//			}
//
//			result.close();
//			state.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}      
//	}
}
