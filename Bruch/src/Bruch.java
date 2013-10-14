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

	public Bruch(long zaehler, long nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
		this.kuerzen();
	}

	public Bruch(long ganze, long zaehler, long nenner) {
		this.ganze = ganze;
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public Bruch kuerzen() {
		if (getZaehler() < 0 && getNenner() < 0) {
			this.zaehler = Math.abs(this.zaehler);
			this.nenner = Math.abs(this.nenner);
		}
		for (long i = Math.max(getZaehler(), getNenner()); i >= 2; i--) {
			if (getZaehler() % i == 0 && getNenner() % i == 0) {
				this.zaehler = this.zaehler / i;
				this.nenner = this.nenner / i;
			}
		}
		return this;
	}

	public Bruch addiere(Bruch b1, Bruch b2) {

		return null;
	}

	public Bruch subtrahiere(Bruch b1, Bruch b2) {

		return null;
	}

	public Bruch multipliziere(Bruch b1, Bruch b2) {

		return null;
	}

	public Bruch multipliziere(long ganzZahl, Bruch b) {

		return null;
	}

	public Bruch dividiere(Bruch b1, Bruch b2) {

		return null;
	}

	public Bruch dividiere(long ganzZahl, Bruch b) {

		return null;
	}

	public Bruch potenziere(Bruch b) {

		return null;
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

	public long getZaehler() {
		return zaehler;
	}

	public long getNenner() {
		return nenner;
	}

	public long getGanze() {
		return ganze;
	}

	/**
	 * Gibt einen String zurück der bei einem echten Bruch in Form von x/y oder
	 * bei einem unechten Bruch als x y/z, wobei x eine ganze Zahl darstellt
	 * */
	public String toString() {
		String bruch = "";
		if (ganze == 0) {
			bruch += zaehler + "/" + nenner;
		} else
			bruch += ganze + " " + zaehler + "/" + nenner;
		return bruch;
	}

	public static boolean equals(Bruch b) {

		return true;
	}
}
