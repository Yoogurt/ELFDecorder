/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import static brilliant.arm.OpCode.factory.OpUtil.armExpandImm;
import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;
import brilliant.arm.OpCode.factory.Remotable;
import brilliant.elf.vm.Register;

public class ADR_A8_322 extends ParseSupport implements Remotable {

	public static final ADR_A8_322 INSTANCE = new ADR_A8_322();

	@Override
	protected String getOpCode(int data) {
		return "ADR";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 12, 4);
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getRm(int data) {
		return -1;
	}

	@Override
	protected int getS(int data) {
		return getShiftInt(data, 20, 1);
	}

	@Override
	protected int getType(int data) {
		return -1;
	}

	@Override
	protected int getShift(int data) {
		boolean before = getShiftInt(data, 21, 4) == 0b0010;
		return before ? -armExpandImm(getShiftInt(data, 0, 12)) : armExpandImm(getShiftInt(data, 0, 12));
	}

	@Override
	protected String getCommnet(int data) {
		if (Register.PC >= 0)
			return " @" + Integer.toHexString(Register.PC);
		return super.getCommnet(data);
	}

	@Override
	public void performExecuteCommand(int data) {
	}

	@Override
	public int offset(int data) {
		boolean before = getShiftInt(data, 21, 4) == 0b0010;
		return before ? -armExpandImm(getShiftInt(data, 0, 12)) : armExpandImm(getShiftInt(data, 0, 12));
	}

}