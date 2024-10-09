package top.hyzhu.springboot.database.service;

import top.hyzhu.springboot.database.entity.Article;

import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-08 14:28
 **/
public interface ArticleService {
    Article saveArticle(Article article);

    void deleteArticle(Long id);

    void updateArticle(Article article);

    Article getArticle(Long id);

    List<Article> getAll();
}
