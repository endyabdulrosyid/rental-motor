package web.rentalmotor.entities;

public class Resp {
	public long lamasewa;
	public long totalbayar;
	public Resp(long lamasewa, long totalbayar) {
		this.lamasewa = lamasewa;
		this.totalbayar = totalbayar;
	}
	public long getLamasewa() {
		return lamasewa;
	}
	public void setLamasewa(long lamasewa) {
		this.lamasewa = lamasewa;
	}
	public long getTotalbayar() {
		return totalbayar;
	}
	public void setTotalbayar(long totalbayar) {
		this.totalbayar = totalbayar;
	}
	
	
	
}
