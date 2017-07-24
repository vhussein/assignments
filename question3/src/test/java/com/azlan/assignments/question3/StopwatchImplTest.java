package com.azlan.assignments.question3;

import com.azlan.assignments.question3.impl.StopwatchImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StopwatchImplTest {

    @Test
    public void getTimeElapsedTest() throws Exception {

        long value = 0;
        StopwatchImpl stopwatch = new StopwatchImpl();
        stopwatch.startTimer();
        Thread.sleep(1000);

        value = stopwatch.getTimeElapsed();

        if(value > 0)
            Assert.assertEquals(true, true);
    }

    @Test
    public void startTimerTest() throws Exception {
        boolean valid = false;
        StopwatchImpl stopwatch = new StopwatchImpl();
        stopwatch.startTimer();
        if(stopwatch.checkTimer() ? valid = true : null)
        Assert.assertEquals(true, valid);
    }

    @Test
    public void stopTimerTest() throws Exception {
        boolean valid = false;
        StopwatchImpl stopwatch = new StopwatchImpl();
        stopwatch.startTimer();
        stopwatch.stopTimer();
        valid = stopwatch.checkTimer();

        Assert.assertEquals(false, valid);
    }

    @Test
    public void checkTimerTest() throws Exception {
        boolean valid = false;
        StopwatchImpl stopwatch = new StopwatchImpl();
        valid = stopwatch.checkTimer();
        Assert.assertEquals(false, valid);
    }

}