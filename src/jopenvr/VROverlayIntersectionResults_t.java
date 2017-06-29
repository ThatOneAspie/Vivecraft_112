package jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VROverlayIntersectionResults_t extends AlignedStructure {
	public HmdVector3_t vPoint;
	public HmdVector3_t vNormal;
	public HmdVector2_t vUVs;
	public float fDistance;
	public VROverlayIntersectionResults_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("vPoint", "vNormal", "vUVs", "fDistance");
	}
	public VROverlayIntersectionResults_t(HmdVector3_t vPoint, HmdVector3_t vNormal, HmdVector2_t vUVs, float fDistance) {
		super();
		this.vPoint = vPoint;
		this.vNormal = vNormal;
		this.vUVs = vUVs;
		this.fDistance = fDistance;
	}
	public VROverlayIntersectionResults_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VROverlayIntersectionResults_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VROverlayIntersectionResults_t implements Structure.ByValue {
		
	};
}