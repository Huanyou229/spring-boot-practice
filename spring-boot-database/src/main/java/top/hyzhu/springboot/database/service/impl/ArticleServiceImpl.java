package top.hyzhu.springboot.database.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.hyzhu.springboot.database.entity.Article;
import top.hyzhu.springboot.database.repository.ArticleRepository;
import top.hyzhu.springboot.database.service.ArticleService;

import java.util.List;
import java.util.Optional;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-08 14:30
 **/
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleRepository articleRepository;

    @Override
    public Article saveArticle(Article article) {
        articleRepository.save(article);
        return article;
    }

    @Override
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);

    }

    @Override
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public Article getArticle(Long id) {
        Optional<Article> optionalArticle = articleRepository.findById(id);
        return optionalArticle.orElse(null);

    }

    @Override
    public List<Article> getAll() {
        return articleRepository.findAll();
    }
}
