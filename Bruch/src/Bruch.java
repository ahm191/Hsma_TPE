/**
 * Diese Klasse stellt ist zur Erstellung von Bruechen da. Ausserdem bietet sie
 * grundlegende Rechenoperationen wie Addition, Subtraktion, Division,
 * Multiplikation usw..
 * 
 * @author Tim Meyerhoff, Nicola Gervasi, Alexander Müller
 * 
 */
public class Bruch {

	private long zaehler = 0;
	private long nenner = 0;
	private long ganze = 0;

	/**
	 * Konstruktor zur Erzeugung von echten Bruechen
	 * @param zaehler Der obere Teil des Bruches
	 * @param nenner Der untere Teil des Bruches
	 */
	public Bruch(long zaehler, long nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
		this.kuerzen();
	}

	/**
	 * Zusätzlicher Konstruktor fuer unechte Brueche
	 * @param ganze Die ganze Zahl vor dem Bruch
	 * @param zaehler
	 * @param nenner
	 */
	public Bruch(long ganze, long zaehler, long nenner) {
		this.ganze = ganze;
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public Bruch kuerzen() {
		if (getZaehler() < 0 && getNenner() < 0) {
			// Bei negativem Zaehler und Nenner wird der absolute Wert genommen
			this.zaehler = Math.abs(this.getZaehler());
			this.nenner = Math.abs(this.getNenner());
		}
		for (long i = Math.max(getZaehler(), getNenner()); i >= 2; i--) {
			if (getZaehler() % i == 0 && getNenner() % i == 0) {
				this.zaehler = this.getZaehler() / i;
				this.nenner = this.getNenner() / i;
			}
		}
		return this;
	}

	
	public Bruch addiere(Bruch b) {
		if(this.getNenner() != b.getNenner()){
			
		}
		return null;
	}

	public Bruch subtrahiere(Bruch b1, Bruch b2) {

		return null;
	}

	public Bruch multipliziere(Bruch b) {
		return new Bruch(this.getZaehler()*b.getZaehler(), this.getNenner()*b.getNenner());
	}

	public Bruch multipliziere(long zahl) {
		return new Bruch(this.getZaehler() * zahl, this.getNenner());
	}

	public Bruch dividiere(Bruch b) {
		return new Bruch(this.getZaehler() * b.getNenner(), this.getNenner() * b.getZaehler());
	}

	public Bruch dividiere(long zahl) {
		return new Bruch(this.getZaehler(), this.getNenner() * zahl);
	}

	public Bruch potenziere(long zahl) {
		long zaehler = (long) Math.pow(this.getZaehler(), zahl);
		long nenner = (long) Math.pow(this.getNenner(), zahl);
		return new Bruch(zaehler, nenner);
	}

	public Bruch echterBruch(Bruch b) {

		return null;
	}

	public Bruch unechterBruch(Bruch b) {

		return null;
	}

	public boolean isEcht(Bruch b) {

		return true;
	}

	public double getDezimalzahl(Bruch b) {

		return 0;
	}

	public Bruch kehrwert(Bruch b) {

		return null;
	}

	/**
	 * Gibt einen String zurück der bei einem echten Bruch in Form von x/y oder
	 * bei einem unechten Bruch als x y/z, wobei x eine ganze Zahl darstellt
	 * */
	public String toString() {
		String bruch = "";
		if (ganze == 0) {
			bruch += zaehler + "/" + nenner;
		} else {
			bruch += ganze + " " + zaehler + "/" + nenner;
		}
		return bruch;
	}

	public static boolean equals(Bruch b) {

		return true;
	}

	private long getZaehler() {
		return zaehler;
	}

	private long getNenner() {
		return nenner;
	}

	private long getGanze() {
		return ganze;
	}
}
