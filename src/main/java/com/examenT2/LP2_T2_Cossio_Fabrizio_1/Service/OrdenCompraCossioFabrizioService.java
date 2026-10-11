package com.examenT2.LP2_T2_Cossio_Fabrizio_1.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examenT2.LP2_T2_Cossio_Fabrizio_1.dto.ResultadoResponse;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.Repository.OrdenCompraCossioFabrizioRepository;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.model.OrdenCompraCossioFabrizio;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.experimental.var;

@Service
@RequiredArgsConstructor
public class OrdenCompraCossioFabrizioService {
	
	private final OrdenCompraCossioFabrizioRepository ordenCompraCossioFabrizioRepository;
	
	public List<OrdenCompraCossioFabrizio> getAll() {
		
		return ordenCompraCossioFabrizioRepository.findAll();
		
	}
	
	@Transactional
	public ResultadoResponse create(OrdenCompraCossioFabrizio ordenCompraCossioFabrizio) {
		
		try {
			var registrado = ordenCompraCossioFabrizioRepository.save(ordenCompraCossioFabrizio);
			var mensaje = String.format("Orden con Id %d registrado", registrado.getNroOrden());
			return new ResultadoResponse(true, mensaje);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultadoResponse(false, "Hubo un error en la transacción");
		}		
	}

}
