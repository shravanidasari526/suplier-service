package com.suplier.api.domain;

import java.util.List;

public class SuplierModel {

	private Supliers suplier;
	private List<Products> product;
	
	public SuplierModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuplierModel(Supliers suplier, List<Products> product) {
		super();
		this.suplier = suplier;
		this.product = product;
	}

	public Supliers getSuplier() {
		return suplier;
	}

	public void setSuplier(Supliers suplier) {
		this.suplier = suplier;
	}

	public List<Products> getProduct() {
		return product;
	}

	public void setProduct(List<Products> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "SuplierModel [suplier=" + suplier + ", product=" + product + "]";
	}

}
