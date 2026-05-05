package com.sky.quartz.task;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyTask {

    public void showTime() {
        System.out.println("定时任务开始执行" + LocalDateTime.now());
    }
}
