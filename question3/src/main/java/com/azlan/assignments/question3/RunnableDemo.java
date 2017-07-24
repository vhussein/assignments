package com.azlan.assignments.question3;

import com.azlan.assignments.question3.impl.StopwatchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class RunnableDemo implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(RunnableDemo.class);
    int counter;
//    ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<Integer>();

    public void run() {

        StopwatchImpl obj = new StopwatchImpl();
        obj.startTimer();
        counter++;
        logger.info("Counter " + counter + " start timer");

        Random rand = new Random();

        int  sleepTime = rand.nextInt(10000) + 1000;
        logger.debug("Counter " + counter + " sleeping time is " + sleepTime);

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            logger.error("Error : " + e.toString());
        }
//        if(threadLocalCounter.get() != null){
//            threadLocalCounter.set(threadLocalCounter.get().intValue() + 1);
//        }else{
//            threadLocalCounter.set(0);
//        }
        obj.stopTimer();

        logger.info("Counter: " + counter + " takes " + obj.getTimeElapsed() + " ms");
//        logger.info("threadLocalCounter: " + threadLocalCounter.get());
    }
}
