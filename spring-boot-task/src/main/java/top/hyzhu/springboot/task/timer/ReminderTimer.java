package top.hyzhu.springboot.task.timer;

import lombok.extern.slf4j.Slf4j;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: zhy
 * @Description: 定时发送提醒消息
 * @Date: 2024-10-28 14:11
 **/
@Slf4j
public class ReminderTimer {
    public static void main(String[] args) {
//        定时器timer
        Timer timer = new Timer();
//        任务task
        TimerTask task = new TimerTask(){

            @Override
            public void run(){
//                要做的事情
                log.info("请休息一下。喝口水吧");
            }
        };
//      每个5秒执行任务
        timer.schedule(task, 0, 5000);
    }
}
