package top.hyzhu.springboot.quickstart.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @Author: zhy
 * @Description: 会议实体类
 * @Date: 2024-09-02 19:07
 **/
public class Meeting {
    private Long id;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    public Meeting(Long id, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.id = id;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public Meeting() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public boolean isOverlapping(Meeting other) {
        return this.date.equals(other.date) &&
                (this.startTime.isBefore(other.endTime) && this.endTime.isAfter(other.startTime));
    }
}
