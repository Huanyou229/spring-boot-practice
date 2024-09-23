package top.hyzhu.zhihu.api.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.hyzhu.zhihu.api.entity.Special;
import top.hyzhu.zhihu.api.mapper.SpecialMapper;
import top.hyzhu.zhihu.api.service.SpecialService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-14 15:38
 **/
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    public SpecialMapper specialMapper;

    @Override
    public List<Special> getAll() {
        List<Special> specials = specialMapper.selectAll();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        specials.forEach(special -> {
            //时间戳单位是秒，加上000变成毫秒，生成Date对象，再格式化
            String format = df.format(new Date(Long.parseLong(special.getUpdated()+ "000")));
            special.setUpdated(format);
        });
        return specials;
    }

    @Override
    public List<Special> getByPage(int limit, int offset) {
        List<Special> specials = specialMapper.selectByPage(limit, offset);
//        使用 SimpleDateFormat 将时间戳转换为 yyyy-MM-dd HH:mm:ss 格式。
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        在 specials.forEach 循环中对每个 special 对象的 updated 字段进行时间格式化。
        specials.forEach(special -> {
            // 时间戳单位是秒，加上 "000" 变成毫秒，生成 Date 对象，再格式化
            String format = df.format(new Date(Long.parseLong(special.getUpdated() + "000")));
            special.setUpdated(format);
        });
        return specials;
    }
}
