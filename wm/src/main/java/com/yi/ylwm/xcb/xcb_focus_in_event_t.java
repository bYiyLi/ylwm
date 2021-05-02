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
public class xcb_focus_in_event_t extends Structure {
	public byte response_type;
	public byte detail;
	public short sequence;
	/** C type : xcb_window_t */
	public int event;
	public byte mode;
	/** C type : uint8_t[3] */
	public byte[] pad0 = new byte[3];
	public xcb_focus_in_event_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("response_type", "detail", "sequence", "event", "mode", "pad0");
	}
	/**
	 * @param event C type : xcb_window_t<br>
	 * @param pad0 C type : uint8_t[3]
	 */
	public xcb_focus_in_event_t(byte response_type, byte detail, short sequence, int event, byte mode, byte pad0[]) {
		super();
		this.response_type = response_type;
		this.detail = detail;
		this.sequence = sequence;
		this.event = event;
		this.mode = mode;
		if ((pad0.length != this.pad0.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad0 = pad0;
	}
	public xcb_focus_in_event_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_focus_in_event_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_focus_in_event_t implements Structure.ByValue {
		
	};
}
