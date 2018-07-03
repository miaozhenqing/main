package com.example.chx.test.taskschdule;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author: mzq
 * @date: 2018/5/10
 * @description :定时器要执行的任务
 * @version: 2.0
 */
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("\n\n***************执行定时器**************\n\n");
    }
}
