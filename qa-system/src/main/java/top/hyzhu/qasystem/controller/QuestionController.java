package top.hyzhu.qasystem.controller;

import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.qasystem.Service.QuestionService;
import top.hyzhu.qasystem.entity.Question;

import java.util.List;

/**
 * @Author: zhy
 * @Description: QuestionController
 * @Date: 2024-10-12 21:42
 **/
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Resource
    private QuestionService questionService;

    @GetMapping("/all")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable Long id) {
        return ResponseEntity.ok(questionService.getQuestionById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createQuestion(@RequestBody Question question) {
        questionService.createQuestion(question);
        return ResponseEntity.ok("Question created successfully");
    }
}
