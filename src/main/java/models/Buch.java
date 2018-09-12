package models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.text.MessageFormat;

/**
 * 
 * @author ellyn
 *
 * Klasse zum Erstellen und Verwalten der Buecher
 */

@Entity
@Table(name="buch")

public class Buch extends Media implements Serializable{

	@Column(name="autor")
	protected String autor;
	@Column(name="verlag")
	protected String verlag;
	
	public Buch() {
		super();
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getVerlag() {
		return verlag;
	}


	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}


	public String toString() {
		return MessageFormat.format("{0}: autor={1}, verlag={2}", 
				new Object[] {getClass().getSimpleName(), autor, verlag});
	}
	
	



}
