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
public class xcb_map_request_event_t extends Structure {
	public byte response_type;
	public byte pad0;
	public short sequence;
	/** C type : xcb_window_t */
	public int parent;
	/** C type : xcb_window_t */
	public int window;
	public xcb_map_request_event_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("response_type", "pad0", "sequence", "parent", "window");
	}
	/**
	 * @param parent C type : xcb_window_t<br>
	 * @param window C type : xcb_window_t
	 */
	public xcb_map_request_event_t(byte response_type, byte pad0, short sequence, int parent, int window) {
		super();
		this.response_type = response_type;
		this.pad0 = pad0;
		this.sequence = sequence;
		this.parent = parent;
		this.window = window;
	}
	public xcb_map_request_event_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_map_request_event_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_map_request_event_t implements Structure.ByValue {
		
	};
}
