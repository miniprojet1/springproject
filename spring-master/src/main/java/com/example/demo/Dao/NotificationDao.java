package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Article;
import com.example.demo.model.Notification;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.NotificationRepository;




@Service
public class NotificationDao {
	@Autowired
	private NotificationRepository NotificationRepository;
	
	 public Notification addNotification(Notification n){
		return NotificationRepository.save(n);
	 }
	 
	 public List<Notification> findBySeen(int seen){
		 return NotificationRepository.findBySeen(seen);
	 }
	 
	 public void updateSeen(Notification n){
		 
		Notification notification  = NotificationRepository.findById(n.getId()).get();
		notification.setSeen(1);
		NotificationRepository.save(notification);
	 }

}
