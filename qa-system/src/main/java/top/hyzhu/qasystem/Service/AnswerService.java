package top.hyzhu.qasystem.Service;

import top.hyzhu.qasystem.entity.Answer;

import java.util.List;

/**
 * @Author: zhy
 * @Description: AnswerService
 * @Date: 2024-10-12 21:33
 **/
public interface AnswerService {
    List<Answer> getAnswersByQuestionId(Long questionId);
    void createAnswer(Answer answer);
}

