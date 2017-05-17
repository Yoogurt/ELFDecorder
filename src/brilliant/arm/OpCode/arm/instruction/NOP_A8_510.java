/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;

public class NOP_A8_510 extends ParseSupport {

	public static final NOP_A8_510 INSTANCE = new NOP_A8_510();

	@Override
	protected String getOpCode(int data) {
		return "NOP";
	}

	@Override
	protected int getRd(int data) {
		return -1;
	}

	@Override
	protected int getRn(int data) {
		return -1;
	}

	@Override
	protected int getRm(int data) {
		return -1;
	}

	@Override
	protected int getS(int data) {
		return -1;
	}

	@Override
	protected int getType(int data) {
		return -1;
	}

	@Override
	protected int getShift(int data) {
		return 0;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}