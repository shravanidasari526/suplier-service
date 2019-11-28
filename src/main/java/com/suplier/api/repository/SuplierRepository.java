package com.suplier.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suplier.api.domain.Supliers;

@Repository
public interface SuplierRepository extends JpaRepository<Supliers, String>{
	public Supliers findBySuplierName(String suplierName);
}
