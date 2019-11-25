package com.acebear.sample;

import org.junit.Test;
import org.junit.Assert;

public class AppTest {
    @Test
    public void testAppSum() {
        App app = new App();
        Assert.assertSame(8, app.sum(3, 5));
    }
}
