/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;

public class NOP extends ParseSupport {

	public static final NOP INSTANCE = new NOP();

	@Override
	protected String getOpCode(int data) {
		return "NOP";
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}