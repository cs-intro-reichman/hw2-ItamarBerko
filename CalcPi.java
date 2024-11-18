// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int rep = Integer.parseInt(args[0]);
		double sum = 0;
		for (int i = 0; i < rep; i++) {
			if (i%2==0)
				sum += (double)1/(i*2 + 1);
			else
				sum -= (double)1/(i*2 + 1);
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (sum*4));
	}
}
