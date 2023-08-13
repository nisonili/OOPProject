package Java04Polimorphism.soru3.statik;

public class Statik_Runner {

	public static void main(String[] args) {
		HesapMakinesi hesapMakinesi = new HesapMakinesi();

		int sonuc1 = hesapMakinesi.topla(5, 3);
		System.out.println("Toplam (int): " + sonuc1);

		double sonuc2 = hesapMakinesi.topla(4.5, 2.7);
		System.out.println("Toplam (double): " + sonuc2);

		String sonuc3 = hesapMakinesi.topla("Merhaba", "Dünya");
		System.out.println("Toplam (String): " + sonuc3);

	}

	/**
	 * Statik polimorfizm, aynı metot adının farklı parametre listeleri ile farklı
	 * şekillerde kullanılmasını ifade eder. Diğer adıyla, aşırı yüklenmiş metotlar
	 * (overloaded methods) bu tür polimorfizmin bir örneğidir. Java'da statik
	 * polimorfizm, metotların hangi parametrelerle çağrılacaklarına derleme
	 * zamanında karar verilerek gerçekleşir.
	 */

}
