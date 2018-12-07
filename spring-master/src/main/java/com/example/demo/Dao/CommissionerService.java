package com.example.demo.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;
import org.springframework.stereotype.Service;

import com.example.demo.model.Commissioner;
import com.example.demo.repository.CommissionerRepository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class CommissionerService {

    @Autowired
    private CommissionerRepository commissionerRepository;
    @PersistenceContext
    private EntityManager em ;
 

 

    public List<Commissioner> getCommissioners() {
        List<Commissioner> lp=new ArrayList<>();
        commissionerRepository.findAll()
                .forEach(lp::add);
        return lp;
    }

    public Commissioner getCommissioner(int id){
       
        return commissionerRepository.findById(id).get();

    }

    public void addCommissioner(Commissioner player){
    	commissionerRepository.save(player);
    }
    public int finbyidpas(String login , String password){
    	int c = commissionerRepository.countByLoginAndPassword(login, password);
    	return c;
    	

    	
    	
    	
    	
    }
    public Commissioner finbylogin(String login , String password){
    	Commissioner c = commissionerRepository.findByLoginAndPassword(login, password);
    	return c; 
    	

    	
    	
    	
    	
    }


    public void editCommissioner(Commissioner player, int id) {

    	commissionerRepository.save(player);
    }

    public void deleteCommissioner(int id) {

    	commissionerRepository.deleteById(id);
    }
}	