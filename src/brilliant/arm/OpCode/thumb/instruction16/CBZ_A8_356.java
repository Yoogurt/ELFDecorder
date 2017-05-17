/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction16;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;
import brilliant.arm.OpCode.thumb.instruction16.support.ParseSupport;
import brilliant.elf.vm.Register;

public class CBZ_A8_356 extends ParseSupport {

	public static final CBZ_A8_356 INSTANCE = new CBZ_A8_356();

	@Override
	protected String getOpCode(int data) {

		int n = getShiftInt(data, 11, 1);

		if (n == 0b1)
			return "CBNZ";
		return "CBZ";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 0, 3));
	}

	@Override
	protected String getRm(int data) {
		return "#" + (getShiftInt(data, 3, 5) << 1);
	}

	@Override
	protected String getComment(int data) {
		if (Register.PC < 0)
			return null;
		return "@"
				+ Integer.toHexString(Register.PC
						+ (getShiftInt(data, 3, 5) << 1));
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}