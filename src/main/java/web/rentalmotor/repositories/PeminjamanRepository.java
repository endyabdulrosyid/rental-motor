package web.rentalmotor.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import web.rentalmotor.entities.Peminjaman;
import web.rentalmotor.entities.Pengembalian;

public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long> {
	
	@Query("FROM Peminjaman WHERE nokendaraan = ?1 and phone = ?2 and status='sewa'")
    List<Peminjaman> findByNoKendaraanAndPhone(String nokendaraan, String phone);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Peminjaman SET status='kembali' WHERE id = ?1")
	void updateStatusByNoKendaraanAndPhone(long id);
	
	 
}
