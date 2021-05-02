package com.yi.ylwm.xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /usr/include/xcb/xproto.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_motion_notify_event_t extends Structure {
	public byte response_type;
	public byte detail;
	public short sequence;
	/** C type : xcb_timestamp_t */
	public int time;
	/** C type : xcb_window_t */
	public int root;
	/** C type : xcb_window_t */
	public int event;
	/** C type : xcb_window_t */
	public int child;
	public short root_x;
	public short root_y;
	public short event_x;
	public short event_y;
	public short state;
	public byte same_screen;
	public byte pad0;
	public xcb_motion_notify_event_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("response_type", "detail", "sequence", "time", "root", "event", "child", "root_x", "root_y", "event_x", "event_y", "state", "same_screen", "pad0");
	}
	public xcb_motion_notify_event_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_motion_notify_event_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_motion_notify_event_t implements Structure.ByValue {
		
	};
}
