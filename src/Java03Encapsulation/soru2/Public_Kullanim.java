package Java03Encapsulation.soru2;

public class Public_Kullanim {

	public static void main(String[] args) {

		/**
		 * public: "public" anahtar kelimesi, bir sınıf öğesine her yerden
		 * erişilebilirlik sağlar. Yani, sınıfın içinde, aynı paketteki diğer sınıflarda
		 * ve diğer paketlerdeki sınıflarda bu üyeye erişilebilir.
		 */

		Public_Hesap hesap = new Public_Hesap();
		double sonuc = hesap.hesaplaToplam(5.0, 3.0);
		System.out.println("Toplam: " + sonuc);

	}

}
