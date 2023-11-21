
public class Musteri {

	String isim;
	String soyisim;
	private int bakiye;
	private long tc;
	private String adres;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public long getTc() {
		return tc;
	}

	public String getAdres() {
		return adres;
	}

	public void setTc(long tc) {
		this.tc = tc;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

}
