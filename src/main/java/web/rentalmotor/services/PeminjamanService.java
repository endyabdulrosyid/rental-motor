package web.rentalmotor.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.OptimisticLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.rentalmotor.entities.Peminjaman;
import web.rentalmotor.repositories.PeminjamanRepository;

@Service
public class PeminjamanService {
	
	@Autowired
	private PeminjamanRepository peminjamanRepository;
	
	public Peminjaman createPeminjaman(Peminjaman peminjaman) {
		peminjamanRepository.save(peminjaman);
		return peminjaman;
	}
	
	
	public void updateStatus(long id) {
		peminjamanRepository.updateStatusByNoKendaraanAndPhone(id);
	}
	
	public Peminjaman findByNoKendaraanAndPhone(String nokendaraan, String phone) {
		Peminjaman peminjaman = (Peminjaman) peminjamanRepository.findByNoKendaraanAndPhone(nokendaraan, phone);
		return peminjaman;
	}
}
