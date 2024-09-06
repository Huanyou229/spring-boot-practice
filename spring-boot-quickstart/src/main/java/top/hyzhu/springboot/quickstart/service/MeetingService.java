package top.hyzhu.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.hyzhu.springboot.quickstart.entity.Meeting;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhy
 * @Description: 会议服务层
 * @Date: 2024-09-02 19:18
 **/
@Service
public class MeetingService {
    private final List<Meeting> meetings = new ArrayList<>();

    public boolean isRoomAvailable(Meeting newMeeting) {
        return meetings.stream()
                .noneMatch(exitingMeeting ->exitingMeeting.isOverlapping(newMeeting));
    }

    public void addMeeting(Meeting meeting){
        meetings.add(meeting);
    }
}
