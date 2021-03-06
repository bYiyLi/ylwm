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
public class xcb_translate_coordinates_reply_t extends Structure {
	public byte response_type;
	public byte same_screen;
	public short sequence;
	public int length;
	/** C type : xcb_window_t */
	public int child;
	public short dst_x;
	public short dst_y;
	public xcb_translate_coordinates_reply_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("response_type", "same_screen", "sequence", "length", "child", "dst_x", "dst_y");
	}
	/** @param child C type : xcb_window_t */
	public xcb_translate_coordinates_reply_t(byte response_type, byte same_screen, short sequence, int length, int child, short dst_x, short dst_y) {
		super();
		this.response_type = response_type;
		this.same_screen = same_screen;
		this.sequence = sequence;
		this.length = length;
		this.child = child;
		this.dst_x = dst_x;
		this.dst_y = dst_y;
	}
	public xcb_translate_coordinates_reply_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_translate_coordinates_reply_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_translate_coordinates_reply_t implements Structure.ByValue {
		
	};
}
