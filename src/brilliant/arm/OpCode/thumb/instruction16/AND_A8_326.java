/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction16;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;
import brilliant.arm.OpCode.thumb.instruction16.support.ParseSupport;

public class AND_A8_326 extends ParseSupport {

	public static final AND_A8_326 INSTANCE = new AND_A8_326();

	@Override
	protected String getOpCode(int data) {
		return "ANDS";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 0, 3));
	}

	@Override
	protected String getRm(int data) {
		return parseRegister(getShiftInt(data, 3, 3));
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}