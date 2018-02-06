package com.zhanghuanfa.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhanghuanfa  2018-01-18 10:27
 */
public class MainStart {

    private static Logger logger = LoggerFactory.getLogger(MainStart.class);
    private static final String SPRING_CONFIG = "spring.xml";
    private static final String SHUTDOWN_HOOK_KEY = "dubbo.shutdown.hook";
    private static volatile boolean running = true;
    private static ClassPathXmlApplicationContext context = null;

    public static void main(String[] args) {
        try {
            long begin = System.currentTimeMillis();
            MainStart.run();
            long time = System.currentTimeMillis() - begin;
            String logLine =
                String.format("%s dubbo server started! It takes %d ms.",
                              new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date()), time);
            System.out.println(logLine);
            logger.info(logLine);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(Boolean.toString(running).equals(System.getProperty(SHUTDOWN_HOOK_KEY))) {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                context.stop();
                synchronized(MainStart.class) {
                    running = false;
                    MainStart.class.notify();
                }
            }));
        }

        synchronized (MainStart.class) {
            while (running) {
                try {
                    MainStart.class.wait();
                } catch (Throwable e) {

                }
            }
        }

    }

    private static void run(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(SPRING_CONFIG);
        context.start();
    }
}
