package top.hyzhu.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.hyzhu.springboot.quickstart.enums.RequestType;

import java.util.List;
import java.util.Optional;

/**
 * @Author: zhy
 * @Description: 请求服务层
 * @Date: 2024-09-02 18:40
 **/
@Service
public class CustomerService {
    public String handleRequest(RequestType requestType) {
        return switch (requestType) {
            case QUERY -> handleQuery();
            case COMPLAINT -> handleComplaint();
            case SUGGESTION -> handleSuggestion();
        };
    }

    private String handleQuery() {
        return "查询请求";
    }

    private String handleComplaint() {
        return "投诉请求";
    }
    private String handleSuggestion() {
        return "建议请求";
    }

}
