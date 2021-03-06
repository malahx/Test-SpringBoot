package com.kornog.vcm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kornog.vcm.dao.model.Vehicule;
import com.kornog.vcm.dto.model.VehiculeDTO;
import com.kornog.vcm.mapper.VehiculeMapper;
import com.kornog.vcm.service.VehiculeManager;

@RestController
@ComponentScan("com.kornog.vcm")
@EnableAutoConfiguration
@EnableScheduling
@RequestMapping("/api")
public class Main {

	@Autowired
	VehiculeManager manager;

	@Autowired
	VehiculeMapper mapper;

	@CrossOrigin(origins = "*")
	@GetMapping("/vehicules")
	List<VehiculeDTO> vehicules() {

		List<Vehicule> vehicules = manager.getVehicules();

		// return VehiculeMapper.INSTANCE.toVehiculeDTOs(vehicules);
		return mapper.toVehiculeDTOs(vehicules);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}
}