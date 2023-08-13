package Java02Constructor.soru2;

public class Urun {

	private String ad;
	private double fiyat;
	private int stok;

	public Urun(String ad) {
		this.ad = ad;
		this.fiyat = 0.0;
		this.stok = 0;
	}

	public Urun(String ad, double fiyat) {
		this.ad = ad;
		this.fiyat = fiyat;
		this.stok = 0;
	}

	public Urun(String ad, double fiyat, int stok) {
		this.ad = ad;
		this.fiyat = fiyat;
		this.stok = stok;
	}

	public void urunBilgileri() {
		System.out.println("Ürün Adı: " + ad);
		System.out.println("Fiyatı: " + fiyat + " TL");
		System.out.println("Stok: " + stok);
	}

}
