package top.hyzhu.springboot.qa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import top.hyzhu.springboot.qa.entity.Answer;

import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 23:46
 **/
public interface AnswerMapper extends BaseMapper<Answer> {

    // 根据问题ID查询回答和回答者信息
    @Select("SELECT a.*, u.username, u.avatar FROM answer a LEFT JOIN user u ON a.user_id = u.id WHERE a.question_id = #{questionId}")
    @Results({
            @Result(property = "user", column = "user_id",
                    one = @One(select = "top.hyzhu.springboot.qa.mapper.UserMapper.selectById"))
    })
    List<Answer> selectByQuestionId(Long questionId);
}
