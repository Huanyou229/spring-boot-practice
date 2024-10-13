package top.hyzhu.qasystem.controller;

import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.qasystem.Service.AnswerService;
import top.hyzhu.qasystem.entity.Answer;

import java.util.List;

/**
 * @Author: zhy
 * @Description: AnswerController
 * @Date: 2024-10-12 21:45
 **/
@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Resource
    private AnswerService answerService;

    @GetMapping("/question/{questionId}")
    public ResponseEntity<List<Answer>> getAnswersByQuestionId(@PathVariable Long questionId) {
        return ResponseEntity.ok(answerService.getAnswersByQuestionId(questionId));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createAnswer(@RequestBody Answer answer) {
        answerService.createAnswer(answer);
        return ResponseEntity.ok("Answer created successfully");
    }
}

