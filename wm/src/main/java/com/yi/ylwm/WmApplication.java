package com.yi.ylwm;

import com.sun.jna.JNIEnv;
import com.sun.jna.Platform;
import com.sun.jna.ptr.PointerByReference;
import com.yi.ylwm.xcb.LibXcbLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PreDestroy;

/**
 * @author yi
 */
@SpringBootApplication
public class WmApplication {
    @Autowired
    PointerByReference connect;
    @PreDestroy
    public void exitCodeGenerator() {
        LibXcbLibrary.INSTANCE.xcb_disconnect(connect);
        System.out.println("Exit");
    }

    public static void main(String[] args) {
        if (!Platform.isLinux()){
            System.exit(-1);
        }
        SpringApplication.run(WmApplication.class, args);
    }
}