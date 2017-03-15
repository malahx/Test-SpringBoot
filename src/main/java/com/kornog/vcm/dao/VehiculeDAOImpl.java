package com.kornog.vcm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kornog.vcm.dao.model.Vehicule;

@Repository ("vehiculeDao")
public class VehiculeDAOImpl implements VehiculeDAO {

	@Override
	public List<Vehicule> findAll() {
    	List<Vehicule> vehiculesList = new ArrayList<>();
    	vehiculesList.add(new Vehicule("000"));
    	vehiculesList.add(new Vehicule("001"));
    	vehiculesList.add(new Vehicule("002"));
        return vehiculesList;
	}

}
