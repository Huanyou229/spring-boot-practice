package top.hyzhu.springboot.quickstart.controller;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.springboot.quickstart.service.ReportService;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-07 0:45
 **/

@RestController
@RequestMapping("/report")
public class ReportController {
    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/{title}")
    public String getReport(@PathVariable String title) {
        // 模拟报告内容
        String content = "This is the content of the report.";
        return reportService.generateReport(title, content);
    }
}

