package prodavnicapaket;

public class ProdavnicaKlasa {
	private int x;
	private int y;
	private boolean pokazivac;

	public ProdavnicaKlasa() {

	}

	public ProdavnicaKlasa(int x, int y, boolean pokazivac) {
		this.x = x;
		this.y = y;
		this.pokazivac = pokazivac;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isPokazivac() {
		return pokazivac;
	}

	public void setPokazivac(boolean pokazivac) {
		this.pokazivac = pokazivac;
	}

}
