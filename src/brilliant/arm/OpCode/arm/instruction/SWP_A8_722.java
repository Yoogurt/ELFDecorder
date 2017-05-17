/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;

public class SWP_A8_722 extends ParseSupport {

	public static final SWP_A8_722 INSTANCE = new SWP_A8_722();

	@Override
	protected String getOpCode(int data) {
		int B = getShiftInt(data, 22, 1);
		return B == 0b1 ? "SWPB" : "SWP";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 12, 4);
	}

	@Override
	protected int getRn(int data) {
		return -1;
	}

	@Override
	protected int getRm(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	protected int getS(int data) {
		return -1;
	}

	@Override
	protected int getType(int data) {
		return -1;
	}

	@Override
	protected int getShift(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected boolean shifterMenory() {
		return true;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}