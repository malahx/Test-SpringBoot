package com.kornog.vcm.websocket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.kornog.vcm.dao.model.Vehicule;
import com.kornog.vcm.dto.model.VehiculeDTO;
import com.kornog.vcm.mapper.VehiculeMapper;
import com.kornog.vcm.service.VehiculeManager;

@Controller
public class VehiculeController {

	@Autowired
	VehiculeManager manager;

	@Autowired
	VehiculeMapper mapper;

	@MessageMapping("/ws")
	@SendTo("/topic/vehicules")
	public List<VehiculeDTO> wsVehicules(VehiculeDTO v) throws Exception {

		manager.addVehicule(mapper.toVehicule(v));
		
		Thread.sleep(1000); // simulated delay

		List<Vehicule> vehicules = manager.getVehicules();

		return mapper.toVehiculeDTOs(vehicules);
	}
}
