// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int N = Integer.parseInt(args[0]);
		int i = 0;
		int greaterThan = 0;
		int lesserEqThan = 0;
		while (i < N) {
			if (Math.random() > 0.5) {
				greaterThan++;
			}
			else {
				lesserEqThan++;
			}
			i++;
		}
		System.out.println("> 0.5: " + greaterThan + " times");
		System.out.println("<= 0.5: " + lesserEqThan + " times");
		if (greaterThan!=0 && lesserEqThan!=0) {
			System.out.println("Ratio: " + ((greaterThan*1.0) / (lesserEqThan*1.0)));
		}
	}
}
