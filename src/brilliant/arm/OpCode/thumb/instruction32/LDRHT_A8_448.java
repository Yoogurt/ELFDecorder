/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;
import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;

public class LDRHT_A8_448 extends ParseSupport {

	public static final LDRHT_A8_448 INSTANCE = new LDRHT_A8_448();

	@Override
	public String parse(int data) {

		StringBuilder sb = new StringBuilder("LDRHT.W ");
		int Rt = getShiftInt(data, 12, 4);
		int Rn = getShiftInt(data, 16, 4);
		int imm8 = getShiftInt(data, 0, 8);

		sb.append(parseRegister(Rt));
		sb.append(" , [");
		sb.append(parseRegister(Rn));
		sb.append(" , #");
		sb.append(imm8);
		sb.append("]");

		return sb.toString();
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}