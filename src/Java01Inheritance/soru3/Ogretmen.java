package Java01Inheritance.soru3;

public class Ogretmen extends Okul {

	int id;
	String name;

	void okulAdınıYazdir() {
		// super.isim kullanarak; ebeveyn sınıfındaki isim değişkenine erişiyoruz
		// this.isim kullanımı ile çocuk sınıfın/alt sınıfın isim değişkenine erişmiş
		// oluyoruz.

		System.out.println("Okul Adi: " + super.isim);

	}
}