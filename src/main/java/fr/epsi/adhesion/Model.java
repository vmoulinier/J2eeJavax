package fr.epsi.adhesion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class Model {

	private DataSource dataSource;
	
	public Model(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void setUser(Adhesion utilisateur) {
		try (Connection connection = this.dataSource.getConnection()) {
			String email = utilisateur.getEmail();
			String mdp = utilisateur.getMotDePasse();
			java.util.Date date = utilisateur.getDateAdhesion();
			
			java.sql.PreparedStatement stmt = connection.prepareStatement("INSERT INTO Adherent (email, motDePasse, dateAdhesion) values (?, ?, ?)");
			stmt.setString(1, email);
			stmt.setString(2, mdp);
			stmt.setDate(3, (Date) date);
			stmt.executeUpdate();
			stmt.close();
			connection.close();
			
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}
	
	public ArrayList<Adhesion> getUsers() {
		ArrayList<Adhesion> users = new ArrayList<Adhesion>();
		try (Connection connection = this.dataSource.getConnection()) {
			java.sql.ResultSet stmt = connection.createStatement().executeQuery("SELECT * FROM Adherent");
			  while (stmt.next()) {
			      String email = stmt.getString("email");
			      java.sql.Date date = stmt.getDate("dateAdhesion");
			      Adhesion user = new Adhesion();
			      user.setEmail(email);
			      user.setDateAdhesion(date);
			      users.add(user);		   
			    }
			  stmt.close();
			  connection.close();
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
		return users;
	}
}
