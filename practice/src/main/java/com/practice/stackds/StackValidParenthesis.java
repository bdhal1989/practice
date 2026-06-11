package com.practice.stackds;

import java.util.Stack;

public class StackValidParenthesis {
	private boolean isValid(String check) {
		Stack<Character> stack = new Stack<>();
			for(char c :check.toCharArray()) {
				if(c=='('|| c=='{' || c=='[') {
					stack.push(c);
				}
				else {
					if(stack.isEmpty())
						return false;
					char popch = stack.pop();
					if((popch =='(' && c!=')')  || 
							(popch =='{' && c!='}') ||
							(popch =='[' && c!=']')) {
						return false;
					}
				}
				
			}
			
		return stack.isEmpty();
	}
	
	public static  void main(String [] args) {
		StackValidParenthesis s =new StackValidParenthesis();
		System.out.println(s.isValid("{}(]"));
	}
}
