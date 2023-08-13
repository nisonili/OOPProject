package Java05Abstract.soru1;

public class Kumru extends Hayvan {

	Kumru(String isim) {
		super(isim);
	}

	// Overriding or defining the abstract methods:
	@Override
	public void bacaklar() {
		System.out.println("2 bacağı vardır.");
	}

	@Override
	public void gozler() {
		System.out.println("2 gözü vardır. ");

	}

}
