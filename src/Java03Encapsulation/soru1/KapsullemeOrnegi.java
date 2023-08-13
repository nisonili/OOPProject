package Java03Encapsulation.soru1;

public class KapsullemeOrnegi {

	public static void main(String[] args) {

		Personel personel = new Personel();
		personel.setAd("Nisel");
		personel.setYas(33);

		System.out.println("Personel Adı: " + personel.getAd());
		System.out.println("Personel Yaşı: " + personel.getYas());

		// Geçersiz yaş değeri denemesi
		personel.setYas(-5);

	}

}

/**
 * 
 * Bu örnekte, "Personel" sınıfında "ad" ve "yas" adında özel (private) alanlar
 * tanımlandı. Bu alanlara doğrudan erişim yerine, "getter" ve "setter"
 * metodları kullanılarak erişim sağlandı. "setYas" metodu, yaş değerini 0'dan
 * büyük veya eşit olacak şekilde kontrol ediyor. Bu sayede, kapsülleme ile
 * verilerin güvenliği ve doğruluğu sağlanmış oluyor.
 */
