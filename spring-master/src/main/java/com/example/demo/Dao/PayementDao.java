package com.example.demo.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payement;
import com.example.demo.model.Commissioner;
import com.example.demo.repository.PayementRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PayementDao {

    @Autowired
    private PayementRepository PayementRepository;



    public List<Payement> getPayement() {
        List<Payement> lp=new ArrayList<>();
        PayementRepository.findAll()
                .forEach(lp::add);
        return lp;
    }

    public Payement getPayement(int id){
       
        return PayementRepository.findById(id).get();

    }

    public void addPayement(Payement player){
    	PayementRepository.save(player);
    }

    public void editPayement(Payement player) {

    	PayementRepository.save(player);
    }

    public void deletePayement(int id) {

    	PayementRepository.deleteById(id);
    }
}	