/*
 * David Lapierre - Code your dreams
 */
package fr.tripplanner.librairies.beans;

import java.io.Serializable;

import fr.tripplanner.librairies.beans.references.OperationSync;

/**
 * The Class BaseBeanSync.
 */
public abstract class BaseBeanSync implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The type. */
	private OperationSync type;

	/** The temp ID. */
	private long tempID;

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public OperationSync getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type
	 *            the new type
	 */
	public void setType(OperationSync type) {
		this.type = type;
	}

	/**
	 * Gets the temp ID.
	 *
	 * @return the temp ID
	 */
	public long getTempID() {
		return tempID;
	}

	/**
	 * Sets the temp ID.
	 *
	 * @param tempID
	 *            the new temp ID
	 */
	public void setTempID(long tempID) {
		this.tempID = tempID;
	}

}