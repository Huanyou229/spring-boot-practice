package top.hyzhu.qasystem.Service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.hyzhu.qasystem.Service.AnswerService;
import top.hyzhu.qasystem.entity.Answer;
import top.hyzhu.qasystem.mapper.AnswerMapper;

import java.util.List;

/**
 * @Author: zhy
 * @Description: AnswerServiceImpl
 * @Date: 2024-10-12 21:41
 **/
@Service
public class AnswerServiceImpl implements AnswerService {

    @Resource
    private AnswerMapper answerMapper;

    @Override
    public List<Answer> getAnswersByQuestionId(Long questionId) {
        return answerMapper.findByQuestionId(questionId);
    }

    @Override
    public void createAnswer(Answer answer) {
        answerMapper.insertAnswer(answer);
    }
}

