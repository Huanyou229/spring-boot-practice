package top.hyzhu.qasystem.Service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.hyzhu.qasystem.Service.QuestionService;
import top.hyzhu.qasystem.entity.Question;
import top.hyzhu.qasystem.mapper.QuestionMapper;

import java.util.List;

/**
 * @Author: zhy
 * @Description: QuestionServiceImpl
 * @Date: 2024-10-12 21:40
 **/
@Service
public class QuestionServiceImpl implements QuestionService {

    @Resource
    private QuestionMapper questionMapper;

    @Override
    public List<Question> getAllQuestions() {
        return questionMapper.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionMapper.findById(id);
    }

    @Override
    public void createQuestion(Question question) {
        questionMapper.insertQuestion(question);
    }
}
