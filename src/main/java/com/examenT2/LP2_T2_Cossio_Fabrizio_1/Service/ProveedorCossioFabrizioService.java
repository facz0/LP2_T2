package com.examenT2.LP2_T2_Cossio_Fabrizio_1.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examenT2.LP2_T2_Cossio_Fabrizio_1.Repository.OrdenCompraCossioFabrizioRepository;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.Repository.ProveedorCossioFabrizioRepository;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.model.ProveedorCossioFabrizio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProveedorCossioFabrizioService {
	
	private final ProveedorCossioFabrizioRepository proveedorCossioFabrizioRepository;
	
	public List<ProveedorCossioFabrizio> getAll(){
		return proveedorCossioFabrizioRepository.findAll();
	}

}
