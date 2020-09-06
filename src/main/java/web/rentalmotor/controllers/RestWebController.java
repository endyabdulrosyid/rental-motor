package web.rentalmotor.controllers;

import java.lang.annotation.Annotation;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import web.rentalmotor.entities.Peminjaman;
import web.rentalmotor.entities.RespPengembalian;
import web.rentalmotor.repositories.PeminjamanRepository;
import web.rentalmotor.repositories.PengembalianRepository;

@RestController
public class RestWebController {
	@Autowired
	private PeminjamanRepository peminjamanRepository;
	@Autowired
	private PengembalianRepository pengembalianRepository;
	
	@PostMapping("/api/peminjaman")
    public ResponseEntity<?> getPeminjamanByNoKendAndNoIdentity(@RequestBody RespPengembalian requestbody){
		System.out.println("requestbody : "+requestbody);
		
//		System.out.println("nokendaraan : "+nokendaraan);
//		System.out.println("phone : "+phone);
        List<Peminjaman> listPeminjaman = peminjamanRepository.findByNoKendaraanAndPhone(requestbody.getNokendaraan(), requestbody.getPhone());
        System.out.println("listPeminjaman.size() = "+listPeminjaman.size());
        long resp[] = new long[3];
        if(listPeminjaman.size() >0) {
        	for(int x=0;x<listPeminjaman.size();x++) {
        		LocalDateTime tglpeminjaman = listPeminjaman.get(x).getTglpeminjaman();
        		LocalDateTime today = LocalDateTime.now();
        		long lamasewa = getTime(tglpeminjaman, today);
        		long jampertama = 10000;
        		long jamberikutnya = 5000;
        		long totalbayar=((lamasewa - 1)*jamberikutnya)+jampertama;
        		System.out.println("lamasewa = "+lamasewa);
        		System.out.println("Totalbayar = "+totalbayar);
        		resp[0] = lamasewa;
        		resp[1] = totalbayar;
        		resp[2] = listPeminjaman.get(x).getId();
        	}
        }
        return new ResponseEntity<>(resp , HttpStatus.OK);
    }
	
	private static long getTime(LocalDateTime dob, LocalDateTime now) {
		int MINUTES_PER_HOUR = 60;
	    int SECONDS_PER_MINUTE = 60;
	    int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
	    
        LocalDateTime today = LocalDateTime.of(now.getYear(),
                now.getMonthValue(), dob.getDayOfMonth(), dob.getHour(), dob.getMinute(), dob.getSecond());
        Duration duration = Duration.between(today, now);

        long seconds = duration.getSeconds();
                
        long hours = seconds / SECONDS_PER_HOUR;

        return hours;
    }
}
