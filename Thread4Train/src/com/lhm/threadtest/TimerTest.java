package com.lhm.threadtest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws ParseException {
        Timer timer=new Timer();
//        Timer timer1=new Timer(true);  线程守护方式

        //设置时间
        //timer.schedule(定时任务，第一次执行时间，间隔多久执行一次)
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime=sdf.parse("2021-09-22 09:30:00");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //编写你要执行的任务
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String strTime= simpleDateFormat.format(new Date());
                System.out.println(strTime+":成功完成了一次数据备份");
            }
        }, firstTime, 1000 * 10);
    }
}

class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        //编写你要执行的任务
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime= simpleDateFormat.format(new Date());
        System.out.println(strTime+":成功完成了一次数据备份");    }
}
