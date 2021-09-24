package br.com.danimlds.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Double daily_Income;
	private Integer days;
	
	public Payment() {
		
	}
	
	public Payment(String name, Double daily_Income, Integer days) {
		super();
		this.name = name;
		this.daily_Income = daily_Income;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDaily_Income() {
		return daily_Income;
	}

	public void setDaily_Income(Double daily_Income) {
		this.daily_Income = daily_Income;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public double getTotal() {
		return days * daily_Income;
	}
	
}
