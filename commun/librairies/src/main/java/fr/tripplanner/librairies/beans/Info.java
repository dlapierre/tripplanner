/*
 * David Lapierre - Code your dreams
 */
package fr.tripplanner.librairies.beans;

import java.io.Serializable;

import fr.tripplanner.librairies.beans.references.TYPE_CHAMP;

/**
 * The Class Info.
 */
public class Info extends BaseBeanSync implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private long id;

	/** The nom champ. */
	private String nomChamp;

	/** The valeur champ. */
	private String valeurChamp;

	/** The type champ. */
	private TYPE_CHAMP typeChamp;

	/** The pi. */
	private PI pi;

	/** The etape. */
	private Etape etape;

	/**
	 * Instantiates a new info.
	 */
	public Info() {
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
	 * Gets the nom champ.
	 *
	 * @return the nom champ
	 */
	public String getNomChamp() {
		return nomChamp;
	}

	/**
	 * Sets the nom champ.
	 *
	 * @param nomChamp
	 *            the new nom champ
	 */
	public void setNomChamp(String nomChamp) {
		this.nomChamp = nomChamp;
	}

	/**
	 * Gets the valeur champ.
	 *
	 * @return the valeur champ
	 */
	public String getValeurChamp() {
		return valeurChamp;
	}

	/**
	 * Sets the valeur champ.
	 *
	 * @param valeurChamp
	 *            the new valeur champ
	 */
	public void setValeurChamp(String valeurChamp) {
		this.valeurChamp = valeurChamp;
	}

	/**
	 * Gets the type champ.
	 *
	 * @return the type champ
	 */
	public TYPE_CHAMP getTypeChamp() {
		return typeChamp;
	}

	/**
	 * Sets the type champ.
	 *
	 * @param typeChamp
	 *            the new type champ
	 */
	public void setTypeChamp(TYPE_CHAMP typeChamp) {
		this.typeChamp = typeChamp;
	}

	/**
	 * Gets the pi.
	 *
	 * @return the pi
	 */
	public PI getPi() {
		return pi;
	}

	/**
	 * Sets the pi.
	 *
	 * @param pi
	 *            the new pi
	 */
	public void setPi(PI pi) {
		this.pi = pi;
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
