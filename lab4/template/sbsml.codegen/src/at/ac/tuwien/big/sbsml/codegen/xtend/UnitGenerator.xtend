package at.ac.tuwien.big.sbsml.codegen.xtend

import sbsml.Unit
import sbsml.DataType

import static at.ac.tuwien.big.sbsml.codegen.xtend.NameUtil.toClass

class UnitGenerator {
	
	public static final String UNIT_PACKAGE = "unit"
	
	private def dataType(DataType type) {
		return type === DataType.BOOL ? "boolean" :
			   type === DataType.INT ? "int" :
			   "double" ;
	}
	
	def generate(String packageName, Unit unit)
	'''
	package «packageName».unit;
	
	public class «toClass(unit.name)» {
		private «dataType(unit.type)» value;
		
		public «toClass(unit.name)»(«dataType(unit.type)» value) {
			this.value = value;
		}
		
		public «dataType(unit.type)» getValue() {
			return value;
		}
		
		@Override
		public String toString() {
			return this.value + "«IF unit.abbreviation !== null && unit.abbreviation.length > 0»«unit.abbreviation»«ENDIF»";
		}
	}
	''' 
}