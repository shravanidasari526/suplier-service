package com.suplier.api.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suplier.api.domain.Supliers;
import com.suplier.api.repository.SuplierRepository;
import com.suplier.api.service.SuplierService;

@Service
public class SuplierServiceImpl implements SuplierService{

	@Autowired
	private SuplierRepository suplierRepository;

	@Override
	public void createSuplier(Supliers suplier) {
		suplierRepository.save(suplier);
	}

	@Override
	public Supliers findSuplierById(String suplierCode) {
		Supliers suplier = suplierRepository.findById(suplierCode).get();
		return suplier;
	}

	@Override
	public Supliers findSuplierBySuplierName(String suplierName) {
		Supliers suplier = new Supliers();
		suplier = suplierRepository.findBySuplierName(suplierName);
		return suplier;
	}

	@Override
	public List<Supliers> findAllSupliers() {
		List<Supliers> suplierList = new ArrayList<>();
		suplierList = suplierRepository.findAll();
		return suplierList;
	}
	
}
