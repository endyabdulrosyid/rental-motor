package web.rentalmotor.entities;

import javax.persistence.*;

@Entity
public class Penulis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public String namapenulis;
	public String phone;
	public String email;
	public String alamat;
	public String keterangan;
	public String npwp;
	public String createby;
	public String lastmodify;
	public String owner;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNamapenulis() {
		return namapenulis;
	}
	public void setNamapenulis(String namapenulis) {
		this.namapenulis = namapenulis;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	public String getNpwp() {
		return npwp;
	}
	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public String getLastmodify() {
		return lastmodify;
	}
	public void setLastmodify(String lastmodify) {
		this.lastmodify = lastmodify;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
