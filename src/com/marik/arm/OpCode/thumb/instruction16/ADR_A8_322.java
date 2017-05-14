/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb.instruction16;

import static com.marik.arm.OpCode.OpUtil.getShiftInt;
import static com.marik.arm.OpCode.OpUtil.parseRegister;

import com.marik.arm.OpCode.thumb.instruction16.support.ParseSupport;

public class ADR_A8_322 extends ParseSupport {
	public static final ADR_A8_322 INSTANCE = new ADR_A8_322();

	@Override
	protected String getOpCode(int data) {
		return "ADR";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 8, 3));
	}

	@Override
	protected String getRm(int data) {
		return "" + (getShiftInt(data, 0, 8) << 2);
	}

	@Override
	public void performExecuteCommand(int data) {
	}
}