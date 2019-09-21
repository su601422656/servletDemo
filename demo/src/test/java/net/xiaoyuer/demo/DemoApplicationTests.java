package net.xiaoyuer.demo;

import jdk.internal.jline.internal.TestAccessible;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testOne() {
        System.out.println("Test One");
        TestCase.assertEquals(1,1);
    }

    @Before
    public void testBefore() {
        System.out.println("Test Before");
    }

    @After
    public void testAfter() {
        System.out.println("Test After");
    }
}
