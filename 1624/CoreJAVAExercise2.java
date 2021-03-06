package com.htc.corejava;

public class CoreJAVAExercise2 {

	public static void main(String[] args) {
		
		CoreJAVAExercise2 coreJAVAExercise2 = new CoreJAVAExercise2();
		coreJAVAExercise2.printSeries(4, 20);
		System.out.println();
		coreJAVAExercise2.printSeries2(1, 20);
	}
	
	private void printSeries(int increment, int numOfTimes) {
		
		int i=1;
		int j=-3;
		int counter;
		
		for(counter = 1; counter < numOfTimes; counter++) {
			
			System.out.print(i + ",");
			i= i + increment;
			
			if(counter == numOfTimes - 1) {
				System.out.print(j);
			}else {
				System.out.print(j + ",");
				j = j - increment;
			}
		}
			
	}

private void printSeries2(int increment, int numOfTimes) {
		
		int i=1;
		
		int counter;
		
		for(counter = 1; counter < numOfTimes; counter++) {
			if(counter == numOfTimes - 1) {
				System.out.print(1 + "/" + i);
			}else {
				System.out.print(1 + "/" + i + ",");
				i= i + increment;
			}
		}
			
	}
}
