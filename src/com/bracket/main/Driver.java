package com.bracket.main;
import com.bracket.service.*;
public class Driver {

	public static void main(String[] args) {
		BalancingBrackets balancingBrackets=new BalancingBrackets();
		String bracketExpression ="([[{}]]))";
		
		Boolean result;
		result =balancingBrackets.checkingBracketsBalanced(bracketExpression);
		
		if(result) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered String do not contain Balanced Brackets");
		}
	}
}
