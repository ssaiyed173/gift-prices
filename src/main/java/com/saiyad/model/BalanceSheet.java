package com.saiyad.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="balance_sheet")
public class BalanceSheet {

	@Id
	@GeneratedValue
	private long id;
	private int sc;
	private double gv;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getSc() {
		return sc;
	}
	public void setSc(int sc) {
		this.sc = sc;
	}
	public double getGv() {
		return gv;
	}
	public void setGv(double gv) {
		this.gv = gv;
	}
	
}
