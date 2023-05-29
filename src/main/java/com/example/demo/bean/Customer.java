package com.example.demo.bean;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Customer {
	  @Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
      private String Foodname;
      @ManyToMany(fetch = FetchType.LAZY,
              cascade = {
                  CascadeType.PERSIST,
                  CascadeType.MERGE
              },
              mappedBy = "customer")
      private Set <Delivery> delivery;

	public Customer(Integer id, String foodname ) {
		super();
		this.id = id;
		this.Foodname = foodname;
		//this.delivery = delivery;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFoodname() {
		return Foodname;
	}

	public void setFoodname(String foodname) {
		Foodname = foodname;
	}

//	public List<Delivery> getDelivery() {
//		return delivery;
//	}
//
//	public void setDelivery(List<Delivery> delivery) {
//		this.delivery = delivery;
//	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
      
      
}
