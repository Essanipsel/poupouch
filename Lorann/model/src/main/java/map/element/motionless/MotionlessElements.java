package map.element.motionless;

public abstract class MotionlessElements {
	public static final MotionLessElement BONE_ANGLE = new BoneAngle();
	public static final MotionLessElement BONE_V = new BoneV();
	public static final MotionLessElement LAND = new land();
	public static final MotionLessElement BONE_H = new BoneH();


	private static MotionLessElement motionlessElements[] = { LAND, BONE_H,BONE_V,BONE_ANGLE };

	public static MotionLessElement getFromFileSymbol(final char fileSymbol) {
		for (final MotionLessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getFileSymbol() == fileSymbol) {
				return motionlessElement;
			}
		}
		return LAND;
	}
}