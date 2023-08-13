package Java04Polimorphism.soru1;

class Kadin extends Insan {

	public Kadin(String ad, int yas) {
		super(ad, yas);
	}

	@Override

	public void tanit() {

		System.out.println("Ben bir kadınım. Adım: " + ad + ", Yaşım: " + yas);
	}
}