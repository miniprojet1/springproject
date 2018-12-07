package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dao.PayementDao;
import com.example.demo.model.Payement;

import java.util.List;

@RestController

public class PayementController {

    @Autowired
    private PayementDao PayementDao;


        public PayementDao getPayementDao() {
		return PayementDao;
	}

	public void setPayementDao(PayementDao PayementDao) {
		this.PayementDao = PayementDao;
	}
		@RequestMapping("/Payement")
        public List<Payement> getAllPayements(){
           return PayementDao.getPayement();
        }

        @RequestMapping("/Payement/{id}")
        public Payement getPayementById(@PathVariable int id){
            return PayementDao.getPayement(id);
        }

        @RequestMapping(method = RequestMethod.POST,value="/Payement")
        public void addPayement(@RequestBody Payement player){
        	PayementDao.addPayement(player);
        }
        @RequestMapping(method = RequestMethod.PUT,value="/Payement")
            public void editPayement(@RequestBody Payement player){
        	PayementDao.editPayement(player);
            }
    @RequestMapping(method = RequestMethod.DELETE,value="/Payement/{id}")
    public void deletePayement(@PathVariable int id){
    	PayementDao.deletePayement(id);
    }
}