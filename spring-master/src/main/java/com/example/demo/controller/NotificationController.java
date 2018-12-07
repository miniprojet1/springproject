package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.ArticleDao;
import com.example.demo.model.Article;
import com.example.demo.model.Notification;

@RestController
public class NotificationController {
	 @Autowired
	 private com.example.demo.Dao.NotificationDao NotificationDao;

	public com.example.demo.Dao.NotificationDao getNotificationDao() {
		return NotificationDao;
	}

	public void setNotificationDao(com.example.demo.Dao.NotificationDao notificationDao) {
		NotificationDao = notificationDao;
	}
	 
	
	 @RequestMapping(method = RequestMethod.POST,value="/Notification")
     public Notification addNotification(@RequestBody Notification n){
		return NotificationDao.addNotification(n);
     }
	 
	 
	 @RequestMapping(method = RequestMethod.GET,value="/Notification/{seen}")
     public List<Notification> addNotification(@PathVariable int seen){
		return NotificationDao.findBySeen(seen);
     }
	 
	 @RequestMapping(method = RequestMethod.POST,value="/Notification/update")
     public List<Notification> updateNotification(@RequestBody List<Notification> n){
		for (Notification not : n) {
			NotificationDao.updateSeen(not);
		}
		return n;
     }
	 
	 
}
