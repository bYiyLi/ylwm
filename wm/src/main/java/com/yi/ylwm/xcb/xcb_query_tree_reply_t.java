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
public class xcb_query_tree_reply_t extends Structure {
	public byte response_type;
	public byte pad0;
	public short sequence;
	public int length;
	/** C type : xcb_window_t */
	public int root;
	/** C type : xcb_window_t */
	public int parent;
	public short children_len;
	/** C type : uint8_t[14] */
	public byte[] pad1 = new byte[14];
	public xcb_query_tree_reply_t() {
		super();
	}
	@Override
protected List<String> getFieldOrder(){
		return Arrays.asList("response_type", "pad0", "sequence", "length", "root", "parent", "children_len", "pad1");
	}
	/**
	 * @param root C type : xcb_window_t<br>
	 * @param parent C type : xcb_window_t<br>
	 * @param pad1 C type : uint8_t[14]
	 */
	public xcb_query_tree_reply_t(byte response_type, byte pad0, short sequence, int length, int root, int parent, short children_len, byte pad1[]) {
		super();
		this.response_type = response_type;
		this.pad0 = pad0;
		this.sequence = sequence;
		this.length = length;
		this.root = root;
		this.parent = parent;
		this.children_len = children_len;
		if ((pad1.length != this.pad1.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad1 = pad1;
	}
	public xcb_query_tree_reply_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_query_tree_reply_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_query_tree_reply_t implements Structure.ByValue {
		
	};
}
