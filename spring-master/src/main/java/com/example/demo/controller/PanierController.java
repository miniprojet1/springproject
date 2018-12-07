package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dao.PanierDao;
import com.example.demo.model.Panier;

import java.util.List;

@RestController
public class PanierController {

    @Autowired
    private PanierDao PanierDao;


        public PanierDao getPanierDao() {
		return PanierDao;
	}

	public void setPanierDao(PanierDao PanierDao) {
		this.PanierDao = PanierDao;
	}

		@RequestMapping("/Panier")
        public List<Panier> getAllPaniers(){
           return PanierDao.getPanier();
        }

        @RequestMapping("/Panier/{id}")
        public List<Panier> getPanierById(@PathVariable int id){
            return PanierDao.getPanier(id);
        }

        @RequestMapping(method = RequestMethod.POST,value="/Panier")
        public void addPanier(@RequestBody Panier player){
        	System.out.println("*********");
        	PanierDao.addPanier(player);
        }
        @RequestMapping(method = RequestMethod.PUT,value="/Panier")
            public void editPanier(@RequestBody Panier player){
        	PanierDao.editPanier(player);}
    
        
        
    @RequestMapping(method = RequestMethod.DELETE,value="/Panier/{id}")
    public void deletePanier(@PathVariable int id){
    	PanierDao.deletePanier(id);
    }
}