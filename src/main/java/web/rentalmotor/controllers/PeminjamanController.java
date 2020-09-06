package web.rentalmotor.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import web.rentalmotor.entities.Member;
import web.rentalmotor.entities.Peminjaman;
import web.rentalmotor.services.PeminjamanService;

@Controller
public class PeminjamanController {
	
	@Autowired
	PeminjamanService peminjamanService;

	@GetMapping("/peminjaman")
    public String showPeminjaman(Model model){
		model.addAttribute("peminjaman", new Peminjaman());
        return "views/peminjaman";
    }
	
	@PostMapping("/peminjaman")
    public String registerMember(@Valid Peminjaman peminjaman, Model model) throws ParseException{
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now);

//        String formatDateTime = now.format(formatter);
        
		peminjaman.setTglpeminjaman(now);
		peminjaman.setStatus("sewa");
		System.out.println(peminjaman.getTglpeminjaman());
        peminjamanService.createPeminjaman(peminjaman);
        model.addAttribute("success", true);
        return "redirect:/views/peminjaman";
    }
}
