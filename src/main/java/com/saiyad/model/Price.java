package com.saiyad.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Price {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="show_name")
	private String show;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date winningDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date creditDate;
	private boolean credited;
	
	@Column(name="price_type")
	private String type;

	private int amount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getShow() {
		return show;
	}
	public void setShow(String show) {
		this.show = show;
	}
	public Date getWinningDate() {
		return winningDate;
	}
	public void setWinningDate(Date winningDate) {
		this.winningDate = winningDate;
	}
	public Date getCreditDate() {
		return creditDate;
	}
	public void setCreditDate(Date creditDate) {
		this.creditDate = creditDate;
	}
	public boolean isCredited() {
		return credited;
	}
	public void setCredited(boolean credited) {
		this.credited = credited;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}
