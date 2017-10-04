/*
 * David Lapierre - Code your dreams
 */
package fr.tripplanner.librairies.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class PI.
 */
public class PI extends BaseBeanSync implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private long id;

	/** The nom. */
	private String nom;

	/** The lieu. */
	private String lieu;

	/** The heure. */
	private Date heure;

	/** The etape. */
	private Etape etape;

	/**
	 * Instantiates a new pi.
	 */
	public PI() {
		super();
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom
	 *            the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Gets the lieu.
	 *
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}

	/**
	 * Sets the lieu.
	 *
	 * @param lieu
	 *            the new lieu
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	/**
	 * Gets the heure.
	 *
	 * @return the heure
	 */
	public Date getHeure() {
		return heure;
	}

	/**
	 * Sets the heure.
	 *
	 * @param heure
	 *            the new heure
	 */
	public void setHeure(Date heure) {
		this.heure = heure;
	}

	/**
	 * Gets the etape.
	 *
	 * @return the etape
	 */
	public Etape getEtape() {
		return etape;
	}

	/**
	 * Sets the etape.
	 *
	 * @param etape
	 *            the new etape
	 */
	public void setEtape(Etape etape) {
		this.etape = etape;
	}

}
