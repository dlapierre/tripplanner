/*
 * David Lapierre - Code your dreams
 */
package fr.tripplanner.librairies.beans;

import java.io.Serializable;

/**
 * The Class Voyage.
 */
public class Voyage extends BaseBeanSync implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private long id;

	/** The nom. */
	private String nom;

	/** The etapes. */
	private Etape[] etapes;

	/**
	 * Instantiates a new voyage.
	 */
	public Voyage() {
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
	 * Gets the etapes.
	 *
	 * @return the etapes
	 */
	public Etape[] getEtapes() {
		return etapes;
	}

	/**
	 * Sets the etapes.
	 *
	 * @param etapes
	 *            the new etapes
	 */
	public void setEtapes(Etape[] etapes) {
		this.etapes = etapes;
	}

}
