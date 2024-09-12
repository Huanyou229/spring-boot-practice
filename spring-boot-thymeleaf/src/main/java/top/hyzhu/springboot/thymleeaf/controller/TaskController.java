package top.hyzhu.springboot.thymleeaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.hyzhu.springboot.thymleeaf.model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-09 15:18
 **/

@Controller
public class TaskController {
    // ⽤于存储任务列表
    private List<Task> tasks = new ArrayList<>();
    // 任务列表⻚⾯：显示所有待办事项
    @GetMapping("/taskList")
    public String taskList(Model model) {
        model.addAttribute("tasks", tasks);
        // 返回任务列表⻚⾯
        return "taskList";
    }
    // 处理添加新任务的表单提交
    @PostMapping("/addTask")
    public String addTask(@RequestParam String name) {
        Long id = (long) (tasks.size() + 1);
        Task task = new Task(id, name);
        // 将新任务添加到列表
        tasks.add(task);
        // 重定向到任务列表⻚⾯
        return "redirect:/taskList";
    }
    // 删除任务
    @PostMapping("/deleteTask")
    public String deleteTask(@RequestParam Long id) {
        // 从列表中移除任务
        tasks.removeIf(task -> task.getId().equals(id));
        // 重定向到任务列表⻚⾯
        return "redirect:/taskList";
    }
    // 更新任务状态（完成/未完成）
    @PostMapping("/updateTask")
    public String updateTask(@RequestParam Long id) {
        // 将任务列表`tasks`转化为Stream流，以便进⾏后续的流式操作。
        Task task = tasks.stream()
        // 使⽤filter⽅法过滤任务列表，过滤条件是每个任务`t`的`id`是否等于传⼊的`id`。
                .filter(t -> t.getId().equals(id))
                // 在过滤后的任务流中，找到第⼀个匹配条 件的任务（如果存在）。
                .findFirst()
        // 如果没有找到匹配的任务，则返回null。
                .orElse(null);
        if (task != null) {
            // 切换任务状态
            task.setCompleted(!task.getCompleted());
        }
        // 重定向到任务列表⻚⾯
        return "redirect:/taskList";
    }
}
