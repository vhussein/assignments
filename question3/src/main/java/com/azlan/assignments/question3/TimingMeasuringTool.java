package com.azlan.assignments.question3;

import com.azlan.assignments.question3.impl.StopwatchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimingMeasuringTool{

    private static final Logger logger = LoggerFactory.getLogger(TimingMeasuringTool.class);

    public static void main(String[] args) throws InterruptedException {

        StopwatchImpl stopwatch = new StopwatchImpl();
//        logger.debug("Timer started? " + stopwatch.checkTimer());
//
//        Thread.sleep(3000);
//
        stopwatch.startTimer();
//        logger.debug("Timer started? " + stopwatch.checkTimer());
//
//        for (int i = 0; i < 10; i++) {
//
//            Thread.sleep(1000);
//        }
//
//        if(stopwatch.checkTimer())
//        {
//            logger.debug("Timer started");
//            long elapsed = stopwatch.getTimeElapsed();
//            logger.info("TimingMeasuringTool Duration: " + elapsed + "ms");
//
//            logger.debug("Timer started? " + stopwatch.checkTimer());
//        }
//
//
//
////        long elapsed = stopWatchImp.stopWatch.stop().elapsed(TimeUnit.MILLISECONDS);
//
//        Thread.sleep(2000);
//        logger.debug("This is the 2nd part");
//        doThis();

        RunnableDemo commonInstance = new RunnableDemo();

        Thread t1 = new Thread( commonInstance);
        Thread t2 = new Thread( commonInstance);
        Thread t3 = new Thread( commonInstance);
        Thread t4 = new Thread( commonInstance);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // wait for threads to end
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch( Exception e) {
            System.out.println("Interrupted");
        }
        finally {

        if(stopwatch.checkTimer())
        {
            logger.debug("Timer started");
            long elapsed = stopwatch.getTimeElapsed();
            logger.info("TimingMeasuringTool Duration: " + elapsed + "ms");

            logger.debug("Timer started? " + stopwatch.checkTimer());
        }

        }

    }

    public static void doThis() throws InterruptedException {
        StopwatchImpl stopwatch = new StopwatchImpl();
        logger.debug("Timer started? " + stopwatch.checkTimer());

        Thread.sleep(3000);

        stopwatch.startTimer();
        logger.debug("Timer started? " + stopwatch.checkTimer());

        for (int i = 0; i < 10; i++) {

            Thread.sleep(2000);
        }

        if(stopwatch.checkTimer())
        {
            logger.debug("Timer started");
            long elapsed = stopwatch.getTimeElapsed();
            logger.info("TimingMeasuringTool Duration: " + elapsed + "ms");

            logger.debug("Timer started? " + stopwatch.checkTimer());
        }
    }
}
