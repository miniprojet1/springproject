package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Panier;
public interface PanierRepository extends JpaRepository<Panier,Integer>  {
	List<Panier> findByIdclient(int idclient); 

}
