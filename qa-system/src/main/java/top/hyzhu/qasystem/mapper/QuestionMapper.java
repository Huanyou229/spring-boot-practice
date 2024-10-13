package top.hyzhu.qasystem.mapper;

import top.hyzhu.qasystem.entity.Question;

import java.util.List;

/**
 * @Author: zhy
 * @Description: QuestionMapper
 * @Date: 2024-10-12 21:36
 **/
public interface QuestionMapper {
    List<Question> findAll();
    Question findById(Long id);
    void insertQuestion(Question question);
}
