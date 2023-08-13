package Java01Inheritance.soru3;

public class Runner {

	public static void main(String[] args) {
		/**
		 * 
		 * Super anahtar kelimesi, üst sınıflardan nesnelere erişmek için bir referans
		 * değişkeni olarak kullanılır ve türetilmiş sınıftaki üst sınıf
		 * constructorlarına, field ve methodlarına erişim sağlar. Kalıtım ve
		 * polimorfizm kavramlarında çok önemli bir rol oynar. Bir üst sınıfın
		 * constructor'ını alt sınıfın constructor'ında çağırmak için "super"
		 * kullanılır. Bu, alt sınıfın oluşturulması sırasında üst sınıfın gerekli
		 * işlemlerini tamamlamasını sağlar. "super" kullanımı aynı zamanda constructor
		 * zincirlemesi olarak da adlandırılır.
		 * 
		 * 
		 * 
		 * 
		 * Okul ve öğrenci için iki sınıf oluşturulur. Öğretmen sınıfı okul sınıfı ile
		 * extend edilecektir. Her iki sınıfta id ve isim değişkenleri bulunmaktadır.
		 * Super anahtar kelimesi ile üst sınıfın id ve isim değişkenlerine başvurulur.
		 * Yine öğretmen sınıfındaki Okul sınıfının id değişkenine erişmek için super.id
		 * ifadesi kullanılabilir.
		 * 
		 * İki sınıfta da isim String değişkeni vardır. Okul üst sınıfından, öğretmen
		 * alt sınıfına nasıl erişebileceğimiz ile ilgili örnek:
		 */

		Ogretmen ogretmen = new Ogretmen();

		ogretmen.okulAdınıYazdir();

	}

}
