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
public class xcb_selection_request_event_t extends Structure {
	public byte response_type;
	public byte pad0;
	public short sequence;
	/** C type : xcb_timestamp_t */
	public int time;
	/** C type : xcb_window_t */
	public int owner;
	/** C type : xcb_window_t */
	public int requestor;
	/** C type : xcb_atom_t */
	public int selection;
	/** C type : xcb_atom_t */
	public int target;
	/** C type : xcb_atom_t */
	public int property;
	public xcb_selection_request_event_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("response_type", "pad0", "sequence", "time", "owner", "requestor", "selection", "target", "property");
	}
	/**
	 * @param time C type : xcb_timestamp_t<br>
	 * @param owner C type : xcb_window_t<br>
	 * @param requestor C type : xcb_window_t<br>
	 * @param selection C type : xcb_atom_t<br>
	 * @param target C type : xcb_atom_t<br>
	 * @param property C type : xcb_atom_t
	 */
	public xcb_selection_request_event_t(byte response_type, byte pad0, short sequence, int time, int owner, int requestor, int selection, int target, int property) {
		super();
		this.response_type = response_type;
		this.pad0 = pad0;
		this.sequence = sequence;
		this.time = time;
		this.owner = owner;
		this.requestor = requestor;
		this.selection = selection;
		this.target = target;
		this.property = property;
	}
	public xcb_selection_request_event_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_selection_request_event_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_selection_request_event_t implements Structure.ByValue {
		
	};
}
