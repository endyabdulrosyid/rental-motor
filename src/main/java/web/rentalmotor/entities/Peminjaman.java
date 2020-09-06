package web.rentalmotor.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Peminjaman {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	public String cabang;
	public String name;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date tgllahir;
	public String noidentitas;
	public String phone;
	public String nokendaraan;
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
	public LocalDateTime tglpeminjaman;
//	@OneToOne(mappedBy = "pengembalian")
//	Pengembalian pengembalian;
	
	public String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCabang() {
		return cabang;
	}
	public void setCabang(String cabang) {
		this.cabang = cabang;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTgllahir() {
		return tgllahir;
	}
	public void setTgllahir(Date tgllahir) {
		this.tgllahir = tgllahir;
	}
	public String getNoidentitas() {
		return noidentitas;
	}
	public void setNoidentitas(String noidentitas) {
		this.noidentitas = noidentitas;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNokendaraan() {
		return nokendaraan;
	}
	public void setNokendaraan(String nokendaraan) {
		this.nokendaraan = nokendaraan;
	}
	public LocalDateTime getTglpeminjaman() {
		return tglpeminjaman;
	}
	public void setTglpeminjaman(LocalDateTime tglpeminjaman) {
		this.tglpeminjaman = tglpeminjaman;
	}
	
	
}
