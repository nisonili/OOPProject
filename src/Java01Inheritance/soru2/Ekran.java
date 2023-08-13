package Java01Inheritance.soru2;

public class Ekran implements IYazdirilabilir {

	public String ekranIcerik;

	public Ekran(String ekranIcerik) {
		this.ekranIcerik = ekranIcerik;
	}

	@Override
	public void yazdir() {
		System.out.println("Ekran görüntüsü alınıyor:\n" + ekranIcerik);
	}

}
