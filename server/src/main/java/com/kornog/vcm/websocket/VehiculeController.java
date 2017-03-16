package com.kornog.vcm.websocket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.kornog.vcm.dao.model.Vehicule;
import com.kornog.vcm.dto.model.VehiculeDTO;
import com.kornog.vcm.mapper.VehiculeMapper;
import com.kornog.vcm.service.VehiculeManager;

@Controller
public class VehiculeController {
	
	final String TOPIC_VEHICULES = "/topic/vehicules";
	final String WS_ADD_VEHICULE = "/addVehicule";

	@Autowired
	VehiculeManager manager;

	@Autowired
	VehiculeMapper mapper;
	
    @Autowired
    SimpMessagingTemplate template;

	@MessageMapping(WS_ADD_VEHICULE)
	@SendTo(TOPIC_VEHICULES)
	public List<VehiculeDTO> addVehicule(VehiculeDTO v) throws Exception {
		manager.addVehicule(mapper.toVehicule(v));
		List<Vehicule> vehicules = manager.getVehicules();
		return mapper.toVehiculeDTOs(vehicules);
	}
    @Scheduled(fixedRate = 5000)
    public void publishUpdates(){
		List<Vehicule> vehicules = manager.getVehicules();
        template.convertAndSend(TOPIC_VEHICULES, mapper.toVehiculeDTOs(vehicules));
    }
}
