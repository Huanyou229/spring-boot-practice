package top.hyzhu.springboot.qa.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import top.hyzhu.springboot.qa.entity.Answer;
import top.hyzhu.springboot.qa.mapper.AnswerMapper;

import java.util.List;

/**
 * @author Huany
 */
@Service
public class AnswerService extends ServiceImpl<AnswerMapper, Answer> {

    @Resource
    private AnswerMapper answerMapper;

    // 根据问题ID获取所有回答及回答者信息
    public List<Answer> getAnswersByQuestionId(Long questionId) {
        return answerMapper.selectByQuestionId(questionId);
    }
}