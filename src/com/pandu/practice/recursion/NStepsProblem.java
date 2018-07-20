package com.pandu.practice.recursion;

public class NStepsProblem {

	public static void main(String[] args) {
		System.out.println(computeNSteps(5));

	}

	private static int computeNSteps(int i) {
		
		if( i == 1) 
			return 1;
		if( i == 2 )
			return 2;
		if(i == 3)
			return 4;
		
		
		System.out.println(i);
		return  computeNSteps(i-1) +  computeNSteps(i- 2) + computeNSteps(i-3);
	}

}
