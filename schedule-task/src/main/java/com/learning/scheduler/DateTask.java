package com.learning.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTask {
    private static final Logger log = LoggerFactory.getLogger(DateTask.class);
    private static final SimpleDateFormat dt = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "* * * * *")
    public void reportTime() {
        log.info("The time is ow {}" , dt.format(new Date()));
        System.out.println("The time is ow {}" + dt.format(new Date()));

    }

}
