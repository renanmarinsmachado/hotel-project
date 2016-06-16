package br.com.logatti.project.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Period {

	public Period() {
	}
	
	public Period(Long id) {
		this.id = id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String entryDate;
	
	private String endDate;
	
	private Boolean paymentStatus;

	@Fetch(FetchMode.JOIN)
	@ManyToOne(fetch=FetchType.EAGER)
	private Client client;
	
	@Fetch(FetchMode.JOIN)
	@ManyToOne(fetch=FetchType.EAGER)
	private Room room;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Boolean getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Period [id=" + id + ", entryDate=" + entryDate + ", endDate=" + endDate + ", paymentStatus="
				+ paymentStatus + ", client=" + client + ", room=" + room + "]";
	}
}
