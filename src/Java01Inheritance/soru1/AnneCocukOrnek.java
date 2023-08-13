package Java01Inheritance.soru1;

public class AnneCocukOrnek {
	public static void main(String[] args) {

		/**
		 * Java'da kalıtım uygulaması için “extends” anahtar kelimesi kullanılır.
		 * 
		 * Bu anahtar kelime, ebeveyn sınıfı ( temel sınıf/özelliklerini miras bırakacak
		 * olan sınıf) ve çocuk sınıfları(üst temel sınıftan miras alır) arasındaki
		 * miras geçişinin sağlanmasında aracı görevi görmektedir.
		 * 
		 * “Extends” anahtar kelimesi alt sınıf isminin sonuna yazılarak; bu sınıfın üst
		 * sınıfa ait özellikleri ve fonksiyonları miras aldığını gösterir. Miras aldığı
		 * özelliklerle birlikte çocuk sınıf, kendine yeni özellik ve fonksiyonlar
		 * ekleyerek büyüyecektir.
		 * 
		 */

		Cocuk cocuk = new Cocuk("Nisan");

		cocuk.sevgiGoster();
		cocuk.oyunOyna();

	}// main

} // class
