/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import static com.marik.vm.OS.*;
import static com.marik.vm.Register.*;
import static com.marik.arm.OpCode.OpUtil.*;
import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;

public class ASR_A8_330 extends ParseSupport {

	public static final ASR_A8_330 INSTANCE = new ASR_A8_330();

	@Override
	protected String getOpCode() {
		return "ASRS";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 0, 3));
	}

	@Override
	protected String getRm(int data) {
		int imm5 = getShiftInt(data, 6, 5);
		if (imm5 == 0)
			imm5 = 0x20;
		return parseRegister(getShiftInt(data, 3, 3)) + " , #" + imm5;
	}

	@Override
	protected void performExecuteCommand() {
	}
}