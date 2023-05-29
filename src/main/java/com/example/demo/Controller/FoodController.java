package com.example.demo.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Customer;
import com.example.demo.bean.Delivery;
import com.example.demo.bean.DeliveryCountDTO;
import com.example.demo.service.Foodservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/food")
public class FoodController {
   
	@Autowired
	private Foodservice fservice;
	
	@PostMapping("/create") // create
	public Customer create(@RequestBody @Valid Customer customer) {
		return fservice.create(customer);
	}
	@PostMapping("/del") // create
	public Delivery createdel(@RequestBody @Valid Delivery delivery) {
		return fservice.createdel(delivery);
	}
//	@GetMapping("/getall") // fetchalll
//	public List<Delivery> getdel() {
//		return fservice.getdel();
//	}
	/*@GetMapping("/getcount")//fetchalll
	public List<Integer>getcount(Integer id)
	{
    return fservice.getcount(id);
}*/
	//@GetMapping("/getcount/{del_id}")
    // List<Integer> getDeliveryCountPerId(@PathVariable Integer del_id){
	//return fservice.getDeliveryCountPerId(del_id);		
	
//@GetMapping("/getcount/{id}")
//public String getDeliveryCountPerId(@PathVariable Integer id) {
//int a = fservice.getDeliveryCountPerId(id);
//return "count of orders for the deliveryperson with id="+id+":"+a;
//}
	
	@GetMapping("/count")
    public ResponseEntity<Map<Integer, Long>> getDeliveryCount() {
        Map<Integer, Long> deliveryCount = fservice.getDeliveryCount();
        return ResponseEntity.ok(deliveryCount);
    }
}
