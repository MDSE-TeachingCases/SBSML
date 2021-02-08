package at.ac.tuwien.big.sbsml.codegen.xtend

class NameUtil {
	
	/**
	 * Returns whitespaces.
	 */
	static def ws(String str) {
		return str.replace(" ", "")
	}
	
	/**
	 * Creates a camelcase variableName
	 */
	static def toVar(String str) {
		val name = ws(str)
		return name.charAt(0).toString.toLowerCase + name.substring(1);
	}
	
	/**
	 * Creates the class name.
	 */
	static def toClass(String str) {
		val name = ws(str)
		return name.charAt(0).toString.toUpperCase + name.substring(1);
	}
	
	/**
	 * Creates the package name.
	 */
	static def toPack(String str) {
		return str.replace(" ", "").toLowerCase
	}
	
}