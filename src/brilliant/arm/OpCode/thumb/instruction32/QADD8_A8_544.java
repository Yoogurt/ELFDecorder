/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;

public class QADD8_A8_544 extends ParseSupport {

	public static final QADD8_A8_544 INSTANCE = new QADD8_A8_544();

	@Override
	protected String getOpCode(int data) {
		return "QADD8";
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
	public void performExecuteCommand(int data) {
	}

}