package com.saiyad.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CreditPeriod {

	@Id
	@GeneratedValue
	private int id;
	private int sc;
	private int gv;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSc() {
		return sc;
	}
	public void setSc(int sc) {
		this.sc = sc;
	}
	public int getGv() {
		return gv;
	}
	public void setGv(int gv) {
		this.gv = gv;
	}
	
}
