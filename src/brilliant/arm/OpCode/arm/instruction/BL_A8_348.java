/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.signExtend;
import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;
import brilliant.arm.OpCode.factory.CondFactory;

public class BL_A8_348 extends ParseSupport {

	public static final BL_A8_348 INSTANCE = new BL_A8_348();

	@Override
	public String parse(int data) {

		int cond = getShiftInt(data, 28, 4);
		if (cond != 0b1111)
			return EncodingA1(data);

		return EncodingA2(data);
	}

	private String EncodingA1(int data) {
		StringBuilder sb = new StringBuilder("BL");
		sb.append(CondFactory.parse(getCond(data)));
		sb.append(" #");

		int imm24 = getShiftInt(data, 0, 24);

		sb.append(signExtend(imm24 << 2, 24));

		return sb.toString();
	}

	private String EncodingA2(int data) {
		StringBuilder sb = new StringBuilder("BLX");

		int H = getShiftInt(data, 24, 1);
		int imm24 = getShiftInt(data, 0, 24);
		sb.append(" #");

		sb.append((imm24 << 2) | (H << 1) | 0);

		return sb.toString();
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}