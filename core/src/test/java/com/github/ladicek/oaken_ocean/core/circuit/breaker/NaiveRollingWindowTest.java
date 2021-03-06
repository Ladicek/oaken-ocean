package com.github.ladicek.oaken_ocean.core.circuit.breaker;

public class NaiveRollingWindowTest extends AbstractRollingWindowTest {
    @Override
    protected RollingWindow createRollingWindow(int size, int failureThreshold) {
        return new NaiveRollingWindow(size, failureThreshold);
    }
}
