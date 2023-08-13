package Java04Polimorphism.soru3;

public class Polimorfizm_Ornek {

	/**
	 * 
	 * Dinamik Polimorfizm nedir?
	 * 
	 * Dinamik polimorfizmde geçersiz kılınan yöntemi derleme zamanında çözmek
	 * yerine çalışma zamanında çözülür. Derleyici, derleme zamanında hangi yöntemin
	 * çağrıldığını bilmez. JVM, çalışma zamanında hangi yöntemin çağrılacağına
	 * karar verir. Dinamik polimorfizm, çalışma zamanı polimorfizmi olarak da
	 * adlandırılır. Yöntem geçersiz kılma yoluyla elde edilebilir.
	 * 
	 * 
	 * Statik Polimorfizm nedir? Statik polimorfizmdeki işlemler derleme zamanında
	 * (compile) sergilenir. Derleyici hangi yöntemin çağrıldığını bilir. Yöntemin
	 * aşırı yüklenmesi, statik polimorfizmin bir örneğidir. Statik polimorfizm,
	 * derleme zamanı polimorfizmi olarak da bilinir. Yöntem aşırı yüklemesi yoluyla
	 * elde edilebilir.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		GeometrikSekil daire = new Daire(5.0);
		GeometrikSekil kare = new Kare(4.0);

		System.out.println("Dairenin Alanı: " + daire.alanHesapla());

		System.out.println("Karenin Alanı: " + kare.alanHesapla());

	}

}

/**
 *
 *
 * Bu örnekte, "GeometrikSekil" sınıfı, "Daire" ve "Kare" sınıflarına üst sınıf
 * olarak hizmet eder. "alanHesapla" metodu üst sınıfta tanımlanmıştır, ancak
 * her alt sınıf bu metodu kendi ihtiyacına göre uygulamıştır. Bu sayede, aynı
 * metot adını kullanarak farklı alt sınıflarda farklı davranışlar elde
 * edilmiştir.
 *
 *
 */