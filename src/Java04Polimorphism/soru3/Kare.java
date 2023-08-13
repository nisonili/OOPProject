package Java04Polimorphism.soru3;

public class Kare extends GeometrikSekil {

	private double kenar;

	public Kare(double kenar) {
		this.kenar = kenar;
	}

	@Override
	public double alanHesapla() {
		return kenar * kenar;
	}

}
