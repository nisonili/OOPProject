package Java05Abstract.soru1;

/**
 * Abstract yöntemler içeren soyut bir sınıf olan bir Hayvan sınıfımız olduğunu
 * varsayalım. Hayvan sınıfını soyut bir sınıf olarak ilan etmemizin nedeni, her
 * hayvanın farklı bacakları, gözleri, renkleri vb.olmasıdır. Maymun, Deve,
 * Aslan gibi alt sınıflar, Hayvan sınıfının soyut yöntemlerini gereksinimlerine
 * göre bildirebilirler.
 * 
 * 
 * 
 */

abstract class Hayvan {

	String isim = " ";

	Hayvan(String isim) {
		this.isim = isim;
	}

	public void Bilgi(String detay) {

		System.out.println(this.isim + " ile ilgili bilgiler:  " + detay);

	}

	abstract public void bacaklar();

	abstract public void gozler();

}
