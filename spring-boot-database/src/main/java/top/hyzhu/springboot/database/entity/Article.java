package top.hyzhu.springboot.database.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-08 14:23
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="t_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 32)
    private String author;

    @Column(nullable = false,unique = true, length = 32)
    private String  title;

    @Column(length = 512)
    private String content;


}
