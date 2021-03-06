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
public class xcb_image_text_16_request_t extends Structure {
	public byte major_opcode;
	public byte string_len;
	public short length;
	/** C type : xcb_drawable_t */
	public int drawable;
	/** C type : xcb_gcontext_t */
	public int gc;
	public short x;
	public short y;
	public xcb_image_text_16_request_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("major_opcode", "string_len", "length", "drawable", "gc", "x", "y");
	}
	/**
	 * @param drawable C type : xcb_drawable_t<br>
	 * @param gc C type : xcb_gcontext_t
	 */
	public xcb_image_text_16_request_t(byte major_opcode, byte string_len, short length, int drawable, int gc, short x, short y) {
		super();
		this.major_opcode = major_opcode;
		this.string_len = string_len;
		this.length = length;
		this.drawable = drawable;
		this.gc = gc;
		this.x = x;
		this.y = y;
	}
	public xcb_image_text_16_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_image_text_16_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_image_text_16_request_t implements Structure.ByValue {
		
	};
}
