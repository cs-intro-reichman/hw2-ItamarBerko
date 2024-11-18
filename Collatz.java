// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		for (int seed=1; seed <= N; seed++) {
			int steps=1;
			int currentNum = seed;
			do {										//in case seed = 1 we will use do while so it will enter the first loop
				if (mode.equals("v"))
					System.out.print(currentNum + " ");
				if (currentNum%2==0)
					currentNum /= 2;
				else
					currentNum = currentNum * 3 + 1;
				steps++;
			} while (currentNum != 1);
			if (mode.equals("v"))
				System.out.println(currentNum + " (" + steps + ")");		//printing of the last number which is 1 and the steps number
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
