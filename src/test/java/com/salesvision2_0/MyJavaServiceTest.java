package com.salesvision2_0;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.salesvision2_0.myjavaservice.MyJavaService;

/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 1/8/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app-config.xml")
@WebAppConfiguration
public class MyJavaServiceTest {

    @Autowired
    MyJavaService javaService;

    @Test
    public void verifyName() {
        String response = javaService.helloService("WaveMaker");
        Assert.assertEquals(response, "Hello WaveMaker!");
    }

    @Test
    public void verifyEmptyName() {
        String response = javaService.helloService("");
        Assert.assertNull(response);
    }

    @Test
    public void verifyNullName() {
        String response = javaService.helloService(null);
        Assert.assertNull(response);
    }
}
