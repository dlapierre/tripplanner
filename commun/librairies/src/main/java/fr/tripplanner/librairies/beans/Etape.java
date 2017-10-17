/*
 * David Lapierre - Code your dreams
 */
package fr.tripplanner.librairies.beans;

import java.io.Serializable;

/**
 * The Class Etape.
 */
public class Etape extends BaseBeanSync implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private long id;

	/** The nom. */
	private String nom;

	/** The lieu debut. */
	private String lieuDebut;

	/** The lieu arrivee. */
	private String lieuArrivee;
	
	/** The duree. */
	private int duree;

	/** The voyage. */
	private Voyage voyage;

	/** The points interets. */
	private PI[] pointsInterets;

	/**
	 * Instantiates a new etape.
	 */
	public Etape() {
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
	 * Gets the lieu debut.
	 *
	 * @return the lieu debut
	 */
	public String getLieuDebut() {
		return lieuDebut;
	}

	/**
	 * Sets the lieu debut.
	 *
	 * @param lieuDebut
	 *            the new lieu debut
	 */
	public void setLieuDebut(String lieuDebut) {
		this.lieuDebut = lieuDebut;
	}

	/**
	 * Gets the lieu arrivee.
	 *
	 * @return the lieu arrivee
	 */
	public String getLieuArrivee() {
		return lieuArrivee;
	}

	/**
	 * Sets the lieu arrivee.
	 *
	 * @param lieuArrivee
	 *            the new lieu arrivee
	 */
	public void setLieuArrivee(String lieuArrivee) {
		this.lieuArrivee = lieuArrivee;
	}

	/**
	 * Gets the voyage.
	 *
	 * @return the voyage
	 */
	public Voyage getVoyage() {
		return voyage;
	}

	/**
	 * Sets the voyage.
	 *
	 * @param voyage
	 *            the new voyage
	 */
	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}

	/**
	 * Gets the points interets.
	 *
	 * @return the points interets
	 */
	public PI[] getPointsInterets() {
		return pointsInterets;
	}

	/**
	 * Sets the points interets.
	 *
	 * @param pointsInterets
	 *            the new points interets
	 */
	public void setPointsInterets(PI[] pointsInterets) {
		this.pointsInterets = pointsInterets;
	}

	/**
	 * Gets the duree.
	 *
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * Sets the duree.
	 *
	 * @param duree the new duree
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	

}
