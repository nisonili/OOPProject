package Java04Polimorphism.soru1;

class Erkek extends Insan {
	public Erkek(String ad, int yas) {
		super(ad, yas);
	}

	@Override
	public void tanit() {
		System.out.println("Ben bir erkeğim. Adım: " + ad + ", Yaşım: " + yas);
	}
}
