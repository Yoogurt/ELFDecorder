/*-------------------------------
 Auto Generated By AutoGenetate
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;
import static com.marik.arm.OpCode.OpUtil.*;

public class LDM_A8_396 extends ParseSupport {
	public static final LDM_A8_396 INSTANCE = new LDM_A8_396();

	@Override
	protected String getOpCode() {
		return "LDM";
	}

	@Override
	protected String getRn(int data) {
		int Rn = getShiftInt(data, 8, 3);
		int registerList = getShiftInt(data, 0, 8);

		if (!isRigisterInRegisterList(Rn, registerList))
			return parseRegister(Rn) + "!";
		return parseRegister(Rn);
	}

	@Override
	protected String getRm(int data) {
		return parseRigisterBit(getShiftInt(data, 0, 8), getShiftInt(data, 8, 3));
	}

	@Override
	protected boolean isRmRegisterList() {
		return true;
	}

}
