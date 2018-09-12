package models;

import java.util.Date;
import java.io.Serializable;
import java.text.MessageFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medium_bewerten")
public class MediumBewerten implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_bewertung_durch")
	private int idBewertungDurch;
	
	@Column(name="id_medium")
	private int idMedium;
	
	@Column(name="id_ausleiher")
	private int idAusleiher;
	
	@Column(name="id_bewertung")
	private int idBewertung;
	
	@Column(name="bewertungs_datum")
	private Date bewertungsDatum;

	public MediumBewerten() {

	}

	
	
	public int getIdBewertungDurch() {
		return idBewertungDurch;
	}

	public void setIdBewertungDurch(int idBewertungDurch) {
		this.idBewertungDurch = idBewertungDurch;
	}

	public int getIdMedium() {
		return idMedium;
	}

	public void setIdMedium(int idMedium) {
		this.idMedium = idMedium;
	}

	public int getIdAusleiher() {
		return idAusleiher;
	}

	public void setIdAusleiher(int idAuslieher) {
		this.idAusleiher = idAuslieher;
	}

	public int getIdBewertung() {
		return idBewertung;
	}

	public void setIdBewertung(int idBewertung) {
		this.idBewertung = idBewertung;
	}

	public Date getBewertungsDatum() {
		return bewertungsDatum;
	}

	public void setBewertungsDatum(Date bewertungsDatum) {
		this.bewertungsDatum = bewertungsDatum;
	}

	public String toString() {
		return MessageFormat.format("{0}: idBewertungDurch={1}, idMedium={2}, idAusleiher={3}, idbewertung={4}, bewertungsDatum={5}", 
				new Object[] {getClass().getSimpleName(), idBewertungDurch, idMedium, idAusleiher, idBewertung, bewertungsDatum});
	}


	
	
	
}
