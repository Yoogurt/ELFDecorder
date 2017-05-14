/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;
import static brilliant.arm.OpCode.OpUtil.*;
import static brilliant.elf.vm.OS.*;

public class STM_A8_664 extends ParseSupport {

	public static final STM_A8_664 INSTANCE = new STM_A8_664();

	@Override
	protected String getOpCode(int data) {
		int Rn = getShiftInt(data, 16, 4);
		if (Rn == SP)
			return "STMEA";
		return "STMIA";
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getShift(int data) {
		return getShiftInt(data, 0, 16);
	}
	
	@Override
	protected boolean shifterRegisterList() {
		return true;
	}

	@Override
	protected boolean isRnwback(int data) {
		return getShiftInt(data, 21, 1) == 0b1;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}