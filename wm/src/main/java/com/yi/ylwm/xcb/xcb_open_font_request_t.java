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
public class xcb_open_font_request_t extends Structure {
	public byte major_opcode;
	public byte pad0;
	public short length;
	/** C type : xcb_font_t */
	public int fid;
	public short name_len;
	/** C type : uint8_t[2] */
	public byte[] pad1 = new byte[2];
	public xcb_open_font_request_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("major_opcode", "pad0", "length", "fid", "name_len", "pad1");
	}
	/**
	 * @param fid C type : xcb_font_t<br>
	 * @param pad1 C type : uint8_t[2]
	 */
	public xcb_open_font_request_t(byte major_opcode, byte pad0, short length, int fid, short name_len, byte pad1[]) {
		super();
		this.major_opcode = major_opcode;
		this.pad0 = pad0;
		this.length = length;
		this.fid = fid;
		this.name_len = name_len;
		if ((pad1.length != this.pad1.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad1 = pad1;
	}
	public xcb_open_font_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_open_font_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_open_font_request_t implements Structure.ByValue {
		
	};
}