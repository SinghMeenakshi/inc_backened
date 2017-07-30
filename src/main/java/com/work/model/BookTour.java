package com.work.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BookTour
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookTourId;
	
	@ManyToOne
	@JoinColumn(name="pack_id")
	private Pack pack;
	private int vacancy;
	private double totalPrice;
	
	@ManyToOne
	@JoinColumn(name="booking_id")
	private Booking booking;

	public int getBookTourId() {
		return bookTourId;
	}

	public void setBookTourId(int bookTourId) {
		this.bookTourId = bookTourId;
	}

	public Pack getPack() {
		return pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

	public int getVacancy() {
		return vacancy;
	}

	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	

}
