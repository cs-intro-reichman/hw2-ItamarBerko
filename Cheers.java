// Prints a crowd cheering output.

public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int numOfTimes = Integer.parseInt(args[1]);
                for(int i = 0; i < word.length(); i++) {
                        char c = word.charAt(i);
                        System.out.print("Give me ");
                        if ("AEFHILMNORSX".indexOf(c)==-1) {
                                System.out.print("a ");
                        }
                        else {
                                System.out.print("an ");
                        }
                        System.out.println(c + ": " + c + "!");
                }
                System.out.println("What does that spell?");
                for(int i = 0; i < numOfTimes; i++) {
                        System.out.println(word + "!!!");
                }
        }
}
