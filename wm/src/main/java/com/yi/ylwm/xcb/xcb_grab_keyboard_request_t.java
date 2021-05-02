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
public class xcb_grab_keyboard_request_t extends Structure {
	public byte major_opcode;
	public byte owner_events;
	public short length;
	/** C type : xcb_window_t */
	public int grab_window;
	/** C type : xcb_timestamp_t */
	public int time;
	public byte pointer_mode;
	public byte keyboard_mode;
	/** C type : uint8_t[2] */
	public byte[] pad0 = new byte[2];
	public xcb_grab_keyboard_request_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("major_opcode", "owner_events", "length", "grab_window", "time", "pointer_mode", "keyboard_mode", "pad0");
	}
	/**
	 * @param grab_window C type : xcb_window_t<br>
	 * @param time C type : xcb_timestamp_t<br>
	 * @param pad0 C type : uint8_t[2]
	 */
	public xcb_grab_keyboard_request_t(byte major_opcode, byte owner_events, short length, int grab_window, int time, byte pointer_mode, byte keyboard_mode, byte pad0[]) {
		super();
		this.major_opcode = major_opcode;
		this.owner_events = owner_events;
		this.length = length;
		this.grab_window = grab_window;
		this.time = time;
		this.pointer_mode = pointer_mode;
		this.keyboard_mode = keyboard_mode;
		if ((pad0.length != this.pad0.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad0 = pad0;
	}
	public xcb_grab_keyboard_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_grab_keyboard_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_grab_keyboard_request_t implements Structure.ByValue {
		
	};
}
