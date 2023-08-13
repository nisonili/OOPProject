package Java05Abstract.soru1;

public class Karinca extends Hayvan {

	Karinca(String isim) {
		super(isim);
	}

	@Override
	public void bacaklar() {
		System.out.println("6 adet bacağı vardır.");

	}

	@Override
	public void gozler() {

		System.out.println("2 adet gözü vardır.");
	}

}
