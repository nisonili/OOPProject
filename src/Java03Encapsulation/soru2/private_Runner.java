package Java03Encapsulation.soru2;

public class private_Runner {

	public static void main(String[] args) {

		Ogrenci_private ogrenci = new Ogrenci_private();
		ogrenci.setAd("Nilsel");

		// Hata: ad alanına doğrudan erişilemez
		// System.out.println(ogrenci.ad);

		// Doğru: getAd metodu ile erişilir

		System.out.println(ogrenci.getAd());

	}
}