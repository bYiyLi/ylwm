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
public class xcb_get_modifier_mapping_reply_t extends Structure {
	public byte response_type;
	public byte keycodes_per_modifier;
	public short sequence;
	public int length;
	/** C type : uint8_t[24] */
	public byte[] pad0 = new byte[24];
	public xcb_get_modifier_mapping_reply_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("response_type", "keycodes_per_modifier", "sequence", "length", "pad0");
	}
	/** @param pad0 C type : uint8_t[24] */
	public xcb_get_modifier_mapping_reply_t(byte response_type, byte keycodes_per_modifier, short sequence, int length, byte pad0[]) {
		super();
		this.response_type = response_type;
		this.keycodes_per_modifier = keycodes_per_modifier;
		this.sequence = sequence;
		this.length = length;
		if ((pad0.length != this.pad0.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad0 = pad0;
	}
	public xcb_get_modifier_mapping_reply_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_get_modifier_mapping_reply_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_get_modifier_mapping_reply_t implements Structure.ByValue {
		
	};
}
