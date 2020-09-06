package web.rentalmotor.entities;

public class RespPengembalian {
	public String nokendaraan;
	public String phone;
	public RespPengembalian(String nokendaraan, String phone) {
		this.nokendaraan = nokendaraan;
		this.phone = phone;
		
		
	}
	public String getNokendaraan() {
		return nokendaraan;
	}
	public void setNokendaraan(String nokendaraan) {
		this.nokendaraan = nokendaraan;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
