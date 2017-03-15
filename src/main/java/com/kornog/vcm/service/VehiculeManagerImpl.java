package com.kornog.vcm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kornog.vcm.dao.VehiculeDAO;
import com.kornog.vcm.dao.model.Vehicule;

@Service ("vehiculeManager")
public class VehiculeManagerImpl implements VehiculeManager {

    @Autowired
    VehiculeDAO dao;
	
	@Override
	public List<Vehicule> getVehicules() {
		return dao.findAll();
	}

	@Override
	public boolean addVehicule(Vehicule v) {
		dao.insert(v);
		return true;
	}

}
