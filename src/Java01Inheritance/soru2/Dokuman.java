package Java01Inheritance.soru2;

public class Dokuman implements IYazdirilabilir {

	public String icerik;

	public Dokuman(String icerik) {

		this.icerik = icerik;

	}

	@Override
	public void yazdir() {
		System.out.println("Belge yazdırılıyor:\n" + icerik);
	}

}
