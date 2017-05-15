/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;
import static brilliant.elf.vm.OS.*;
import static brilliant.elf.vm.Register.*;
import static brilliant.arm.OpCode.OpUtil.*;

public class SMLALD_A8_628 extends ParseSupport {

	public static final SMLALD_A8_628 INSTANCE = new SMLALD_A8_628();

	@Override
	protected String getOpCode(int data) {
		int swap = getShiftInt(data, 4, 1);
		if (swap == 0b0)
			return "SMLALD";
		else
			return "SMLALDX";
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