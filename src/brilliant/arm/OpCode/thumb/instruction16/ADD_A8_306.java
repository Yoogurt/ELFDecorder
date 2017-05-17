/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction16;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;
import brilliant.arm.OpCode.thumb.instruction16.support.ParseSupport;

public class ADD_A8_306 extends ParseSupport {

	public static final ADD_A8_306 INSTANCE = new ADD_A8_306();

	@Override
	public String parse(int data) {

		int head = getShiftInt(data, 11, 5);
		if (head == 0b00110)
			return super.parse(data);
		head = getShiftInt(data, 9, 7);
		if (head == 0b0001110)
			return EncodingT1(data);

		return error(data);
	}

	private String EncodingT1(int data) {
		int Rd = getShiftInt(data, 0, 3);
		int Rn = getShiftInt(data, 3, 3);
		int imm3 = getShiftInt(data, 6, 3);

		if (imm3 != 0) {

			StringBuilder sb = new StringBuilder("ADDS ");
			sb.append(parseRegister(Rd)).append(" , ")
					.append(parseRegister(Rn)).append(" , #").append(imm3);
			return sb.toString();

		} else {

			StringBuilder sb = new StringBuilder("MOVS ");
			sb.append(parseRegister(Rd)).append(" , ")
					.append(parseRegister(Rn));
			return sb.toString();

		}
	}

	@Override
	protected String getOpCode(int data) {
		return "ADDS";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 8, 3));
	}

	@Override
	protected String getRm(int data) {
		return "#" + getShiftInt(data, 0, 8);
	}

	@Override
	public void performExecuteCommand(int data) {
	}
}