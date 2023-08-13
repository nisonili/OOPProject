package Java03Encapsulation.soru3;

public class Runner {

	public static void main(String[] args) {
		// sınıf nesnesini oluşturalım:
		Ogrenci ogrenci1 = new Ogrenci();

		ogrenci1.setisim("Ali");
		ogrenci1.setokulno(273);

		// getisim() ile dönen değeri yazdıralım:
		System.out.println(ogrenci1.getisim());

		// getokulno() methodu ile dönen değeri yazdıralım:
		System.out.println(ogrenci1.getokulno());

	}

}
