package com.kornog.vcm.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.kornog.vcm.dao.model.Vehicule;
import com.kornog.vcm.dto.model.VehiculeDTO;

@Mapper(componentModel = "spring")
public interface VehiculeMapper {
	
	  //VehiculeMapper INSTANCE = Mappers.getMapper(VehiculeMapper.class);
	
	
      VehiculeDTO ToVehiculeDTO(Vehicule vehicule);
	  
	
      Vehicule toVehicule(VehiculeDTO vehiculeDTO);
	  
	
      List<Vehicule> toVehicules(List<VehiculeDTO> vehiculeDTOs);
	  
	
      List<VehiculeDTO> toVehiculeDTOs(List<Vehicule> vehicules);
}
