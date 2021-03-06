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
public class xcb_rectangle_t extends Structure {
	public short x;
	public short y;
	public short width;
	public short height;
	public xcb_rectangle_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("x", "y", "width", "height");
	}
	public xcb_rectangle_t(short x, short y, short width, short height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public xcb_rectangle_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_rectangle_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_rectangle_t implements Structure.ByValue {
		
	};
}
