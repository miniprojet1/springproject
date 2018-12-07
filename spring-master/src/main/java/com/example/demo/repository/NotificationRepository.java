package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Article;
import com.example.demo.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification,Integer> {
	
 List<Notification> findBySeen(int seen);
}
