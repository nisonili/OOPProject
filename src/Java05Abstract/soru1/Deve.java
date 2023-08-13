package Java05Abstract.soru1;

public class Deve extends Hayvan {

	// constructor:
	Deve(String isim) {

		super(isim);
	}

	@Override
	public void bacaklar() {
		System.out.println("4 bacağı vardır.");
	}

	@Override
	public void gozler() {
		System.out.println("2 gözü vardır.");
	}
}
