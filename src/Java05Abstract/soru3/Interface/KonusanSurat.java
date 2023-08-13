package Java05Abstract.soru3.Interface;

class KonusanSurat implements ISuratIfadesi, IKonusma {

	@Override
	public void ifadeGoster() {
		System.out.println("Konuşan bir ifade.");
	}

	@Override
	public void konus() {
		System.out.println("Merhaba!");
	}
}
