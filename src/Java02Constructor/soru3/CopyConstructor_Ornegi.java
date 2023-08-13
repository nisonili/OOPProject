package Java02Constructor.soru3;

public class CopyConstructor_Ornegi {

	public static void main(String[] args) {

		Kitap kitap1 = new Kitap("Sefiller", "Victor Hugo");

		// Kitap1'in bir kopyasını oluşturarak kitap2'yi yaratırız:
		Kitap kitap2 = new Kitap(kitap1);

		kitap1.bilgileriGoster(); // Çıktı: Kitap Adı: Sefiller, Yazar: Victor Hugo
		kitap2.bilgileriGoster(); // Çıktı: Kitap Adı: Sefiller, Yazar: Victor Hugo

		// kitap2'nin bilgilerini değiştirir
		kitap2 = new Kitap("1984", "George Orwell");

		kitap1.bilgileriGoster(); // Çıktı: Kitap Adı: Sefiller, Yazar: Victor Hugo
		kitap2.bilgileriGoster(); // Çıktı: Kitap Adı: 1984, Yazar: George Orwell

	}

}
