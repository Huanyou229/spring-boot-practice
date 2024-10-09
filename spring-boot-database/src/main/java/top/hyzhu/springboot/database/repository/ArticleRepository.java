package top.hyzhu.springboot.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.hyzhu.springboot.database.entity.Article;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-08 14:27
 **/
public interface ArticleRepository  extends JpaRepository<Article,Long> {
}
