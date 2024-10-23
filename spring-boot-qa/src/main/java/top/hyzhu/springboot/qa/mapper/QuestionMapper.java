package top.hyzhu.springboot.qa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import top.hyzhu.springboot.qa.entity.Question;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 23:44
 **/

public interface QuestionMapper extends BaseMapper<Question> {

    // 获取问题及提问者信息
    @Select("SELECT q.*, u.username, u.avatar FROM question q LEFT JOIN user u ON q.user_id = u.id WHERE q.id = #{id}")
    @Results({
            @Result(property = "user", column = "user_id",
                    one = @One(select = "top.hyzhu.springboot.qa.mapper.UserMapper.selectById"))
    })
    Question getQuestionWithUser(Long id);
}
