package com.yi.ylwm;

import com.sun.jna.ptr.PointerByReference;
import com.yi.ylwm.xcb.LibXcbLibrary;
import com.yi.ylwm.xcb.xcb_screen_iterator_t;
import com.yi.ylwm.xcb.xcb_screen_t;
import com.yi.ylwm.xcb.xcb_setup_t;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yi
 */
public class XcbConfiguration {
    @Configuration
    static class PointerByReferenceConfiguration{
        @Bean("connect")
        public PointerByReference xcbConnect(){
            return LibXcbLibrary.INSTANCE.xcb_connect((String) null, null);
        }
    }
    @Configuration
    static class xcSetupTConfiguration{
        @Autowired
        PointerByReference connect;
        @Bean("xcbSetupT")
        public xcb_setup_t xcbSetupT(){
            int i = LibXcbLibrary.INSTANCE.xcb_connection_has_error(connect);
            switch (i) {
                case LibXcbLibrary.XCB_CONN_ERROR:{
                    System.out.println("because of socket errors, pipe errors or other stream errors");
                    System.exit(1);
                    break;
                }
                case LibXcbLibrary.XCB_CONN_CLOSED_EXT_NOTSUPPORTED:{
                    System.out.println("extension not supported.");
                    System.exit(2);
                    break;
                }
                case LibXcbLibrary.XCB_CONN_CLOSED_MEM_INSUFFICIENT:{
                    System.out.println(" memory not available.");
                    System.exit(3);
                    break;
                }
                case LibXcbLibrary.XCB_CONN_CLOSED_REQ_LEN_EXCEED:{
                    System.out.println("exceeding request length that server accepts.");
                    System.exit(4);
                    break;
                }
                case LibXcbLibrary.XCB_CONN_CLOSED_PARSE_ERR:{
                    System.out.println("error during parsing display string.");
                    System.exit(5);
                    break;
                }
                case LibXcbLibrary.XCB_CONN_CLOSED_INVALID_SCREEN:{
                    System.out.println("because the server does not have a screen matching the display.");
                    System.exit(6);
                    break;
                }
                default:
            }
            return LibXcbLibrary.INSTANCE.xcb_get_setup(connect);
        }
    }
    @Configuration
    static class xcbSetupTConfiguration{
        @Autowired
        xcb_setup_t xcbSetupT;
        @Bean("xcbScreenIteratorT")
        public xcb_screen_iterator_t xcbScreenIteratorT(){
            return LibXcbLibrary.INSTANCE.xcb_setup_roots_iterator(xcbSetupT);
        }
    }
    @Configuration
    static class xcbScreenTConfiguration{
        @Autowired
        xcb_screen_iterator_t xcbScreenIteratorT;
        @Bean("xcbScreenTList")
        public List<xcb_screen_t> xcbScreenT(){
            List<xcb_screen_t> list = new ArrayList<>();
            xcb_screen_iterator_t.ByReference screenIteratorT
                    = new xcb_screen_iterator_t.ByReference() ;
            screenIteratorT.data=xcbScreenIteratorT.data;
            screenIteratorT.index=xcbScreenIteratorT.index;
            screenIteratorT.rem= xcbScreenIteratorT.rem;
            for (;screenIteratorT.rem!=0;LibXcbLibrary.INSTANCE.xcb_screen_next(screenIteratorT)){
                list.add(screenIteratorT.data);
            }
            if (list.size()<1){
                System.exit(-1);
            }
            return list;
        }
    }
}
