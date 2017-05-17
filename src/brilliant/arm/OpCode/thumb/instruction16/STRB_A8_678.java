/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction16;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;
import brilliant.arm.OpCode.thumb.instruction16.support.ParseSupport;

public class STRB_A8_678 extends ParseSupport {

	public static final STRB_A8_678 INSTANCE = new STRB_A8_678();

	public String parse(int data) {

		StringBuilder sb = new StringBuilder("STRB ");
		int Rt = getShiftInt(data, 0, 3);
		int Rn = getShiftInt(data, 3, 3);
		int imm5 = getShiftInt(data, 6, 5);
		sb.append(parseRegister(Rt));
		sb.append(" , [");

		sb.append(parseRegister(Rn));
		sb.append(" , #");
		sb.append(imm5);

		sb.append("]");

		return sb.toString();

	}

	@Override
	public void performExecuteCommand(int data) {
	}

}