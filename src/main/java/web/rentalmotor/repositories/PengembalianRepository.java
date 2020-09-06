package web.rentalmotor.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import web.rentalmotor.entities.Pengembalian;

public interface PengembalianRepository extends JpaRepository<Pengembalian, Long> {

	
}
