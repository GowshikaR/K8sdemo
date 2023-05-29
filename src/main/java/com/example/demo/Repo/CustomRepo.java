package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Customer;


public interface CustomRepo extends JpaRepository <Customer , Long> {

}
