package com.suplier.api.service;

import java.util.List;

import com.suplier.api.domain.Supliers;


public interface SuplierService {
	public void createSuplier(Supliers suplier);
	
	public Supliers findSuplierById(String suplierCode);
	
	public Supliers findSuplierBySuplierName(String suplierName);
	
	public List<Supliers> findAllSupliers();
}
