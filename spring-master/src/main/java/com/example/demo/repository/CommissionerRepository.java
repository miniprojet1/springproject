package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.Commissioner;
import com.example.demo.model.Employe;

public interface CommissionerRepository extends PagingAndSortingRepository<Commissioner,Integer>  {
	
	int countByLoginAndPassword(String login,String password);
	Commissioner findByLoginAndPassword(String login,String password);


 
	
}
