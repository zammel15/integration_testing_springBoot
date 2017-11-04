package com.devox.web;

import com.devox.devox.DevoxApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;




@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DevoxApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)


public class HomeControllerTest {

    @LocalServerPort
    private int  port ;

    @Test
    public void runAndInvokeMethod(){

        String url = "http://localhost:" + port+ "/";
        String body =  new RestTemplate().getForObject(url , String.class);

        assertThat(body , is ("Hello devox"));

    }

}