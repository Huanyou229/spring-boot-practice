package top.hyzhu.qasystem.Service;

import top.hyzhu.qasystem.entity.Question;

import java.util.List;

/**
 * @Author: zhy
 * @Description: QuestionService
 * @Date: 2024-10-12 21:32
 **/
public interface QuestionService {
    List<Question> getAllQuestions();
    Question getQuestionById(Long id);
    void createQuestion(Question question);
}
