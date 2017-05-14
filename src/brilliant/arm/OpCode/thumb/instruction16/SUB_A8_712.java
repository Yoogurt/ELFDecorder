/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
/*-------------------------------
 Auto Generated By AutoGenetate.java
 Don't remove or modify
 License GPL/GNU
 -------------------------------*/
package brilliant.arm.OpCode.thumb.instruction16;

import static brilliant.arm.OpCode.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.OpUtil.parseRegister;
import brilliant.arm.OpCode.thumb.instruction16.support.ParseSupport;

public class SUB_A8_712 extends ParseSupport {

	public static final SUB_A8_712 INSTANCE = new SUB_A8_712();

	@Override
	protected String getOpCode(int data) {
		return "SUBS";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 0, 3));
	}

	@Override
	protected String getRm(int data) {
		return parseRegister(getShiftInt(data, 3, 3)) + " , "
				+ parseRegister(getShiftInt(data, 6, 3));
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}