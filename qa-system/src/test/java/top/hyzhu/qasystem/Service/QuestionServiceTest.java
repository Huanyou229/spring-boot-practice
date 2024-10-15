package top.hyzhu.qasystem.Service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hyzhu.qasystem.entity.Question;
import top.hyzhu.qasystem.mapper.QuestionMapper;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-13 16:40
 **/
@SpringBootTest
@Slf4j
class QuestionServiceTest {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionMapper questionMapper;

    @Test
    void createQuestion() {
            Long userId = 2L; // 假设用户 ID 为 1
            Question question = Question.builder()
                    .userId(userId)
                    .title("测试问题222")
                    .content("这是一个测试问题222。")
                    .createTime(LocalDateTime.now())
                    .build();

            // 创建问题
            questionService.createQuestion(question);

            // 验证问题是否成功插入数据库
            Question insertedQuestion = questionMapper.getLastInsertedQuestion(); // 需要根据实际情况实现此方法
            assertNotNull(insertedQuestion);
            assertEquals(question.getTitle(), insertedQuestion.getTitle());
            assertEquals(question.getContent(), insertedQuestion.getContent());
            assertEquals(question.getUserId(), insertedQuestion.getUserId());
    }
}