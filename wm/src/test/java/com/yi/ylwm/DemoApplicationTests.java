package com.yi.ylwm;

import com.yi.ylwm.xcb.LibXcb;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    LibXcb libXcb;
    @Test
    void contextLoads() {

    }

}
