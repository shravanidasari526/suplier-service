package com.suplier.api.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.suplier.api.client.SuplierServiceClient;
import com.suplier.api.domain.Products;
import com.suplier.api.domain.SuplierModel;
import com.suplier.api.domain.Supliers;
import com.suplier.api.service.SuplierService;
@RestController
@RequestMapping("/suplier")
public class SupliersController {
	@Autowired
	private SuplierService suplierService;
	
	@Autowired
	private SuplierServiceClient suplierServiceClient;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/create")
	public void createSuplier(@RequestBody Supliers suplier){
		suplierService.createSuplier(suplier);
	}
	@GetMapping("/findById/{suplierCode}")
	public Supliers findSuplierById(@PathVariable String suplierCode) {
		return suplierService.findSuplierById(suplierCode);
	}
	
	@GetMapping("/findBySuplierName/{firstName}")
	public Supliers findSuplierBySuplierName(@PathVariable String suplierName) {
		return suplierService.findSuplierBySuplierName(suplierName);
	}
	@GetMapping("/findAll")
	public List<Supliers> findAllSupliers(){
		List<Supliers> suplierList = suplierService.findAllSupliers();
		return suplierList;
	}
	@GetMapping("/rest/get/{suplierCode}")
	public SuplierModel findSuplierByIdRest(@PathVariable String suplierCode) {
		List<Products> products = restTemplate.getForObject("http://product-service/product/getProductsBySuplierCode/"+suplierCode, List.class);
		Supliers suplier =suplierService.findSuplierById(suplierCode);
		SuplierModel suplierModel = new SuplierModel();
		suplierModel.setProduct(products); 
		suplierModel.setSuplier(suplier);
		return suplierModel;
	}
	
	@GetMapping("/getSuplierProducts/{suplierCode}")
	public SuplierModel findSuplierProducts(@PathVariable String suplierCode) {
		
		Supliers suplier =suplierService.findSuplierById(suplierCode);
		List<Products> products = suplierServiceClient.getSuplierProducts(suplierCode);
		SuplierModel suplierModel = new SuplierModel();
		suplierModel.setProduct(products); 
		suplierModel.setSuplier(suplier);
		return suplierModel;
	}
	
}
