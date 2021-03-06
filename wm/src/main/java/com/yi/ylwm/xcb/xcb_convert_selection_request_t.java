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
public class xcb_convert_selection_request_t extends Structure {
	public byte major_opcode;
	public byte pad0;
	public short length;
	/** C type : xcb_window_t */
	public int requestor;
	/** C type : xcb_atom_t */
	public int selection;
	/** C type : xcb_atom_t */
	public int target;
	/** C type : xcb_atom_t */
	public int property;
	/** C type : xcb_timestamp_t */
	public int time;
	public xcb_convert_selection_request_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("major_opcode", "pad0", "length", "requestor", "selection", "target", "property", "time");
	}
	/**
	 * @param requestor C type : xcb_window_t<br>
	 * @param selection C type : xcb_atom_t<br>
	 * @param target C type : xcb_atom_t<br>
	 * @param property C type : xcb_atom_t<br>
	 * @param time C type : xcb_timestamp_t
	 */
	public xcb_convert_selection_request_t(byte major_opcode, byte pad0, short length, int requestor, int selection, int target, int property, int time) {
		super();
		this.major_opcode = major_opcode;
		this.pad0 = pad0;
		this.length = length;
		this.requestor = requestor;
		this.selection = selection;
		this.target = target;
		this.property = property;
		this.time = time;
	}
	public xcb_convert_selection_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_convert_selection_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_convert_selection_request_t implements Structure.ByValue {
		
	};
}
