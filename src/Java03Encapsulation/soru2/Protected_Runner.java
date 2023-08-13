package Java03Encapsulation.soru2;

public class Protected_Runner {

	/**
	 * protected: "protected" anahtar kelimesi, bir üyeye aynı paketteki diğer
	 * sınıflardan ve alt sınıflardan erişim sağlar. Yani, üye, sınıfın içinde, aynı
	 * paketteki diğer sınıflarda ve alt sınıflardan erişilebilir.
	 * 
	 */

	public static void main(String[] args) {

		Protected_Kedi kedi = new Protected_Kedi();

		kedi.miyavla();

		// Koruma seviyesi protected olduğu için alt sınıftan erişim sağlanabilir

		kedi.sesCikar();

	}

}
