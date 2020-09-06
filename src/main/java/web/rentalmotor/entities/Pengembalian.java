package web.rentalmotor.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pengembalian {
	@Id
	private long id;
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
	public LocalDateTime tglpengembalian;
	
//	@OneToOne
//	@PrimaryKeyJoinColumn(name = "id")
//	Peminjaman peminjaman;
	
	public int lamaSewa;
	public int totalbayar;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getTglpengembalian() {
		return tglpengembalian;
	}

	public void setTglpengembalian(LocalDateTime tglpengembalian) {
		this.tglpengembalian = tglpengembalian;
	}

	public int getLamaSewa() {
		return lamaSewa;
	}

	public void setLamaSewa(int lamaSewa) {
		this.lamaSewa = lamaSewa;
	}

	public int getTotalbayar() {
		return totalbayar;
	}

	public void setTotalbayar(int totalbayar) {
		this.totalbayar = totalbayar;
	}

	
	
	
}
