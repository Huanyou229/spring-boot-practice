package top.hyzhu.springboot.quickstart.service;
import org.springframework.stereotype.Service;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-07 0:45
 **/

@Service
public class ReportService {
    public String generateReport(String title, String content) {
        // 使用文本块简化 HTML 模板的表示
        String htmlTemplate = """
                <html>
                    <head>
                        <title>%s</title>
                    </head>
                    <body>
                        <h1>%s</h1>
                        <p>%s</p>
                    </body>
                </html>
                """;
        return String.format(htmlTemplate, title, title, content);
    }
}

