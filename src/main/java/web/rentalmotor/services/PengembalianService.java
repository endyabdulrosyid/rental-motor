package web.rentalmotor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.rentalmotor.entities.Pengembalian;
import web.rentalmotor.repositories.PengembalianRepository;

@Service
public class PengembalianService {

	@Autowired
	PengembalianRepository pengembalianRepository;
	
	public Pengembalian createPengembalian(Pengembalian pengembalian) {
		pengembalianRepository.save(pengembalian);
		return pengembalian;
	}
}
