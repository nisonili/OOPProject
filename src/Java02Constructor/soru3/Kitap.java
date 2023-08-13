package Java02Constructor.soru3;

/**
 * 
 * Copy constructor (kopya yapıcı) genellikle bir sınıftaki öğeleri çoğaltmak
 * için kullanılır. Bir nesneyi aynı türdeki başka bir neseneye kopyalar.
 * 
 * Bir nesnenin değerlerini baz alarak yeni bir nesne oluşturmak için
 * kullanılabilir.
 */

public class Kitap {

	private String ad;
	private String yazar;

	public Kitap(String ad, String yazar) {
		this.ad = ad;
		this.yazar = yazar;
	}

	// Copy Constructor
	public Kitap(Kitap other) {
		this.ad = other.ad;
		this.yazar = other.yazar;
	}

	public void bilgileriGoster() {
		System.out.println("Kitap Adı: " + ad + ", Yazar: " + yazar);
	}
}
