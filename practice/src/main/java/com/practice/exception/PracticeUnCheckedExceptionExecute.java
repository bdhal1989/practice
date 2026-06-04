package com.practice.exception;

import java.util.Map;

public class PracticeUnCheckedExceptionExecute {

	public static void main(String args[]) {
		PracticeUnCheckedExceptionExecute p = new PracticeUnCheckedExceptionExecute();
		try {
			p.getException();
		} catch (PracticeUnCheckedException e) {
			
			System.out.println(e.getErrors());;
		}
	}
	//no need of throws runtime exception
	private void getException()   {
		throw new PracticeUnCheckedException("INVALID_WORKFLOW", Map.of("workflow", "ActionId required"));
	}

}
