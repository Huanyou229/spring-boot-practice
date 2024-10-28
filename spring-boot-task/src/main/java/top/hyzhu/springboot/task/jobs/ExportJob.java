package top.hyzhu.springboot.task.jobs;

import com.alibaba.excel.EasyExcel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import top.hyzhu.springboot.task.entity.Student;
import top.hyzhu.springboot.task.mapper.StudentMapper;

import java.util.List;
import java.util.UUID;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-28 16:25
 **/
//@Slf4j
//@AllArgsConstructor

//public class ExportJob extends QuartzJobBean {
//    private final StudentMapper studentMapper;
//    @Override
//    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
//        log.info("开始执行导出任务！");
//        List<Student> students = studentMapper.selectList(null);
//        String fileName = "/C:/Users/Huany/Desktop/export/"+ UUID.randomUUID()+".xlsx";
//        EasyExcel.write(fileName, Student.class).sheet("学生信息").doWrite(()-> students);
//    }
//}
