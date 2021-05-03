package com.yi.ylwm;

import com.sun.jna.ptr.PointerByReference;
import com.yi.ylwm.xcb.xcb_screen_iterator_t;
import com.yi.ylwm.xcb.xcb_screen_t;
import com.yi.ylwm.xcb.xcb_setup_t;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    PointerByReference connect;

    @Autowired
    xcb_setup_t xcbSetupT;

    @Autowired
    xcb_screen_iterator_t xcbScreenIteratorT;

    @Autowired
    List<xcb_screen_t> xcbScreenTList;
    @Test
    void contextLoads() {
        System.out.println(xcbScreenTList);
    }
}
