package com.practice.exception;

import java.util.Map;

public class PracticeCheckedExceptionExecute {

	public static void main(String args[]) {
		PracticeCheckedExceptionExecute p = new PracticeCheckedExceptionExecute();
		try {
			p.getException();
		} catch (PracticeCheckedException e) {
			
			System.out.println(e.getErrors());;
		}
	}

	//declaration of throws for checked exception (Otherwise complie time exception)
	private void getException() throws PracticeCheckedException {
		throw new PracticeCheckedException("INVALID_WORKFLOW", Map.of("workflow", "ActionId required"));
	}

}
