/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction16;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;
import brilliant.arm.OpCode.thumb.instruction16.support.ParseSupport;

public class LDR_A8_412 extends ParseSupport {

	public static final LDR_A8_412 INSTANCE = new LDR_A8_412();

	@Override
	protected String getOpCode(int data) {
		return "LDR";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 0, 3));
	}

	@Override
	protected String getRm(int data) {
		return parseRegister(getShiftInt(data, 3, 3)) + " , "
				+ parseRegister(getShiftInt(data, 6, 3));
	}

	@Override
	protected boolean isRmMenory() {
		return true;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}
