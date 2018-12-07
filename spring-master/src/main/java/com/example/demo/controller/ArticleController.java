package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dao.ArticleDao;
import com.example.demo.model.Article;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleDao ArticleDao;


        public ArticleDao getArticleDao() {
		return ArticleDao;
	}

	public void setArticleDao(ArticleDao ArticleDao) {
		this.ArticleDao = ArticleDao;
	}

		@RequestMapping("/Article")
        public List<Article> getAllArticles(){
           return ArticleDao.getArticle();
        }

        @RequestMapping("/Article/{id}")
        public Article getArticleById(@PathVariable int id){
            return ArticleDao.getArticle(id);
        }

        @RequestMapping(method = RequestMethod.POST,value="/Article")
        public void addArticle(@RequestBody Article player){
        	ArticleDao.addArticle(player);
        }
        @RequestMapping(method = RequestMethod.PUT,value="/Article")
            public void editArticle(@RequestBody Article player){
        	ArticleDao.editArticle(player);}
        @RequestMapping(method = RequestMethod.GET,value="/Article/update/{id}")
        public Article editArticle(@PathVariable int id){
    	return ArticleDao.updateQuantity(id);
    	}
    
        
        
    @RequestMapping(method = RequestMethod.DELETE,value="/Article/{id}")
    public void deleteArticle(@PathVariable int id){
    	ArticleDao.deleteArticle(id);
    }
}