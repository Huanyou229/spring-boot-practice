package top.hyzhu.qasystem.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hyzhu.qasystem.entity.Question;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-13 16:59
 **/
@SpringBootTest
@Slf4j
class QuestionMapperTest {
    @Resource
    private QuestionMapper questionMapper;

    @Test
    void insertQuestion() {
        Question question = Question.builder()
                .userId(1L) // 假设用户 ID 为 1
                .title("测试问题")
                .content("这是一个测试问题。")
                .createTime(LocalDateTime.now())
                .build();

        questionMapper.insertQuestion(question);

        // 假设我们有一个方法来获取最近插入的问题以进行验证
        Question insertedQuestion = questionMapper.getLastInsertedQuestion(); // 需要根据实际情况实现此方法
        assertEquals(question.getTitle(), insertedQuestion.getTitle());
        assertEquals(question.getContent(), insertedQuestion.getContent());
        assertEquals(question.getUserId(), insertedQuestion.getUserId());
    }
}