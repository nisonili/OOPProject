package Java01Inheritance.soru2;

/**
 * Çoklu kalıtımın yaratacağı sorunu açıklayabilmek için yine anne-baba-çocuk
 * metaforları üzerinden bir örnek verebiliriz: cocuk isimli bir subclass’ımız
 * olduğunu düşünelim. Bu alt sınıfımızın iki ebeveyn sınıfı var yani anne ve
 * baba sınıflarının mirasçısı. Hem anne hem de baba sınıflarında yemekYe()
 * isimli bir methodumuz olsun. Bu durumda, cocuk subclassı yemekYe() methodunu
 * çağırdığında hangi ebeveynin mirasını devreye alacağını Java ayırt edemez.
 * Ebeveyn ayrımı yapma özelliği Java’da yoktur, bu belirsizlik problemi
 * nedeniyle çoklu kalıtım Java’da desteklenmez. 🙁
 * 
 * 
 * Aşağıdaki örnekte, "Yazdirabilir" adında bir arayüzümüz var ve "Belge" ile
 * "Ekran" adında iki farklı sınıf bu arayüzü uyguluyor. Her iki sınıf da
 * "yazdir" metotunu implemente ediyor, ancak her sınıfın kendi özel yazdırma
 * davranışı vardır. Bu senaryoda "interface" kullanımı, çoklu kalıtımın mümkün
 * olmadığı durumda farklı sınıfların benzer davranışları sergilemesini ve kodun
 * daha modüler olmasını sağlar.
 * 
 */

public class InterfaceOrnek {

	public static void main(String[] args) {

		Dokuman dokuman = new Dokuman("Bu bir belgedir.");
		Ekran ekran = new Ekran("Ekranın içeriği yazdırıldı.");

		dokuman.yazdir();
		ekran.yazdir();

	}

}
