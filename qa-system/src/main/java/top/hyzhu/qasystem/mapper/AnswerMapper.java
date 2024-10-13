package top.hyzhu.qasystem.mapper;

import top.hyzhu.qasystem.entity.Answer;

import java.util.List;

/**
 * @Author: zhy
 * @Description: AnswerMapper.xml
 * @Date: 2024-10-12 21:36
 **/
public interface AnswerMapper {
    List<Answer> findByQuestionId(Long questionId);
    void insertAnswer(Answer answer);
}
