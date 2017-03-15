package com.kornog.vcm.mapper;
//
//import org.springframework.stereotype.Service;
//
//import com.kornog.dao.model.Vehicule;
//import com.kornog.dto.model.VehiculeDTO;
//
//@Service ("vehiculeMapper")
//public class VehiculeMapperImpl implements VehiculeMapper {
//
//	@Override
//	public VehiculeDTO vehiculeToVehiculeDTO(Vehicule v) {
//		if (v == null) {
//			return null;
//		}
//
//		VehiculeDTO vehiculeDTO = new VehiculeDTO();
//
//		vehiculeDTO.setImmat(v.getImmat());
//
//		return vehiculeDTO;
//	}
//
//	@Override
//	public Vehicule vehiculeDTOtoVehicule(VehiculeDTO v) {
//		if (v == null) {
//			return null;
//		}
//
//		Vehicule vehicule = new Vehicule();
//
//		vehicule.setImmat(v.getImmat());
//
//		return vehicule;
//	}
//
//}

//		List<VehiculeDTO> vehiculeDTOs = new ArrayList<>();
//
//		for (Vehicule v : vehicules) {
//			vehiculeDTOs.add(VehiculeMapper.INSTANCE.vehiculeToVehiculeDTO(v));
//		}
