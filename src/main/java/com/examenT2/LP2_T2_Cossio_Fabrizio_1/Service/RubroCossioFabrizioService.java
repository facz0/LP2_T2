package com.examenT2.LP2_T2_Cossio_Fabrizio_1.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examenT2.LP2_T2_Cossio_Fabrizio_1.Repository.OrdenCompraCossioFabrizioRepository;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.Repository.RubroCossioFabrizioRepository;
import com.examenT2.LP2_T2_Cossio_Fabrizio_1.model.RubroCossioFabrizio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RubroCossioFabrizioService {
	
	private final RubroCossioFabrizioRepository rubroCossioFabrizioRepository;
	
	public List<RubroCossioFabrizio> getAll(){
		return rubroCossioFabrizioRepository.findAll();
	}

}
