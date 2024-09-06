package top.hyzhu.springboot.quickstart.controller;

import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.quickstart.entity.Meeting;
import top.hyzhu.springboot.quickstart.service.MeetingService;

/**
 * @Author: zhy
 * @Description: MeetingController
 * @Date: 2024-09-02 19:27
 **/
@RestController
@RequestMapping("/meeting")
public class MeetingController {
    @Resource
    private MeetingService meetingService;

    @GetMapping("/check")
    public ResponseEntity<String> check(@RequestBody Meeting meeting){
        if(meetingService.isRoomAvailable(meeting)){
//            添加到会议列表
            meetingService.addMeeting(meeting);
            return ResponseEntity.ok("会议室可用！");
        }else{
            return ResponseEntity.ok("会议室已被占用！");
        }

    }
}
