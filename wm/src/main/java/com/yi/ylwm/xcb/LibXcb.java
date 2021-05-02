package com.yi.ylwm.xcb;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.WString;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import org.springframework.context.annotation.Configuration;

/**
 * @author yi
 */
@Configuration
public interface LibXcb extends Library {
    LibXcb libXcb = Native.load("libxcb", LibXcb.class);
    void xcb_connect(String displayName, IntByReference screen);

    public static void main(String[] args) {
        PointerByReference pointer = LibXcbLibrary.INSTANCE.xcb_connect("", null);
        xcb_setup_t xcbSetupT = LibXcbLibrary.INSTANCE.xcb_get_setup(pointer);
        xcb_screen_iterator_t.ByValue xcbScreenIteratorT = LibXcbLibrary.INSTANCE.xcb_setup_roots_iterator(xcbSetupT);
        xcb_screen_t.ByReference data = xcbScreenIteratorT.data;
        
    }
}
