package Java04Polimorphism.soru3;

public class Daire extends GeometrikSekil {

	private double yaricap;

	public Daire(double yaricap) {
		this.yaricap = yaricap;
	}

	@Override
	public double alanHesapla() {
		return Math.PI * yaricap * yaricap;
	}
}
