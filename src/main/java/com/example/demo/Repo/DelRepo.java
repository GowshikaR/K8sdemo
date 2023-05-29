package com.example.demo.Repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.bean.Delivery;
import com.example.demo.bean.DeliveryCountDTO;

import jakarta.transaction.Transactional;

public interface DelRepo extends JpaRepository <Delivery ,Integer> {
	//@Query(value = "SELECT * FROM CD_INFO", nativeQuery = true)
	//List<Long> findDeliveryCount(Long id); 

	@Transactional
	@Modifying
	@Query(value = "SELECT del_id, COUNT(*) FROM cd_info GROUP BY del_id",nativeQuery = true)
	  List<Object[]> getDeliveryCount();
	


//@Query(value = "select count(del_id) from cd_Info where del_id=:del_id", nativeQuery = true)
//	public Integer getDeliveryCountPerId(@Param("del_id")Integer id);
	
	
//	@Query(value = "SELECT  COUNT(DEL_ID) FROM CD_INFO GROUP BY DEL_ID;",nativeQuery = true)
//                           List<Integer> findDeliveryCount(Integer id);


}

