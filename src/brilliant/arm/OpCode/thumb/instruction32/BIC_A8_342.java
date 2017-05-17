/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;

public class BIC_A8_342 extends ParseSupport {

	public static final BIC_A8_342 INSTANCE = new BIC_A8_342();

	@Override
	protected String getOpCode(int data) {
		return "BIC";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 8, 4);
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getRm(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	protected int getS(int data) {
		return getShiftInt(data, 20, 1);
	}

	@Override
	protected int getType(int data) {
		return getShiftInt(data, 4, 2);
	}

	@Override
	protected int getShift(int data) {
		int imm3 = getShiftInt(data, 12, 3);
		int imm2 = getShiftInt(data, 6, 2);
		return imm3 << 2 | imm2;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}