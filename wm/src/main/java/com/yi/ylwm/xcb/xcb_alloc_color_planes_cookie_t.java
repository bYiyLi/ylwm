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
public class xcb_alloc_color_planes_cookie_t extends Structure {
	public int sequence;
	public xcb_alloc_color_planes_cookie_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("sequence");
	}
	public xcb_alloc_color_planes_cookie_t(int sequence) {
		super();
		this.sequence = sequence;
	}
	public xcb_alloc_color_planes_cookie_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_alloc_color_planes_cookie_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_alloc_color_planes_cookie_t implements Structure.ByValue {
		
	};
}
