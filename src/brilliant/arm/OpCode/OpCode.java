package brilliant.arm.OpCode;

import brilliant.arm.OpCode.arm.instructionSet.ArmFactory;
import brilliant.arm.OpCode.thumb.ThumbFactory;
import brilliant.elf.vm.Register;
import brilliant.elf.vm.Register.RegisterIllegalStateExeception;

public class OpCode {

	public static void decode(int[] data) {
		switch (Register.getT()) {
		case 0:
			decodeArm(data);
			break;
		case 1:
			decodeThumb(data);
			break;
		default:
			throw new RegisterIllegalStateExeception(
					"Flag Rigister has accessed an unpredictable state");
		}
	}

	private static void decodeArm(int[] data) {
		for (int i : data)
			System.out.println(ArmFactory.parse(i).parse(i));
	}

	public static void decodeThumb(int[] data) {

		int length = data.length;
		for (int i = 0; i < length; i++) {

			ParseTemplate opcode = ThumbFactory.parse(data[i], true);

			if (opcode != null)
				System.out.println(opcode.parse(data[i]));
			else {

				if (i + 1 >= length)
					throw new IllegalArgumentException(
							"Unable to decode instruction "
									+ Integer.toBinaryString(data[i]));

				int command = data[i] << 16 | data[++i];
				opcode = ThumbFactory.parse(command, false);
				if (opcode != null)
					System.out.println(opcode.parse(command));
				else
					throw new IllegalArgumentException(
							"Unable to decode instruction "
									+ Integer.toBinaryString(command));
			}
		}
	}

	public static ParseTemplate decodeThumb32(int data) {
		throw new UnsupportedOperationException("Thumb 32 do not implements");
	}

	public static void main(String[] args) {
		// access thumb mode
		// decodeArm1(0xea00002a);
		int comm1 = 0b1111100010111111;
		int comm2 = 0b0000000000000011;
		decodeThumb1(comm1, comm2);
		System.out.println("0x" + Integer.toHexString(comm1) + "  0x"
				+ Integer.toHexString(comm2));
	}

	private static void decodeArm1(int... opcode) {
		Register.setT(0);
		decode(opcode);
	}

	private static void decodeThumb1(int... opcode) {
		Register.setT(1);
		decode(opcode);
	}
}