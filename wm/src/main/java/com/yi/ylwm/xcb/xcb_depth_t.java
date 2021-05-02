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
public class xcb_depth_t extends Structure {
	public byte depth;
	public byte pad0;
	public short visuals_len;
	/** C type : uint8_t[4] */
	public byte[] pad1 = new byte[4];
	public xcb_depth_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("depth", "pad0", "visuals_len", "pad1");
	}
	/** @param pad1 C type : uint8_t[4] */
	public xcb_depth_t(byte depth, byte pad0, short visuals_len, byte pad1[]) {
		super();
		this.depth = depth;
		this.pad0 = pad0;
		this.visuals_len = visuals_len;
		if ((pad1.length != this.pad1.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad1 = pad1;
	}
	public xcb_depth_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_depth_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_depth_t implements Structure.ByValue {
		
	};
}
