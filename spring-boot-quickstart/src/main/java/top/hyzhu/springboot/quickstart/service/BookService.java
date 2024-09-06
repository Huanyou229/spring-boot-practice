package top.hyzhu.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.hyzhu.springboot.quickstart.dto.BookDTO;

import java.util.List;

/**
 * @Author: zhy
 * @Description: BookService
 * @Date: 2024-09-02 16:01
 **/
@Service
public class BookService {
    public List<BookDTO> getAllBooks() {
        return List.of(
                new BookDTO(1L, "Java Programming","Alice",29.99),
                new BookDTO(2L, "Spring Boot Action","Bob",39.99)
        );
    }
}
