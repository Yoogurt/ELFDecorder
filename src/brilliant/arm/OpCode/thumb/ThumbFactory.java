package brilliant.arm.OpCode.thumb;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.factory.ParseTemplate;
import brilliant.arm.OpCode.thumb.instructionSet16.Thumb16Factory;
import brilliant.arm.OpCode.thumb.instructionSet32.Thumb32Factory;

public class ThumbFactory {

	public static final ParseTemplate parse(int data, boolean halfword) {

		if (halfword)
			switch (getShiftInt(data, 11, 5)) {
			case 0b11101:
			case 0b11110:
			case 0b11111:
				return null;
			default:
				return Thumb16Factory.parse(data);
			}
		else
			return Thumb32Factory.parse(data);
	}
}
