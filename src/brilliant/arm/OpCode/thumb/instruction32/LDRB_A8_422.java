/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;
import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;

public class LDRB_A8_422 extends ParseSupport {

	public static final LDRB_A8_422 INSTANCE = new LDRB_A8_422();

	@Override
	public String parse(int data) {

		StringBuilder sb = new StringBuilder("LDRB.W ");
		int Rt = getShiftInt(data, 12, 4);
		int Rn = getShiftInt(data, 16, 4);
		int Rm = getShiftInt(data, 0, 4);
		int imm2 = getShiftInt(data, 4, 2);

		sb.append(parseRegister(Rt));
		sb.append(" , [");
		sb.append(parseRegister(Rn));
		sb.append(" , ");
		sb.append(parseRegister(Rm));
		sb.append(" , LSL #");
		sb.append(imm2);
		sb.append("]");

		return sb.toString();
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}