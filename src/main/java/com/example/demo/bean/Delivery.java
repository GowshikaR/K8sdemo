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
public class Delivery {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Integer id;
  
    private String deliveryperson;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "cd_Info",
            joinColumns = { @JoinColumn(name = "del_id")},
            inverseJoinColumns = { @JoinColumn(name = "custom_id") })
	
	private Set<Customer>customer;

	public Delivery(Integer id, String deliveryperson,Set<Customer> customer) {
		super();
		this.id = id;
		this.customer = customer;
		this.deliveryperson = deliveryperson;
		
	}

   public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeliveryperson() {
		return deliveryperson;
	}

	public void setDeliveryperson(String deliveryperson) {
		this.deliveryperson = deliveryperson;
	}
	

	public Set<Customer> getCustomer() {
		return customer;
	}



	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}



	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

