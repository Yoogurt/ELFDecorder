/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;

public class SMLAL_A8_626 extends ParseSupport {

	public static final SMLAL_A8_626 INSTANCE = new SMLAL_A8_626();

	@Override
	protected String getOpCode(int data) {
		int n = getShiftInt(data, 5, 1);
		int m = getShiftInt(data, 4, 1);

		String opCode = "SMLAL";

		if (n == 0b0)
			opCode += "B";
		else
			opCode += "T";

		if (m == 0b0)
			opCode += "B";
		else
			opCode += "T";

		return opCode;
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 12, 4);
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 8, 4);
	}

	@Override
	protected int getRm(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getShift(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	protected boolean shifterRegister() {
		return true;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}