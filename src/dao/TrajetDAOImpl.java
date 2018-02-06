package dao;

import beans.Ville;
import beans.Voyage;

public class TrajetDAOImpl implements TrajetDAO{

	@Override
	public void addEtape(Ville etape) {
		//this.etapes.add(etape);
	}

	@Override
	public void addVoyage(Voyage ins) {
		//this.inscriptionsVoyage.add(ins);
		//EXAMPLE TODO
//		String sql = "INSERT INTO CUSTOMER " +
//				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
//		Connection conn = null;
//
//		try {
//			conn = dataSource.getConnection();
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setInt(1, customer.getCustId());
//			ps.setString(2, customer.getName());
//			ps.setInt(3, customer.getAge());
//			ps.executeUpdate();
//			ps.close();
//
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {}
//			}
//		}
	}
}
