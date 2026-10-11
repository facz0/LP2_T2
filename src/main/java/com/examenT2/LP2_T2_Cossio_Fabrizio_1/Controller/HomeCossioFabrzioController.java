package com.examenT2.LP2_T2_Cossio_Fabrizio_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCossioFabrzioController {
	
	@GetMapping("/")
	public String home() {
		return "redirect:/OrdenCompra/listado";
	}

}
