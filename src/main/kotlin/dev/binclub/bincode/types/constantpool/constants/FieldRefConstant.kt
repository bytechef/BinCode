package dev.binclub.bincode.types.constantpool.constants

import dev.binclub.bincode.types.constantpool.Constant
import dev.binclub.bincode.types.constantpool.ConstantPoolReference

data class FieldRefConstant(
	val classRef: ConstantPoolReference<ClassConstant>,
	val nameAndTypeRef: ConstantPoolReference<NameAndTypeConstant>
): Constant() {
	override fun toString(): String =
		"FieldRef: (Clazz: $classRef, NameAndType: $nameAndTypeRef)"
}
