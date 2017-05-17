/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;
import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;
import brilliant.arm.OpCode.factory.CondFactory;

public class LDR_A8_408 extends ParseSupport {

	public static final LDR_A8_408 INSTANCE = new LDR_A8_408();

	@Override
	public String parse(int data) {

		StringBuilder sb = new StringBuilder("LDR");
		sb.append(CondFactory.parse(getCond(data))).append(" ");

		int Rt = getShiftInt(data, 12, 4);
		int Rn = getShiftInt(data, 16, 4);
		int imm12 = getShiftInt(data, 0, 12);
		boolean index = getShiftInt(data, 24, 1) == 1;
		boolean add = getShiftInt(data, 23, 1) == 1;
		boolean wback = getShiftInt(data, 21, 1) == 1;

		sb.append(parseRegister(Rt)).append(" , [");
		sb.append(parseRegister(Rn));

		if (!index)
			sb.append("] , #");
		else
			sb.append(" , #");

		if (!add)
			sb.append("-");

		sb.append(imm12);

		if (index)
			sb.append("]");

		if (wback)
			sb.append("!");

		return sb.toString();
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}