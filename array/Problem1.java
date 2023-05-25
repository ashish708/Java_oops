package com.example.java.oops.array;

public class Problem1 {

		static int teamFormation(int N) {
			int result = -404;

			if (N < 2) {
				// Not enough people to form a team
				result = 0;
			} else {
				int numTeams = N;
				result = factorial(numTeams) / (factorial(numTeams / 2) * factorial(numTeams - numTeams / 2))/2;
			}

			return result;
		}

		static int factorial(int n) {
			if (n == 0) {
				return 1;
			} else {
				return n * factorial(n - 1);
			}
		}
		public static void main(String[] args) {
			int N = 4;
			int result = teamFormation(N);
			System.out.println(); // Expected output: 3
		}
}

