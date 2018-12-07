package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dao.CommissionerService;
import com.example.demo.model.Commissioner;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommissionerController {

    @Autowired
    private CommissionerService commissionerService;


        public CommissionerService getCommissionerService() {
		return commissionerService;
	}

	public void setCommissionerService(CommissionerService commissionerService) {
		this.commissionerService = commissionerService;
	}

		@RequestMapping("/commissioner")
        public List<Commissioner> getAllCommissioners(){
           return commissionerService.getCommissioners();
        }

        @RequestMapping("/commissioner/{id}")
        public Commissioner getCommissionerById(@PathVariable int id){
            return commissionerService.getCommissioner(id);
        }

        @RequestMapping(method = RequestMethod.POST,value="/commissioner")
        public void addCommissioner(@RequestBody Commissioner player){
        	commissionerService.addCommissioner(player);
        }
        @RequestMapping(method = RequestMethod.PUT,value="/commissioner/{id}")
            public void editCommissioner(@RequestBody Commissioner player,@PathVariable int id){
        	commissionerService.editCommissioner(player,id);
            }
        
        @RequestMapping("/commissioner/{login}/{password}")
        public int getidpass(@PathVariable String login, @PathVariable String password){
            return commissionerService.finbyidpas(login, password);
        }
        
        @RequestMapping("/co/{login}/{password}")
        public Commissioner getlogin(@PathVariable String login, @PathVariable String password){
            Commissioner c =  commissionerService.finbylogin(login, password);
            System.out.println(c);
            if(c == null) {
            	return new Commissioner();
            }
            
            return c;
        }
        
        
        
    @RequestMapping(method = RequestMethod.DELETE,value="/commissioner/{id}")
    public void deleteCommissioner(@PathVariable int id){
    	commissionerService.deleteCommissioner(id);
    }
}