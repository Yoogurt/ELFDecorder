/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.factory.TypeFactory;
import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;

public class UXTB_A8_812 extends ParseSupport {

	public static final UXTB_A8_812 INSTANCE = new UXTB_A8_812();

	@Override
	protected String getOpCode(int data) {
		return "UXTB";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 8, 4);
	}

	@Override
	protected int getRm(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	protected int getType(int data) {
		return TypeFactory.ROR; // default ror
	}

	@Override
	protected int getShift(int data) {
		return getShiftInt(data, 4, 2) << 3;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}