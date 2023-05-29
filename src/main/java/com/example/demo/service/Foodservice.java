package com.example.demo.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Repo.CustomRepo;
import com.example.demo.Repo.DelRepo;
import com.example.demo.bean.Customer;
import com.example.demo.bean.Delivery;
import com.example.demo.bean.DeliveryCountDTO;

import jakarta.validation.Valid;




@Service
@Component
public class Foodservice {
	@Autowired
    private CustomRepo repo1;
	
	@Autowired
    private DelRepo repo2;
	
	public Customer create(Customer customer) {
		 return  repo1.save(customer);
       
  }

	public Delivery createdel(@Valid Delivery delivery) {
		
		return repo2.save(delivery);
	}
//	public List<Delivery>getdel(){
//		 return  repo2.findAll();
//        
//	}
//	public Integer getDeliveryCountPerId1(Integer del_id){
//		
//		return repo2.getDeliveryCountPerId(del_id);
//		
//	}
	
//	public Integer getDeliveryCountPerId(Integer id) {
//		return repo2.getDeliveryCountPerId(id);
//	}

	
	public Map<Integer, Long> getDeliveryCount() { 
		  List<Object[]> results = repo2.getDeliveryCount(); 
		  Map< Integer,Long> deliveryCount = new HashMap<>(); 
		  for (Object[] result : results) { 
		    deliveryCount.put((Integer) ((Number) result[0]).intValue(), (Long) result[1]); 
		  } 
		  return deliveryCount; 
		}

	
	
}
