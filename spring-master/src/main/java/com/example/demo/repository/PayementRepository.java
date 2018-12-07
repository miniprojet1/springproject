package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Fournisseur;
import com.example.demo.model.Payement;
public interface PayementRepository extends JpaRepository<Payement,Integer>  {

}
