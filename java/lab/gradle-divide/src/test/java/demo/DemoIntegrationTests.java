package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoIntegrationTests {
    @Test
    public void testHappy() {
        System.out.println(this.getClass().getName());
        assertEquals(2, 1+1);
    }
}
