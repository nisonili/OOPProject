package Java02Constructor.soru2;

public class Runner {
	public static void main(String[] args) {
		Urun urun1 = new Urun("Kalem");
		Urun urun2 = new Urun("Defter", 5.99);
		Urun urun3 = new Urun("Kitap", 29.99, 15);

		urun1.urunBilgileri();
		System.out.println("------------------------");
		urun2.urunBilgileri();
		System.out.println("------------------------");
		urun3.urunBilgileri();
	}

}

/**
 * 
 * Bu örnekte, "Urun" sınıfında aşırı yüklenmiş üç constructor bulunmaktadır.
 * Her bir constructor farklı parametre tiplerini kabul eder: sadece ürün adı,
 * ürün adı ve fiyat, ürün adı, fiyat ve stok sayısı. Bu aşırı yüklenmiş
 * constructor'lar, farklı şekillerde ürün nesneleri oluşturmanıza izin verir.
 */
