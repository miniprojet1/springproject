package com.example.demo.Dao;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.Article;
import com.example.demo.model.Commissioner;
import com.example.demo.repository.ArticleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleDao {

    @Autowired
    private ArticleRepository ArticleRepository;



    public List<Article> getArticle() {
        List<Article> lp=new ArrayList<>();
        ArticleRepository.findAll()
                .forEach(lp::add);
        return lp;
    }

    public Article getArticle(int id){
       
        return ArticleRepository.findById(id).get();

    }

    public void addArticle(Article player){
    	ArticleRepository.save(player);
    }

    public void editArticle(Article player) {

    	ArticleRepository.save(player);
    }

    public void deleteArticle(int id) {

    	ArticleRepository.deleteById(id);
    }
    
    public Article updateQuantity(int id) {
    	Article a = ArticleRepository.findById(id).get();
    	a.setQte_article(a.getQte_article()-1);
    	return ArticleRepository.save(a);
    }
}	