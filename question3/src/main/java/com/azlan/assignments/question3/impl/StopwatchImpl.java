package com.azlan.assignments.question3.impl;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class StopwatchImpl {

    final Stopwatch stopWatch;
    private long timeElapsed;

    private static final Logger logger = LoggerFactory.getLogger(StopwatchImpl.class);

//    public StopwatchImpl(Stopwatch stopWatch) {
//        this.stopWatch = stopWatch;
//    }


    public StopwatchImpl() {
//        stopWatch = Stopwatch.createStarted();
        logger.debug("INITIALIZING");
        stopWatch = Stopwatch.createUnstarted();
        timeElapsed = 0;
    }

    public long getTimeElapsed()
    {
        logger.debug("GETTING TIME ELAPSED");
        if(this.stopWatch.isRunning())
        {
            this.timeElapsed = stopWatch.stop().elapsed(TimeUnit.MILLISECONDS);
//            logger.debug("TIME CONSUMED ==> " + this.timeElapsed);
        }
        else
        {
            this.timeElapsed = stopWatch.elapsed(TimeUnit.MILLISECONDS);
//            logger.debug("TIME CONSUMED ==> " + this.timeElapsed);
        }

        logger.debug("TIME CONSUMED ==> " + this.timeElapsed);

        return this.timeElapsed;
    }

    public void startTimer()
    {
        logger.debug("STARTING TIMER");
        this.stopWatch.start();
    }

    public void stopTimer()
    {
        logger.debug("STOPPING TIMER");
        this.stopWatch.stop();
    }

    public boolean checkTimer()
    {
        logger.debug("CHECKING THE STOPWATCH RUNNING ==> " + this.stopWatch.isRunning());
        return this.stopWatch.isRunning();
    }

}
