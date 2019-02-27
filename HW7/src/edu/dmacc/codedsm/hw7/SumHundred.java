package edu.dmacc.codedsm.hw7;

import java.util.Scanner;

public class SumHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int priorResult = 0;
		int finalResult = 0;
		int iteration = 0;
		int holdresult = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Input");
		int firstInput = scan.nextInt();
		System.out.println("Enter second Input");
		int secondInput = scan.nextInt();
		scan.close();

		for (iteration = 1; holdresult < 100; iteration++) {
			holdresult = addRoutine(firstInput, secondInput, priorResult);
			priorResult = holdresult;

		}

		finalResult = holdresult;

		output(finalResult, iteration);

	}

	private static void output(int finalResult, int iteration) {

		System.out.println("The first result greater than 100 was "
				+ finalResult + " and took " + iteration + " to complete");

	}

	private static int addRoutine(int firstInput, int secondInput,
			int priorResult) {

		return (firstInput + secondInput + priorResult);

	}

}
