package top.hyzhu.springboot.database.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hyzhu.springboot.database.entity.Article;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-08 14:34
 **/
@SpringBootTest
@Slf4j
class ArticleServiceTest {
@Resource
private ArticleService articleService;
    @Test
    void saveArticle() {
        Article article = Article.builder()
                .title("SpringBoot")
                .author("张三")
                .content("SpringBoot从入门到精通")
                .build();
        Article saveArticle = articleService.saveArticle(article);
        log.info(String.valueOf(saveArticle));
    }

    @Test
    void deleteArticle() {
        articleService.deleteArticle(2L);
    }

    @Test
    void updateArticle() {
        Article article = articleService.getArticle(2L);
        article.setTitle("SpringBoot111222");
        articleService.updateArticle(article);
    }

    @Test
    void getArticle() {
        Article article = articleService.getArticle(2L);
        log.info(String.valueOf(article));
    }

    @Test
    void getAll() {
        articleService.getAll().forEach(System.out::println);
    }
}