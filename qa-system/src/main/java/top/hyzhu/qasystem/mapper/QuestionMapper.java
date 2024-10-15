package top.hyzhu.qasystem.mapper;

import top.hyzhu.qasystem.entity.Question;


/**
 * @Author: zhy
 * @Description: QuestionMapper
 * @Date: 2024-10-12 21:36
 **/
public interface QuestionMapper {
    void insertQuestion(Question question);
    // 新增方法：获取最后插入的问题
    Question getLastInsertedQuestion();
}
