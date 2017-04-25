/*-------------------------------
 Auto Generated By AutoGenetate
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;
import static com.marik.arm.OpCode.OpUtil.*;

import com.marik.arm.OpCode.CondFactory;

public class B_A8_334 extends ParseSupport {
	public static final B_A8_334 INSTANCE = new B_A8_334();

	public String parse(int data) {

		int head = getShiftInt(data, 12, 4);
		if (head == 0b1101)
			return decodeEncodingT1(data);
		else {
			head = getShiftInt(data, 11, 5);
			if (head == 0b11100)
				return decodeEncodingT2(data);
		}
		throw new IllegalArgumentException("Unable to decode instruction " + Integer.toBinaryString(data));
	}

	private String decodeEncodingT1(int data) {
		int cond = getShiftInt(data, 8, 4);

		if (cond == 0b1110)
			return UDF_A8_758.INSTANCE.parse(data);

		if (cond == 0b1111)
			return SVC_A8_720.INSTANCE.parse(data);

		StringBuilder sb = new StringBuilder("B");

		sb.append(CondFactory.parse(cond));

		sb.append(" ");

		sb.append(getShiftInt(data, 0, 8));

		return sb.toString();

	}

	private String decodeEncodingT2(int data) {
		StringBuilder sb = new StringBuilder("B ");

		int imm11 = getShiftInt(data, 0, 11);

		return sb.append(signExtend(imm11, 11) << 1).toString();
	}

	@Override
	protected String getOpCode() {
		return null;
	}

	@Override
	protected String getRn(int data) {
		return null;
	}

	@Override
	protected String getRm(int data) {
		return null;
	}
}
