package com.GreatLearning3lab1p;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	    String input1 = "( [ [ { } ] ] )";
	    String input2 = "( [ [ { } ] ] ) )";

	        if (BracketChecker.isBalanced(input1)) {
	            System.out.println("The entered String has Balanced Brackets");
	        } else {
	            System.out.println("The entered String does not contain Balanced Brackets");
	        }

	        if (BracketChecker.isBalanced(input2)) {
	            System.out.println("The entered String has Balanced Brackets");
	        } else {
	            System.out.println("The entered String does not contain Balanced Brackets");
	        }
	    }
	
	





	}


