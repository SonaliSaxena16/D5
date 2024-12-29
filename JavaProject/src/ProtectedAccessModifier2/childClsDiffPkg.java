package ProtectedAccessModifier2;

import ProtectedAccessModifier.ParentA;

public class childClsDiffPkg extends ParentA{
	
	public static void main(String[] args) {
		
		childClsDiffPkg ce = new childClsDiffPkg();
		ce.msg();
	}
	
}
