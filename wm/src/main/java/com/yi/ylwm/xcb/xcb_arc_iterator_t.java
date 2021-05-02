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
public class xcb_arc_iterator_t extends Structure {
	/** C type : xcb_arc_t* */
	public com.yi.ylwm.xcb.xcb_arc_t.ByReference data;
	public int rem;
	public int index;
	public xcb_arc_iterator_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("data", "rem", "index");
	}
	/** @param data C type : xcb_arc_t* */
	public xcb_arc_iterator_t(com.yi.ylwm.xcb.xcb_arc_t.ByReference data, int rem, int index) {
		super();
		this.data = data;
		this.rem = rem;
		this.index = index;
	}
	public xcb_arc_iterator_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_arc_iterator_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_arc_iterator_t implements Structure.ByValue {
		
	};
}
