package top.hyzhu.springboot.qa.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.springboot.qa.entity.Question;
import top.hyzhu.springboot.qa.service.QuestionService;
/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-23 20:03
 **/


@RestController
@RequestMapping("/questions")
@AllArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

//     查询问题详细信息，包含提问者信息
@GetMapping("/{id}")
public ResponseEntity<?> getQuestionDetails(@PathVariable Long id) {
    try {
        // 获取问题详情和提问者信息
        Question question = questionService.getQuestionWithUser(id);
        if (question != null) {
            return ResponseEntity.ok(question);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("问题不存在");
        }
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("服务器内部错误");
    }
}
}