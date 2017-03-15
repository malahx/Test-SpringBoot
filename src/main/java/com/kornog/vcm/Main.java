package com.kornog.vcm;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import com.kornog.vcm.dao.model.Vehicule;
import com.kornog.vcm.dto.model.VehiculeDTO;
import com.kornog.vcm.mapper.VehiculeMapper;
import com.kornog.vcm.service.VehiculeManager;

@RestController
@ComponentScan("com.kornog.vcm")
@EnableAutoConfiguration
@RequestMapping("/api")
public class Main {

	@Autowired
	VehiculeManager manager;

	@Autowired
	VehiculeMapper mapper = Mappers.getMapper(VehiculeMapper.class);

	@RequestMapping("/vehicules")
	List<VehiculeDTO> vehicules() {

		List<Vehicule> vehicules = manager.getVehicules();

		//return VehiculeMapper.INSTANCE.toVehiculeDTOs(vehicules);
		return mapper.toVehiculeDTOs(vehicules);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}
}