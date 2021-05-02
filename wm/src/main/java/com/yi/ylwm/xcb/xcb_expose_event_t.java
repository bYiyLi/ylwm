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
public class xcb_expose_event_t extends Structure {
	public byte response_type;
	public byte pad0;
	public short sequence;
	/** C type : xcb_window_t */
	public int window;
	public short x;
	public short y;
	public short width;
	public short height;
	public short count;
	/** C type : uint8_t[2] */
	public byte[] pad1 = new byte[2];
	public xcb_expose_event_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("response_type", "pad0", "sequence", "window", "x", "y", "width", "height", "count", "pad1");
	}
	public xcb_expose_event_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_expose_event_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_expose_event_t implements Structure.ByValue {
		
	};
}
