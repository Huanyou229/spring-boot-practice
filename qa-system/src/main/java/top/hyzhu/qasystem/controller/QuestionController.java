package top.hyzhu.qasystem.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.qasystem.Service.QuestionService;
import top.hyzhu.qasystem.entity.Question;
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

    @PostMapping("/create")
    public ResponseEntity<?> createQuestion(@RequestBody Question question, HttpSession session) {
        // 检查用户是否已登录
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("请先登录才能提交问题。");
        }

        // 设置用户 ID
        question.setUserId(userId);
        questionService.createQuestion(question);

        return ResponseEntity.ok("问题创建成功！");
    }
}
