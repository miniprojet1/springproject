package com.example.demo.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Panier;

import com.example.demo.repository.PanierRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PanierDao {

    @Autowired
    private PanierRepository PanierRepository;



    public List<Panier> getPanier() {
        List<Panier> lp=new ArrayList<>();
        PanierRepository.findAll()
                .forEach(lp::add);
        return lp;
    }

    public List<Panier> getPanier(int id){
       
        return PanierRepository.findByIdclient(id);

    }

    public void addPanier(Panier player){
    	PanierRepository.save(player);
    }

    public void editPanier(Panier player) {

    	PanierRepository.save(player);
    }

    public void deletePanier(int id) {

    	PanierRepository.deleteById(id);
    }
}	