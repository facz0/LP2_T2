package com.examenT2.LP2_T2_Cossio_Fabrizio_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.examenT2.LP2_T2_Cossio_Fabrizio_1.util.Alert;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.Service.OrdenCompraCossioFabrizioService;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.Service.ProveedorCossioFabrizioService;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.model.OrdenCompraCossioFabrizio;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.model.ProveedorCossioFabrizio;

import lombok.RequiredArgsConstructor;
import lombok.experimental.var;

@Controller
@RequestMapping("OrdenCompra")
@RequiredArgsConstructor
public class OrdenCompraCossioFabrizioController {
	
	private final OrdenCompraCossioFabrizioService ordenCompraCossioFabrizioService;
	private final ProveedorCossioFabrizioService proveedorCossioFabrizioService;
	
	
	@GetMapping("listado")
	public String listado(Model model) {
		model.addAttribute("lst_ordenes", ordenCompraCossioFabrizioService.getAll());
		return "OrdenCompra/listadoCossioFabrizio";
	}
	
	@GetMapping("nuevo")
	public String nuevo(Model model) {
		model.addAttribute("lst_proveedor", proveedorCossioFabrizioService.getAll());
		model.addAttribute("orden", new OrdenCompraCossioFabrizio());
		return "OrdenCompra/nuevoCossioFabrizio";
	}
	
	@PostMapping("registrar")
	public String registrar(@ModelAttribute OrdenCompraCossioFabrizio ordenCompraCossioFabrizio, RedirectAttributes flash) {
		
		var response = ordenCompraCossioFabrizioService.create(ordenCompraCossioFabrizio);
		flash.addFlashAttribute("alert", Alert.sweetToast(response.mensaje(), "success", 3000));
		return "redirect:/OrdenCompra/listado";
	}

}
