package top.hyzhu.springboot.quickstart.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.quickstart.dto.BookDTO;
import top.hyzhu.springboot.quickstart.service.BookService;

import java.util.List;

/**
 * @Author: zhy
 * @Description: BookController
 * @Date: 2024-09-02 16:07
 **/
@RestController
@RequestMapping("/books")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping
    public List<BookDTO> getBooks() {
        return bookService.getAllBooks();
    }
}