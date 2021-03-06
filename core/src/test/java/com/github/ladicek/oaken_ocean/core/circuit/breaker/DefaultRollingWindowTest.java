package com.github.ladicek.oaken_ocean.core.circuit.breaker;

public class DefaultRollingWindowTest extends AbstractRollingWindowTest {
    @Override
    protected RollingWindow createRollingWindow(int size, int failureThreshold) {
        return RollingWindow.create(size, failureThreshold);
    }
}
