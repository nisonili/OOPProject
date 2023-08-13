package Java05Abstract.soru1;

public class Test {
	public static void main(String[] args) {

		// alt sınıflardan nesneler türeterek, Hayvan sınıfının referanslarını
		// kullanabiliriz:

		Hayvan nesne1 = new Deve("Deve");
		nesne1.Bilgi("Develer çölde yaşar");
		nesne1.bacaklar();
		nesne1.gozler();

		System.out.println();

		Hayvan nesne2 = new Kumru("Kumru");
		nesne2.Bilgi("Kumrular oldukça akıllı hayvanlardır.");
		nesne2.bacaklar();
		nesne2.gozler();

		System.out.println();

		Hayvan nesne3 = new Karinca("Karınca");
		nesne3.Bilgi("Dünya'da 12,000'den fazla karınca türü yaşamaktadır.");
		nesne3.bacaklar();
		nesne3.gozler();
	}
}
