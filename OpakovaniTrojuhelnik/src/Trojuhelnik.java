public class Trojuhelnik {
	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}

	public void setA(int a) throws Exception {
		if (a <= 0) {
			throw new Exception("Strana ctverce nemuze byt zaporne cislo");
		}
		this.a = a;
	}
	public Trojuhelnik(int a, int b, int c) throws Exception {
		this.setA(a); 
		this.setB(b);
		this.setC(c);
	}
	public int getB() {
		return b;
	}

	public void setB(int b) throws Exception {
		
		if (b <= 0) {
			throw new Exception("Strana ctverce nemuze byt zaporne cislo");
		}
		this.b = b;
	}
		
	

	public int getC() {
		return c;
	}

	public void setC(int c) throws Exception {
		
		if (c <= 0) {
			throw new Exception("Strana ctverce nemuze byt zaporne cislo");
		}
		this.c = c;
	}
	

	boolean jdeSestrojit() {

		if ( ( a + b > c) && (a + c > b) && (b + c > a) ) {

			return true;

			}	else {

				return false;

			}

	}

	

	@Override
	public String toString() {
		return "Strana a=" + a + "\n" + "Strana b=" + b + "\n" + "Strana c=" + c;
	}

	public boolean rovnostranny() {
		return (a == b && b == c);
	}

	public boolean pravouhly() {
		return ((a * a) + (b * b) == (c * c));
	}

}