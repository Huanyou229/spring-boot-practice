package top.hyzhu.springboot.qa.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.springboot.qa.entity.Answer;
import top.hyzhu.springboot.qa.service.AnswerService;
import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-23 21:08
 **/

@RestController
@RequestMapping("/answers")
@AllArgsConstructor
public class AnswerController {

    private final AnswerService answerService;

    // 根据问题ID获取所有回答及回答者信息
    @GetMapping("/{questionId}")
    public ResponseEntity<?> getAnswersByQuestionId(@PathVariable Long questionId) {
        try {
            // 调用 service 获取所有回答及其回答者信息
            List<Answer> answers = answerService.getAnswersByQuestionId(questionId);
            if (answers != null && !answers.isEmpty()) {
                return ResponseEntity.ok(answers);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("该问题没有回答");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("服务器内部错误");
        }
    }
}