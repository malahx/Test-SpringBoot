package com.kornog.vcm.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.springframework.stereotype.Repository;

import com.kornog.vcm.dao.model.Vehicule;

@Repository("vehiculeDao")
public class VehiculeDAOImpl implements VehiculeDAO {

	private List<Vehicule> vehicules = new ArrayList<>();

	@Override
	public List<Vehicule> findAll() {
		return vehicules;
	}

	@Override
	public void insert(Vehicule v) {
		vehicules.add(v);
	}

}
