package Java03Encapsulation.soru3;

public class Ogrenci {

//  private variables
	private String isim;
	private int okulno;

	// isim değişikliği için set methodu:
	public void setisim(String n) {
		this.isim = n;
	}

	// isim değişkenini getirmek için get methodu:
	public String getisim() {
		return isim;
	}

	// okulno değişikliği için set methodu:
	public void setokulno(int no) {
		this.okulno = no;
	}

	// okulno değişkenini getirmek için get methodu:
	public int getokulno() {
		return okulno;
	}
}
