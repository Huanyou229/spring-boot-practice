package top.hyzhu.zhihu.api.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.zhihu.api.common.ResponseResult;
import top.hyzhu.zhihu.api.entity.Special;
import top.hyzhu.zhihu.api.service.SpecialService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-14 15:49
 **/
@RestController
@RequestMapping("/api/v1/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;

    @GetMapping("all")
    public ResponseResult getAll(){
        List<Special> all = specialService.getAll();
        return ResponseResult.builder()
                .code(200)
                .msg("数据获取成功")
                .data(all)
                .build();
    }

    @GetMapping("/page")
    public ResponseResult getByPage(@RequestParam int limit,@RequestParam int offset){
        Map<String,Object> map = new HashMap<>();
        List<Special> specials = specialService.getByPage(limit,offset);
        map.put("special",specials);
        map.put("total",specialService.getAll().size());
        return ResponseResult.builder()
                .code(200)
                .msg("数据获取成功")
                .data(map)
                .build();
    }
}
