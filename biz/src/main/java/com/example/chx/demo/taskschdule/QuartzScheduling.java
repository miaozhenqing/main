package com.example.chx.demo.taskschdule;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * @author: mzq
 * @date: 2018/5/10
 * @description :调度任务
 * 为了调度此任务执行，需要先得到一个Schedule实例，然后创建一个包含任务信息的JobDetail，最后创建一个Trigger管理任务的执行
 * @version: 2.0
 */
public class QuartzScheduling {
    public static void main(String[] args) throws Exception{
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        JobDetail jobDetail = new JobDetail("myJob",Scheduler.DEFAULT_GROUP, MyJob.class);
        SimpleTrigger simpleTrigger = new SimpleTrigger("simpleTrigger",Scheduler.DEFAULT_GROUP);
        simpleTrigger.setStartTime(new Date(System.currentTimeMillis()));
        simpleTrigger.setRepeatInterval(2000);
        simpleTrigger.setRepeatCount(10);
        scheduler.scheduleJob(jobDetail, simpleTrigger);

        scheduler.start();
    }
}
