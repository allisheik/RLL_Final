package com.RLL.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@EnableTransactionManagement
public class book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int ticketsno;
	private int amount;
	private String dob;	
	
	public book() {
		super();
	}



	public book(int id, int ticketsno, int amount, String dob) {
		super();
		this.id = id;
		this.ticketsno = ticketsno ;
		this.amount = amount ;
		this.dob = dob ;
	}

	public int getTicketsno() {
		return ticketsno;
	}



	public void setTicketsno(int ticketsno) {
		this.ticketsno = ticketsno;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}
		
}