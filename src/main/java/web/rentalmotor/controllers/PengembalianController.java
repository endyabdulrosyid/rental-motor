package web.rentalmotor.controllers;

import java.text.ParseException;
import java.time.LocalDateTime;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.rentalmotor.entities.Peminjaman;
import web.rentalmotor.entities.Pengembalian;
import web.rentalmotor.services.PeminjamanService;
import web.rentalmotor.services.PengembalianService;

@Controller
public class PengembalianController {

	@Autowired
	PengembalianService pengembalianService;
	
	@Autowired
	PeminjamanService peminjamanService;
	
	@GetMapping("/pengembalian")
    public String showPengembalian(Model model){
		model.addAttribute("pengembalian", new Pengembalian());
        return "views/pengembalian";
    }
		
	@PostMapping("/pengembalian-save")
    public String registerPengembalian(@Valid Pengembalian pengembalian, Model model) throws ParseException{
		LocalDateTime now = LocalDateTime.now();
		peminjamanService.updateStatus(pengembalian.getId());
		pengembalian.setTglpengembalian(now);
		pengembalianService.createPengembalian(pengembalian);
        model.addAttribute("success", true);
        return "views/pengembalian";
    }
}
