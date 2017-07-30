package com.work.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Booking 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	private double grandTotal;
	
	@OneToOne
	@JoinColumn(name="tourist_id")
	private Tourist tourist;
	@OneToMany(mappedBy="booking", fetch=FetchType.EAGER)
	private List<BookTour> bookTours;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public Tourist getTourist() {
		return tourist;
	}
	public void setTourist(Tourist tourist) {
		this.tourist = tourist;
	}
	public List<BookTour> getBookTours() {
		return bookTours;
	}
	public void setBookTours(List<BookTour> bookTours) {
		this.bookTours = bookTours;
	}
	
	
}
