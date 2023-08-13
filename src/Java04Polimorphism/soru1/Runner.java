package Java04Polimorphism.soru1;

public class Runner {

	public static void main(String[] args) {
		/**
		 * 
		 * Polimorfizm, Nesne Yönelimli Programlamanın (OOP) ana yönlerinden biridir.
		 * Polimorfizm kelimesi, Poli ve morflara bölünebilir, çünkü "Poly" çok anlamına
		 * gelir ve "Morphs" formlar anlamına gelir. Basit bir ifadeyle, bir mesajın
		 * birçok biçimde temsil edilebilmesini söyleyebiliriz.
		 * 
		 * 
		 * Örneğin, Karbonda polimorfizm görülebilir çünkü karbon elmas, grafit, kömür
		 * gibi pek çok formda bulunabilir. Hem kadının hem de karbonun aynı anda duruma
		 * göre farklı özellikler gösterdiğini söyleyebiliriz. Buna polimorfizm denir.
		 * 
		 * Polimorfizmin tanımı, tek bir görevi farklı şekillerde yerine getirmek olarak
		 * açıklanabilir. Birden fazla uygulamaya sahip tek bir arayüze polimorfizm de
		 * denir.
		 * 
		 * 
		 */

		Insan insan1 = new Kadin("Ayşe", 30);
		Insan insan2 = new Erkek("Ali", 25);

		insan1.tanit(); // Çıktı: Ben bir kadınım. Adım: Ayşe, Yaşım: 30
		insan2.tanit(); // Çıktı: Ben bir erkeğim. Adım: Ahmet, Yaşım: 25
	}

}
