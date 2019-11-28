package com.suplier.api.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supliers")
public class Supliers implements Serializable{

	private static final long serialVersionUID = -5807153938169519827L;
	
	@Id
	private String suplierCode;
	private String suplierName;
	private String suplierFirstName;
	private String suplierLastName;
	public Supliers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Supliers(String suplierCode, String suplierName, String suplierFirstName, String suplierLastName) {
		super();
		this.suplierCode = suplierCode;
		this.suplierName = suplierName;
		this.suplierFirstName = suplierFirstName;
		this.suplierLastName = suplierLastName;
	}
	public String getsuplierCode() {
		return suplierCode;
	}
	public void setsuplierCode(String suplierCode) {
		this.suplierCode = suplierCode;
	}
	public String getSuplierName() {
		return suplierName;
	}
	public void setSuplierName(String suplierName) {
		this.suplierName = suplierName;
	}
	public String getSuplierFirstName() {
		return suplierFirstName;
	}
	public void setSuplierFirstName(String suplierFirstName) {
		this.suplierFirstName = suplierFirstName;
	}
	public String getSuplierLastName() {
		return suplierLastName;
	}
	public void setSuplierLastName(String suplierLastName) {
		this.suplierLastName = suplierLastName;
	}
	@Override
	public String toString() {
		return "Supliers [suplierCode=" + suplierCode + ", suplierName=" + suplierName + ", suplierFirstName="
				+ suplierFirstName + ", suplierLastName=" + suplierLastName + "]";
	}

	
}
