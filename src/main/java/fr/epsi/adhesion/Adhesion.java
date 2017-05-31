package fr.epsi.adhesion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Adhesion {

	private String email;
	private String motDePasse;
	private boolean conditionsAcceptees;
	private Date dateAdhesion;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public boolean isConditionsAcceptees() {
		return conditionsAcceptees;
	}

	public void setConditionsAcceptees(boolean conditionsAcceptees) {
		this.conditionsAcceptees = conditionsAcceptees;
	}

	public Date getDateAdhesion() {
		return dateAdhesion;
	}

	public void setDateAdhesion(Date dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}

	public void valider(String confirmationMotDePasse) throws ValidationException {
		List<String> raisons = new ArrayList<>();
		
		if (this.email == null || "".equals(this.email)) {
			raisons.add("adhesion.email.vide");
		}
		else if (! this.email.contains("@")) {
			raisons.add("adhesion.email.invalide");
		}

		if (this.motDePasse == null || this.motDePasse.length() < 8) {
			raisons.add("adhesion.motDePasse.tropCourt");
		}
		
		if (confirmationMotDePasse == null || ! confirmationMotDePasse.equals(this.motDePasse)) {
			raisons.add("adhesion.motDePasse.confirmationIncorrecte");
		}

		if (! this.conditionsAcceptees) {
			raisons.add("adhesion.conditionsNonAcceptees");
		}
		
		if (! raisons.isEmpty()) {
			throw new ValidationException(raisons);
		}
		
		this.dateAdhesion = new java.sql.Date(System.currentTimeMillis());
	}

}
