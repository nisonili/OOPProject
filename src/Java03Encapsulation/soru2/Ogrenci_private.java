package Java03Encapsulation.soru2;

public class Ogrenci_private {

	/**
	 * private: "private" anahtar kelimesi, bir field ya da methodu yalnızca aynı
	 * sınıf içinde erişilebilir hale getirir. Diğer sınıflar veya dış dünya bu
	 * öğeye doğrudan erişemez.
	 * 
	 */

	private String ad;

	public void setAd(String ad) {
		this.ad = ad;

	}

	public String getAd() {
		return ad;
	}

}
