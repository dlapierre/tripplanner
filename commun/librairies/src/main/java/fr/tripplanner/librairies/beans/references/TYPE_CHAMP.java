/*
 * David Lapierre - Code your dreams
 */
package fr.tripplanner.librairies.beans.references;

/**
 * The Enum TYPE_CHAMP.
 */
public enum TYPE_CHAMP {

	/** The duree. */
	DUREE(CATEGORIE_TYPE_CHAMP.DUREE),
	/** The kms. */
	KMS(CATEGORIE_TYPE_CHAMP.DISTANCE),
	/** The miles. */
	MILES(CATEGORIE_TYPE_CHAMP.DISTANCE),
	/** The text. */
	TEXT(CATEGORIE_TYPE_CHAMP.TEXT),
	/** The lien web. */
	LIEN_WEB(CATEGORIE_TYPE_CHAMP.TEXT),
	/** The text local. */
	TEXT_LOCAL(CATEGORIE_TYPE_CHAMP.TEXT),
	/** The eur. */
	EUR(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The usd. */
	USD(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The jpy. */
	JPY(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The gbp. */
	GBP(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The chf. */
	CHF(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The nzd. */
	NZD(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The mad. */
	MAD(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The rub. */
	RUB(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The cny. */
	CNY(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The hkd. */
	HKD(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The php. */
	PHP(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The thb. */
	THB(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The vnd. */
	VND(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The inr. */
	INR(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The cad. */
	CAD(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The ars. */
	ARS(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The brl. */
	BRL(CATEGORIE_TYPE_CHAMP.DEVISE),
	/** The aud. */
	AUD(CATEGORIE_TYPE_CHAMP.DEVISE);

	/** The cat. */
	private CATEGORIE_TYPE_CHAMP cat;

	/**
	 * Instantiates a new type champ.
	 *
	 * @param cat
	 *            the cat
	 */
	private TYPE_CHAMP(CATEGORIE_TYPE_CHAMP cat) {
		this.cat = cat;
	}

	/**
	 * Gets the cat.
	 *
	 * @return the cat
	 */
	public CATEGORIE_TYPE_CHAMP getCat() {
		return cat;
	}
	
	
}
