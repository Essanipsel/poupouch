package map.element.motionless;


public abstract class MotionlessElements {
	public static final MotionlessElement	BONE_ANGLE									= new Bone_Angle();
	public static final MotionlessElement	BONE_V							= new Bone_V();
	public static final MotionlessElement	LAND									= new Land();
	public static final MotionlessElement	BONE_H							= new Bone_H();
	

	private static MotionlessElement			motionlessElements[]	= { LAND, BONE_H,BONE_V,BONE_ANGLE };

	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getFileSymbol() == fileSymbol) {
				return motionlessElement;
			}
		}
		return LAND;
	}
}