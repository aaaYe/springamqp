package com.demo.springamqp;

import com.demo.springamqp.producer.Sender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class SpringamqpApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void testRabbitmq() throws Exception {
        String response = sender.send();
        System.out.println(response);
    }

}
